import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog'
import { EmployeeComponent } from './employee/employee.component';
import { MatTableDataSource } from '@angular/material/table';
import { EmployeeService } from './employee.service';
import { SnackbarService } from './snackbar.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  dataSource!:MatTableDataSource<any>
  displayedColumns: string[] = ['id', 'name', 'company', 'role', 'action'];
  
  constructor(private _dialog:MatDialog, private _emp:EmployeeService,
    private _snackbar:SnackbarService){}

  ngOnInit(): void {
      this.getEmployee();
  }

  addEmployee(){
    const dialogRef = this._dialog.open(EmployeeComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getEmployee();
        }
      }
    });
  }

  getEmployee(){
    this._emp.getAllEmployee().subscribe({
      next : (res) => {
        this.dataSource =new  MatTableDataSource(res)
      },
      error: console.log
    });
  }

  updateEmployee(data:any){
    const dialogRef =  this._dialog.open(EmployeeComponent,{
      data,
    });
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getEmployee();
        }
      }
    });
  }

  deleteEmployee(id:number){
    this._emp.DeleteEmployee(id).subscribe({
      next: (_res) => {
        this._snackbar.openSnackBar("Deleted Successfully","Done")
        this.getEmployee();
      },
      error:console.log
    })
  }
}
