import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { SnackbarService } from '../snackbar.service';
import { MobileService } from '../mobile.service';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {

  mobileForm:FormGroup;
  mobileBrand = [ 
    'Samsung',
    'IPhone',
    'Realme',
    'Redmi'
  ]
  constructor(private _mob:MobileService, private _dialogRef:MatDialogRef<MobileComponent>,
    @Inject (MAT_DIALOG_DATA) public data:any, private _snackbar: SnackbarService){

    this.mobileForm = new FormGroup ({ 
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      brand: new FormControl('',[Validators.required]),
      model: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z\\s]+')]),  
      price: new FormControl('',[Validators.required, Validators.pattern ('[0-9]+')]),
     
    });
  }
  ngOnInit(): void {
      this.mobileForm.patchValue(this.data); //To view the existing data when click update
  }

  onSubmit(){
    
    if(this.mobileForm.valid){
      if(this.data){// Update Vehicle
        this._mob.updateMobile(this.data.id,this.mobileForm.value).subscribe({
          next:(_val) => {
            this._snackbar.openSnackBar("Mobile details Updated","Done")
            this._dialogRef.close(true);
          }
        })
      }else{// Add Vehicle
        this._mob.addMobiles(this.mobileForm.value).subscribe({
          next: (val) => {
            this._snackbar.openSnackBar("Mobile Added","Done")
            this._dialogRef.close(true);
          }
        });
      }
    
    }
  }

}
