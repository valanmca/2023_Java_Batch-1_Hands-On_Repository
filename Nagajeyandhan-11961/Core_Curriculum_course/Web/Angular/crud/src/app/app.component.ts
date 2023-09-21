import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Employee } from 'Model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  employeeForm:FormGroup

  employee:Employee;
  result: string = "";
  empList: Employee[] = [];

  constructor(private service:EmployeeService){
    this.employee = new Employee();
    this.getAllEmployees();

    this.employeeForm = new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
      salary: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
    });
  }

  submit(data:any){
    
  }

  InsertEmployee(data:any){
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.insertEmployee(this.employee);
    this.getAllEmployees();
  }

  DeleteEmployee(data:any){
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.deleteEmployee(this.employee);
    this.getAllEmployees();
  }

  UpdateEmployee(data:any){
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.updateEmployee(this.employee);
    this.getAllEmployees();
  }
  getAllEmployees(){
    this.service.getAllEmployeeDetails().subscribe(
      employees => this.empList = employees
    )
  }

}
