import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EmployeeserviceService } from './employeeservice.service';
import { Employee } from 'Model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'crud';
  myForm: FormGroup;
  employee: Employee;
  result: string="";
  empList: Employee[]=[];

  constructor(private service : EmployeeserviceService){
    this.employee=new Employee();
    this.getAllEmployee();

    this.myForm =new FormGroup({
    id: new FormControl('',[Validators.required, Validators.pattern('[0-9]+')]),  
    name: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z]+')]),
    salary: new FormControl('',[Validators.required, Validators.pattern('[0-9]+')])
  });
  }
  register(data:any){
  }
  insertemployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.insertEmployee(this.employee);
    this.getAllEmployee();

  }
  deleteemployee(data:any){

    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.deleteEmployee(this.employee);
    this.getAllEmployee();

  }
  updateemployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.updateEmployee(this.employee);
    this.getAllEmployee();
  }
 getAllEmployee(){
  this.service.getAllEmployeeDetails().subscribe(
    employees => this.empList = employees
  );
 }

}
