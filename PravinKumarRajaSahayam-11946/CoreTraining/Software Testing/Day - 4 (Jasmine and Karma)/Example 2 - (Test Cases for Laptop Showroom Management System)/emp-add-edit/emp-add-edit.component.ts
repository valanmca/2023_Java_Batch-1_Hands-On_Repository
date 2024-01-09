import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { EmployeeService } from '../employee.service';
import { CoreService } from '../core.service';
import { Laptop } from '../model/Laptop';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-emp-add-edit',
  templateUrl: './emp-add-edit.component.html',
  styleUrls: ['./emp-add-edit.component.css']
})
export class EmpAddEditComponent implements OnInit {
 
  private url : string = "http://localhost:1239";
 
  laptop: any;
empForm: FormGroup;



  checked = false;
  indeterminate = false;

  constructor(
    private _fb: FormBuilder,
    private _empService: EmployeeService,
    private _dialogRef: MatDialogRef<EmpAddEditComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private _coreService: CoreService,
    private _http: HttpClient
  ) {
    this.empForm = this._fb.group({
      laptopId: '',
      laptopBrandName: '',
      laptopModelName: '',
      laptopPrice: '',
      action: '',
     
    });
  }
  insertLaptop(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
 this.laptop.laptopId = data.laptopId;
 this.laptop.laptopBrandName = data.laptopBrandName;
 this.laptop.laptopModelName = data.laptopModelName;
 this.laptop.laptopPrice = data.laptopPrice;


  this.data = this._empService.insertLaptop(this.laptop);

}

deleteLaptop(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
  this.laptop.laptopId = data.laptopId;
 this.laptop.laptopBrandName = data.laptopBrandName;
 this.laptop.laptopModelName = data.laptopModelName;
 this.laptop.laptopPrice = data.laptopPrice;


  this.data = this._empService.deleteLaptop(this.laptop);

}

updateLaptop(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
  this.laptop.laptopId = data.laptopId;
 this.laptop.laptopBrandName = data.laptopBrandName;
 this.laptop.laptopModelName = data.laptopModelName;
 this.laptop.laptopPrice = data.laptopPrice;


  this.data = this._empService.updateLaptop(this.laptop,this.data);

}
  ngOnInit(): void {
    this.empForm.patchValue(this.data);
    this.empForm= new FormGroup({
      laptopId: new FormControl('' , [Validators.required ,Validators.pattern(/^([1-9]|10)+$/)]),
      laptopBrandName: new FormControl('' , [Validators.required ,Validators.pattern(/^[a-zA-Z]+$/)]),
      laptopModelName: new FormControl('' , [Validators.required ,Validators.pattern(/^[a-zA-Z]+$/)]),
      laptopPrice: new FormControl('' , [Validators.required ,Validators.pattern(/^([1-9]|10)+$/)]),
    });
  }
  public myError = (controlName: string, errorName: string) =>{
    return this.empForm.controls[controlName].hasError(errorName);
    }

  onFormSubmit() {
    if (this.empForm.valid) {
      if (this.data) {
        this._empService
          .updateLaptop(this.data.laptopId, this.empForm.value)
          .subscribe({
            next: (val: any) => {
              this._coreService.openSnackBar('Laptop detail updated!');
              this._dialogRef.close(true);
          
            },
            error: (err: any) => {
              this._coreService.openSnackBar('Laptop Id Not Found');
              console.error(err);
              duration: 3000;
            },
          });
      } else { 
        this._empService.insertLaptop(this.empForm.value).subscribe({
          next: (val: any) => {
            this._coreService.openSnackBar('Laptop Id already exists');
            this._dialogRef.close(true);
            duration: 3000;
          },
          error: (err: any) => {
            this._coreService.openSnackBar('Laptop added successfully');
            console.error(err);
            duration: 3000;
          },
        });
      }
    }
  }
  
}
