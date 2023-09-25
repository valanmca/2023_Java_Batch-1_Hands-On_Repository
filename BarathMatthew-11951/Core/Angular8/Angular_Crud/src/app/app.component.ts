import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeServiceService } from './employee-service.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }


 


  employee :Employee;
  result : string="";
  empList : Employee[] = [];


 
  constructor(private service : EmployeeServiceService){
    this.employee = new Employee();
    this.getAllEmployee();
   
  }
insertEmployee(data:any){
  this.employee.id=data.id;
  this.employee.name=data.name;
  this.employee.salary=data.salary;
  this.result = this.service.insertEmployee(this.employee);
  this.getAllEmployee();


 
}

getAllEmployee(){
  this.service.getAllEmployeeDetails().subscribe(employee => this.empList=employee)
}

updateEmployee(data : any): void{
  this.employee.id=data.id;
  this.employee.name=data.name;
  this.employee.salary=data.salary;
  this.result = this.service.updateEmployee(this.employee);
  this.getAllEmployee();
}

deleteEmployee(data : any): void{
  this.employee.id=data.id;
  this.employee.name=data.name;
  this.employee.salary=data.salary;
  this.result = this.service.deleteEmployee(this.employee);
  this.getAllEmployee();
}
}
