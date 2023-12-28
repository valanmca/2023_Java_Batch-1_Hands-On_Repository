import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { VechicleService } from '../vechicle.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { SnackbarService } from '../snackbar.service';

@Component({
  selector: 'app-vechicle',
  templateUrl: './vechicle.component.html',
  styleUrls: ['./vechicle.component.css']
})
export class VechicleComponent implements OnInit{
  vehicleForm:FormGroup;
  vehicleType = [ 
    'Two Wheeler',
    'Three Wheeler',
    'Four Wheeler'
  ]
  constructor(private _vec:VechicleService, private _dialogRef:MatDialogRef<VechicleComponent>,
    @Inject (MAT_DIALOG_DATA) public data:any, private _snackbar: SnackbarService){

    this.vehicleForm = new FormGroup ({ 
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      type: new FormControl('',[Validators.required]),
      name: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z\\s]+')]),  
      number: new FormControl('',[Validators.required, Validators.pattern ('[A-Z]{2}[0-9]{2}[A-Z\\s]{2}[0-9]{4}')]),
      owner: new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z][a-zA-Z\\s]+')]),
    });
  }
  ngOnInit(): void {
      this.vehicleForm.patchValue(this.data); //To view the existing data when click update
  }

  onSubmit(){
    
    if(this.vehicleForm.valid){
      if(this.data){// Update Vehicle
        this._vec.updateVehicle(this.data.id,this.vehicleForm.value).subscribe({
          next:(val) => {
            this._snackbar.openSnackBar("Vehicle details Updated","Done")
            this._dialogRef.close(true);
          }
        })
      }else{// Add Vehicle
        this._vec.addVechicles(this.vehicleForm.value).subscribe({
          next: (_val) => {
            this._snackbar.openSnackBar("Vehicle Added","Done")
            this._dialogRef.close(true);
          }
        });
      }
    
    }
  }
}
