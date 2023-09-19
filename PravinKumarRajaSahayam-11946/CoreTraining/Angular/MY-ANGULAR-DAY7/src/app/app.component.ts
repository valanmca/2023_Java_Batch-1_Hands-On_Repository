import { Component } from '@angular/core';
import { EmployeeserviceService } from './employeeservice.service';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My-Angular-apps-Day7';
  employee : Employee;
  result : string = "";
  constructor(private service : EmployeeserviceService)
  {
    this.employee = new Employee();
  }
}
