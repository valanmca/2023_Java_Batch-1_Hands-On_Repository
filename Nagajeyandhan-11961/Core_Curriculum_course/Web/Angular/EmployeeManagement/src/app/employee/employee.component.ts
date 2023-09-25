import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { MAT_DIALOG_DATA,  MatDialogRef } from '@angular/material/dialog';
import { SnackbarService } from '../snackbar.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit{
    employeeForm:FormGroup;

    roles:string[]=[
      'Tester',
      'Developer',
      'UI/UX Designer'
    ]

    constructor(private _emp:EmployeeService, private _dialogRef:MatDialogRef<EmployeeComponent>,private _snackbar:SnackbarService,
      @Inject(MAT_DIALOG_DATA) public data:any){
      this.employeeForm = new FormGroup({
      id: new FormControl('',[Validators.required]),
      name: new FormControl('',[Validators.required]),
      company: new FormControl('',Validators.required),
      role:new FormControl('',[Validators.required])
      });
    }

    ngOnInit(): void {
        this.employeeForm.patchValue(this.data);
    }

    onSubmit(){
        if(this.employeeForm.valid){
          
          if(this.data){
            this._emp.UpdateEmployee(this.data.id,this.employeeForm.value).subscribe({
              next: (_val:any) => {
                this._snackbar.openSnackBar("Employee Details Updated","Done");
                  this._dialogRef.close(true);
              },
              error : console.log
            });
          }
          else{
            this._emp.InsertEmployee(this.employeeForm.value).subscribe({
              next: (_val:any) => { 
                  this._snackbar.openSnackBar("Employee Added","Done");
                  this._dialogRef.close(true);
              },
              error : console.log
            });
          }          
        }
      }
    }


