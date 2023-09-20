import { Component } from '@angular/core';
import { EmployeeserviceService } from './employeeservice.service';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My-Angular-apps-Day8';
  employee : Employee;
  result : string = "";
  empList : Employee[] =[];
  constructor(private service : EmployeeserviceService)
  {
    this.employee = new Employee();
    this.getAllEmployees();
  }
  insertEmployee(data : any)
  {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;


    this.result = this.service.insertEmployee(this.employee);
    this.getAllEmployees() ;
  }
  updateEmployee(data : any)
  {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;


    this.result = this.service.updateEmployee(this.employee);
    this.getAllEmployees() ;
  }
  deleteEmployee(data : any)
  {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;


    this.result = this.service.deleteEmployee(this.employee);
    this.getAllEmployees();
  }
  getAllEmployees()
  {
    this.service.getAllEmployeeDetails().subscribe(employees => this.empList = employees) ;

  }
}
