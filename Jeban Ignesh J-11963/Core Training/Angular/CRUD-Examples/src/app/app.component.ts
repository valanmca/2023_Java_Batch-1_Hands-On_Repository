import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './Model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 myfunction(data:any){
  alert("Registration Successfully");
  alert(data.id+""+data.name+""+data.Salary);
 }

 


  employee:Employee;
  result:string="";
  empList :Employee[]=[];

  constructor(private service:EmployeeService){
    this.employee=new Employee();
    this.getAllEmployees();

  }
  insertEmployee(data:any){
    this.employee.id=data.id;
    this.employee.Name=data.name;
    this.employee.Salary=data.Salary;
    this.result=this.service.InsertEmployee(this.employee);
    this.getAllEmployees();
    alert("data is inserted")
    
  }
  updateEmployee(data:any){
    this.employee.id=data.id;
    this.employee.Name=data.name;
    this.employee.Salary=data.Salary;
    this.result=this.service.UpdateEmployee(this.employee);
    this.getAllEmployees();
    alert("data is updated")
  }
  deleteEmployee(data:any){
    this.employee.id=data.id;
    this.employee.Name=data.name;
    this.employee.Salary=data.Salary;
    this.result=this.service.DeleteEmployee(this.employee);
    this.getAllEmployees();
    alert("data is deleted")
  }
  getAllEmployees(){
    this.service.getAllEmployeeDetails().subscribe(
      employees => this.empList =employees
    );
  }
 
 
  }
 
  