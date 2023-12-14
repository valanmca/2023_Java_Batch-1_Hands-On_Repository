import { Component } from '@angular/core';
import { EmployeeServiceService } from './employee-service.service';
import { Employee } from './modal/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employee : Employee;
  result : string = "";
  empList : Employee[] = [];

  constructor(private service : EmployeeServiceService){
    this.employee = new Employee();
    this.getAllEmployees();
  }

  InsertEmployee(data : any){
    // alert(data.id+" "+data.name+" "+data.salary);
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.InsertEmployee(this.employee);
    this.getAllEmployees();
  }
  updateEmployee(data : any){
    
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.updateEmployee(this.employee);
    this.getAllEmployees();
  }
  deleteEmployee(data : any){
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.deleteEmployee(this.employee);
    this.getAllEmployees();
  }
  resetEmployee(data : any){
    this.result = " ";
    this.getAllEmployees();
  }
  getAllEmployees(){
    this.service.getAllEmployeeDetails().subscribe(
      employees => this.empList = employees
    );
  }

}
