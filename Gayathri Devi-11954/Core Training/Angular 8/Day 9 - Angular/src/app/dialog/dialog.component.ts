import { Component, Inject } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';
import { StudentServiceService } from '../Services/student-service.service';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';


interface Cour{value: string;
  viewValue: string;}
@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})
export class DialogComponent {
  
  gender  = ["Male","Female","Transgender"];

  course: Cour[] = [
    {value: '0', viewValue: 'None'},
    {value: '1', viewValue: 'BCA'},
    {value: '2', viewValue: 'MCA'},
    {value: '3', viewValue: 'BE'},
  ];
  studentForm: any;
  constructor(private fromBuilder : FormBuilder,private api : StudentServiceService, 
    @Inject(MAT_DIALOG_DATA)public editDate : any,    
    private dialogRef : MatDialogRef<DialogComponent>){
    this.studentForm = this.fromBuilder.group({
      email = new FormControl('', [Validators.required, Validators.email]);
      name = new FormControl('', [Validators.required, Validators.pattern('[A-Z a-z]+')]);
      phone = new FormControl('',[Validators.required,Validators.pattern('[0-9]{10}')]);
      number = new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]);
      dob = new FormControl('',Validators.required);
      Cour = new FormControl('',Validators.required);
      genradio = new FormControl('',Validators.required);
      getNameErrorMessage(){
        if(this.name.hasError('required')){
          return "Name is required";
          } 
        return  this.name.hasError("Pattern") ? "Only alphabets are allowed": '';
          }
      getRollErrorMessage(){
        if(this.number.hasError('required')){
          return "Roll Number is Required";
        }
        return   this.number.hasError("pattern") ?'Enter a valid Number':'' ;
      }
      // getGenRadioErrorMEssage(){
      //   if (this.genradio.hasError('required')) {
      //     return"Gender is required";
      //     }
      //     }
      // getCourseErrorMessage(){
      //   if(this.Cour.hasError('required')){
      //     return    "Please Select Course" ;
      //     }
      //     }
          
      // getDateErrorMessage(){
      //   if(this.dob.hasError('required')){
      //     return      "DOB is required";}
      //     }
          
      getEmailErrorMessage() {
        if (this.email.hasError('required')) {
          return 'You must enter a valid Input';
        }
        return this.email.hasError('email') ? 'Not a valid email' : '';
      }
      getPhoneErrorMessage(){
        if(!this.phone.hasError('required') && !this.phone.hasError('pattern')){
          return "Only numbers are allowed";
        }
          return this.phone.hasError('pattern')?'Invalid Phone Number':'';
          }
    });
    if(this.editDate){
      this.actionbtn = "Update";
      this.productForm.controls['productName'].setValue(this.editDate.productName);
      this.productForm.controls['Category'].setValue(this.editDate.Category);
      this.productForm.controls['freshness'].setValue(this.editDate.freshness);
      this.productForm.controls['price'].setValue(this.editDate.price);
      this.productForm.controls['comment'].setValue(this.editDate.comment);
      this.productForm.controls['date'].setValue(this.editDate.date);
    }
  }
      actionBtn : string = "Save";
  
      if(this.editDate){
        this.actionbtn = "Update";
        this.productForm.controls['productName'].setValue(this.editDate.productName);
        this.productForm.controls['Category'].setValue(this.editDate.Category);
        this.productForm.controls['freshness'].setValue(this.editDate.freshness);
        this.productForm.controls['price'].setValue(this.editDate.price);
        this.productForm.controls['comment'].setValue(this.editDate.comment);
        this.productForm.controls['date'].setValue(this.editDate.date);
      }
    }
    addProduct(){
      if(!this.editDate)
      {
        if(this.productForm.valid){
          this.api.postProduct(this.productForm.value).subscribe({
            next:(res)=>{
              alert("Product added Successfully");
              this.productForm.reset();
              this.dialogRef.close('Save');
          },
          error:() =>{
            alert('Error while adding the product');
          }
        });
        }
      }
      else{
        this.updateProduct()
      }
     
    }
    updateProduct()
    {
      this.api.putProduct(this.productForm.value,this.editDate.id).subscribe({
        next:(res)=>{
          alert("Product Updated Successfully");
          this.productForm.reset();
          this.dialogRef.close('Update');
        },
        error:()=>{
          alert("Error while updating the record");
        }
      })
    }
    
  }
  