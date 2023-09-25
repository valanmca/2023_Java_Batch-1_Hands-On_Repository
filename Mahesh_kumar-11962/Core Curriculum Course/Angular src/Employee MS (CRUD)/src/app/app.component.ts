import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }

  myForm: FormGroup;

  flag:boolean; 
  flag_del:boolean;
  flag_update:boolean;
  employee: Employee;
  result: string = "";
  empList: Employee[] = [];

  constructor(private emp: EmployeeService) {
    this.myForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      salary: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')])
    })
    this.employee = new Employee();
    this.getAllEmployees();
    this.flag=false;
    this.flag_del=false;
    this.flag_update=false;
   


  }

  InsertEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;
    this.result = this.emp.InsertEmployee(this.employee);
    this.getAllEmployees();
    this.flag=true;
  }

  DeleteEmployee(data: any) {
    //alert("Deleted Data" + data.id + " " + data.name + " " + data.salary);
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;
    this.result = this.emp.DeleteEmployee(this.employee);
    this.getAllEmployees();
    this.flag_del=true;
  }



  UpdateEmployee(data: any) {
   // alert("UpdatedData" + data.id + " " + data.name + " " + data.salary);

   this.employee.id= data.id;
   this.employee.name = data.name;
    this.employee.salary = data.salary;
    this.result = this.emp.UpdateEmployee(this.employee);
    this.getAllEmployees();
    this.flag_update=true;

  }

  getAllEmployees() {
    this.emp.getAllEmployeeDetails().subscribe(employees => this.empList = employees);
  } 



}


