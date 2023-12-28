import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { TMSServiceService } from '../Services/tms-service.service';
@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent{
gender = ["Male", "Female", "Transgender"];
teacherForm !: FormGroup;
actionBtn : string = "Save";

constructor(
  private formBuilder : FormBuilder, 
  private api : TMSServiceService, 
  @Inject(MAT_DIALOG_DATA) public editData : any, 
  private dialogRef : MatDialogRef<DialogComponent>){ 


this.teacherForm = this.formBuilder.group({
    name:['',Validators.required],
    id : ['', Validators.required],
    gender : ['', Validators.required],
    email : ['', Validators.required],
    qualification : ['', Validators.required],
    subject : ['', Validators.required],
    phone : ['', Validators.required]
  });

  if(this.editData){
    this.actionBtn = "Update";
    this.teacherForm.controls['name'].setValue(this.editData.name);
    this.teacherForm.controls['id'].setValue(this.editData.id);
    this.teacherForm.controls['gender'].setValue(this.editData.gender);
    this.teacherForm.controls['email'].setValue(this.editData.email);
    this.teacherForm.controls['qualification'].setValue(this.editData.qualification);
    this.teacherForm.controls['subject'].setValue(this.editData.subject);
    this.teacherForm.controls['phone'].setValue(this.editData.phone);
  }
}
addTeacher(){
  if(!this.editData){
    if(this.teacherForm.valid){
      this.api.postTeacher(this.teacherForm.value).subscribe({
        next:() => {
          alert("Teacher details added successfully")
          this.teacherForm.reset();
          this.dialogRef.close('save');
        },
        error:()=>{
          alert("Error while adding the Teacher details.")
        }
      })
    }}else{
      this.updateTeacher()
    }
  }
  updateTeacher(){
    this.api.putTeacher(this.teacherForm.value, this.editData.id).subscribe({
      next :()=>{
        alert("Teacher details updated Successfully");
        this.teacherForm.reset();
        this.dialogRef.close('update');
      },
      error:()=>
      {
        alert("error while updating the record!!");
      }
    })
  }
}