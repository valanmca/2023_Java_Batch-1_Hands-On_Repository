import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmpserviceService } from '../empservice.service';
import { DialogRef } from '@angular/cdk/dialog';

@Component({
  selector: 'app-empadd',
  templateUrl: './empadd.component.html',
  styleUrls: ['./empadd.component.css']
})
export class EmpaddComponent {

  empform: FormGroup;
 


  education: string[] = [
    "SSLC",
    "HSC",
    "UG",
    "PG",
    "Diploma",
  ];


  constructor(
    private fb: FormBuilder,
    private empservice:EmpserviceService , 
    private dialogRef:DialogRef<EmpaddComponent>)
   {
    this.empform = this.fb.group({
      firstName: '',
      lastName: '',
      email: '',
      dob: '',
      gender:'',
      education: '',
      company: '',
      experience: '',
      package: '',


    })
  }
  onformsubmit() {
    if (this.empform.valid) {
      this.empservice.addEmployee(this.empform.value).subscribe({
        next: (val: any) => {
          alert('Employee added sucessfully');
          this.dialogRef.close();
        },
        error:(err:any) => {
          console.error(err);
        }
      });
    }
  }

  
}


