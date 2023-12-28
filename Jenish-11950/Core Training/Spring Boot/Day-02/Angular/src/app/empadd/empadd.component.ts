import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmployeeService } from '../empservices/employee.service';
import { DialogRef } from '@angular/cdk/dialog';

@Component({
  selector: 'app-empadd',
  templateUrl: './empadd.component.html',
  styleUrls: ['./empadd.component.css']
})
export class EmpaddComponent {
  empForm: FormGroup;

  education:string[]=[
    "SSLC",
    "HSC",
    "Diploma",
  ];
 
constructor(private fb: FormBuilder, private empService: EmployeeService, private dialogRef: DialogRef<EmpaddComponent>) {
  this.empForm = this.fb.group({
    firstname: '',
    lastname: '',
    email: '',
    dob: '',
    gender: '',
    education: '',
    company: '',
    package: '',
  })
}
onFormSubmit(){
  if(this.empForm.valid){
    this.empService.addEmployee(this.empForm.value).subscribe({
      next: (val: any) => {
        alert('Employee added successfully');
        this.dialogRef.close();
      },
      error:(err: any)=>{
        console.error(err);
      },
    })
  }
}
}
