import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from './model/Employee';
import { EmpserviceService } from './empservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'emp-mang-sys';

  myForm: FormGroup;
  employee: Employee;
  result: string = "";
  empList: Employee[] = [];
  constructor(private emp: EmpserviceService) {
    this.myForm = new FormGroup(
      {
        name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z]+')]),
        id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
        salary: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),


      }
    ),
      this.employee = new Employee();
      this.getAllEmployees();
  }


  InsertEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.emp.InsertEmployee(this.employee);
    this.getAllEmployees();
  }
  UpdateEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.emp.updateEmployee(this.employee);
    this.getAllEmployees();
  }
  DeleteEmployee(data: any) {
    this.employee.id = data.id;
    this.employee.name = data.name;
    this.employee.salary = data.salary;

    this.result = this.emp.deleteEmployee(this.employee);
    this.getAllEmployees();
  }

  getAllEmployees() {
    this.emp.getAllEmployeeDetails().subscribe(employees => this.empList = employees);
  }

}
