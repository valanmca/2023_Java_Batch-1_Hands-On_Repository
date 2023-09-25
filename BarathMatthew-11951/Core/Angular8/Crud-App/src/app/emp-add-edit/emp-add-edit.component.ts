import { Component } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';
import { EmployeeService } from '../services/employee.service';
import { DialogRef } from '@angular/cdk/dialog';

@Component({
  selector: 'app-emp-add-edit',
  templateUrl: './emp-add-edit.component.html',
  styleUrls: ['./emp-add-edit.component.css']
})
export class EmpAddEditComponent {

    qualification : string[]= [
      "SSC",
      "HSC",
      "UG",
      "PG"
    ]

    empForm:FormGroup;

    constructor(private _fb:FormBuilder,private _empService:EmployeeService,private _dialogRef:DialogRef<EmpAddEditComponent>){
      this.empForm = _fb.group({
        firstName :'',
        lastName :'',
        email:'',
        dob:'',
        gender:'',
        qualification:'',
        company:'',
        experience:'',
        package:''
      })
    }


    OnFormSubmit(){
      if(this.empForm.valid){
        this._empService.addEmployee(this.empForm.value).subscribe({
          next:(val:any)=>{
            alert('Employee added successfuly');
            this._dialogRef.close();
          },
          error:(err:any)=>{
            console.error(err);
          }
          
        })
      }
    }
}
