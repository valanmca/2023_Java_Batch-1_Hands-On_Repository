import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 

  employee:Employee;
  result:string="";
  empList:Employee[]=[];

  constructor(private service:EmployeeService){
    this.employee=new Employee();
    this.getAllEmployees();
  }

  InsertEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.InsertEmployee(this.employee);
    this.getAllEmployees();
  }

  updateEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.updateEmployee(this.employee);
    this.getAllEmployees();
  }

  deleteEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result=this.service.deleteEmployee(this.employee);
    this.getAllEmployees();
  }

  getAllEmployees(){
    this.service.getAllEmployeeDetails().subscribe( employees => this.empList=employees);
  }
}
