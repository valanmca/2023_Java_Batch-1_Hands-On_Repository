import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employee: Employee;
  result: string = "";
  empList: Employee[] = [];

  constructor(private service: EmployeeService) {
    this.employee = new Employee();
    this.getAllEmployees(); //class to get all current employee methods
  }

  InsertEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.InsertEmployee(this.employee);

    this.getAllEmployees();
  }

  DeleteEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.DeleteEmployee(this.employee);

    this.getAllEmployees();
  }

  UpdateEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.service.UpdateEmployee(this.employee);
    
    this.getAllEmployees();
  }

  getAllEmployees() {
    this.service.getAllEmployeeDetails().subscribe(
      Employee =>this.empList = Employee
    );
  }
}
