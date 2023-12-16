import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { HeroService } from './hero.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  employee : Employee;
  result : string="";
  emplist: Employee[] =[];
  title: any;

  constructor(private service:HeroService){
    this.employee= new Employee();
    this.getAllEmployee();
  }

  myFunction(data:any){
    alert("success");
  
  }
  InsertEmployee(data:any){
    
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result = this.service.insertEmployee(this.employee);
    this.getAllEmployee();
  }
  DeleteEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result = this.service.deleteEmployee(this.employee);
    this.getAllEmployee();
  }
  UpdateEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;
    this.result = this.service.updateEmployee(this.employee);
    this.getAllEmployee();
  }
  getAllEmployee(){
    this.service.getAllEmployee().subscribe(employees=>this.emplist = employees);
  }
}




