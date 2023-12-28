import { Component, OnInit } from '@angular/core';
import { EmpaddComponent } from './empadd/empadd.component';
import { MatDialog } from '@angular/material/dialog';
import { EmployeeService } from './empservices/employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  

  constructor(private dialog : MatDialog, private empService:EmployeeService){}


    ngOnInit(): void {
        this.getEmployeeList();
    }
  openAddEditEmpForm(){
    this.dialog.open(EmpaddComponent);
  }

  getEmployeeList(){
    this.empService.getEmployeeList().subscribe({
    
      next: (res: any) =>{},
        error:console.log,
    });
  }
  }

