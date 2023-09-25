import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // employeeFunction(data:any){
  //   alert(data.eID);
  // }




  employee: Employee;
  result: string = "";
  empList: Employee[] = [];
  constructor(private service: EmployeeService) {
    this.employee = new Employee();
    this.getAllEmployees();
  }

  insertEmployee(data: any) {
   
      this.employee.id = data.eID;
      this.employee.name = data.eName;
      this.employee.salary = data.eSal;
      this.result = this.service.insertEmployee(this.employee);
            this.getAllEmployees();
   

    
  }
  updateEmployee(data: any) {
    if(data.eID == "" || data.eName == "" && data.eSal == ""){
      alert("Fields must be enter");
    }
    else if(data.eID == "" && data.eName == "" || data.eSal == ""){
      alert("Fields must be enter");
    }
        
    else{
    this.employee.id = data.eID;
    this.employee.name = data.eName;
    this.employee.salary = data.eSal;

    this.result = this.service.updateEmployee(this.employee);
    
    this.getAllEmployees();
    }
  }
  deleteEmployee(data: any) {
    if(data.eID == "" || data.eName == "" || data.eSal == ""){
      alert("Fields must be enter");
    }
    else{
    this.employee.id = data.eID;
    this.employee.name = data.eName;
    this.employee.salary = data.eSal;
    this.result = this.service.deleteEmployee(this.employee);
    this.getAllEmployees();
    }
  }
  resetEmployee(data: any) {
    this.result = " ";
    this.getAllEmployees();
  }
  getAllEmployees() {
    this.service.getAllEmployeeDetails().subscribe(employees => this.empList = employees);
  }

}
