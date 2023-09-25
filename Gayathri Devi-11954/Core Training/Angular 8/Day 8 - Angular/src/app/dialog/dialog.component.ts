import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from '../services/api.service';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})
export class DialogComponent {
  freshnessList = ["Brand New","Second Hand","Refuribished"];
  actionbtn : string ="Save";
  productForm !: FormGroup;
  
  constructor(private fromBuilder : FormBuilder,private api : ApiService, 
    @Inject(MAT_DIALOG_DATA)public editDate : any,    
    private dialogRef : MatDialogRef<DialogComponent>){
    this.productForm = this.fromBuilder.group({
      productName : ['',Validators.required],
      Category : ['',Validators.required],
      freshness : ['',Validators.required],
      price : ['',Validators.required],
      comment : ['',Validators.required],
      date : ['',Validators.required]
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
