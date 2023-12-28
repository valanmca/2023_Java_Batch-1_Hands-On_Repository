import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ApiService } from '../services/api.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})
export class DialogComponent{


  customerForm !: FormGroup;
actionBtn : string = "Save";


constructor(private formBuilder : FormBuilder,
  private api : ApiService,
  @Inject(MAT_DIALOG_DATA) public editData : any,
  private dialogRef : MatDialogRef<DialogComponent>){




this.customerForm = this.formBuilder.group({
    id:['',Validators.required],
    name : ['', Validators.required],
    email : ['', Validators.required],
    contact : ['', Validators.required],
    location : ['', Validators.required]
  });


  if(this.editData){
    this.actionBtn = "Update";
    this.customerForm.controls['id'].setValue(this.editData.id);
    this.customerForm.controls['name'].setValue(this.editData.name);
    this.customerForm.controls['email'].setValue(this.editData.email);
    this.customerForm.controls['contact'].setValue(this.editData.contact);
    this.customerForm.controls['location'].setValue(this.editData.location);
   
  }
}
addCustomer(){
  if(!this.editData){
    if(this.customerForm.valid){
      this.api.postCustomer(this.customerForm.value)
      .subscribe({
        next:(res) => {
          alert("Customer added successfully")
          this.customerForm.reset();
          this.dialogRef.close('save');
        },
        error:()=>{
          alert("Error while adding the Customer")
        }
      })
    }}else{
      this.updateCustomer()
    }
  }
  updateCustomer(){
    this.api.putCustomer(this.customerForm.value, this.editData.id)
    .subscribe({
      next :(res)=>{
        alert("Customer updated Successfully");
        this.customerForm.reset();
        this.dialogRef.close('update');
      },
      error:()=>
      {
        alert("error while updating the record!!");
      }
    })
  }
}
