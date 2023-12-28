
import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { DoctorService } from '../doctor.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { SnackbarService } from '../snackbar.service';


@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.scss']
})
export class DoctorComponent implements OnInit{


  doctorForm:FormGroup;
  doctorType = [ 
    'Orthopedics',
'Internal Medicine',
'Obstetrics and Gynecology',
'Dermatology',
'Pediatrics',
'Radiology',
'General Surgery',
'Ophthalmology'
  ]
  constructor(private _mov:DoctorService, private _dialogRef:MatDialogRef<DoctorComponent>,
    @Inject (MAT_DIALOG_DATA) public data:any, private _snackbar: SnackbarService){

    this.doctorForm = new FormGroup ({ 
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z\\s]+')]),  
      age: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      email: new FormControl('',[Validators.required, Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$')]),  
      special: new FormControl('',[Validators.required]),
      contact: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      location: new FormControl('',[Validators.required, Validators.pattern ('[a-zA-Z][a-zA-Z\\s]+')]),
          });
  }
  ngOnInit(): void {
      this.doctorForm.patchValue(this.data); //To view the existing data when click update
  }

  onSubmit(){
    
    if(this.doctorForm.valid){
      if(this.data){// Update Doctor
        this._mov.updateDoctors(this.data.id,this.doctorForm.value).subscribe({
          next:(val) => {
            this._snackbar.openSnackBar("Doctor details Updated","Done")
            this._dialogRef.close(true);
          }
        })
      }else{// Add Doctor
        this._mov.addDoctors(this.doctorForm.value).subscribe({
          next: (_val) => {
            this._snackbar.openSnackBar("Doctor Added","Done")
            this._dialogRef.close(true);
          }
        });
      }
    
    }
  }
}
