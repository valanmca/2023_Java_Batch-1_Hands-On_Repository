import { Component } from '@angular/core';
import { Employee } from './Model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  employee : Employee;
  result : string ="";
  empList : Employee[] = [];
  title: any;
  constructor(private service : EmployeeService)
  {
    this.employee=new Employee();
    this.getAllEmployees();
  
  }
    form1={
      id:"",
      empName:"",
      empSal:""
    }

    crud()
    {
      console.log(this.form1);
    }

    insertEmployee(data:any)
    {
     this.employee.id =data.id;
     this.employee.empName=data.empName;
     this.employee.empSal=data.empSal;

     this.result=this.service.insertEmployee(this.employee);

     this.getAllEmployees(); //to update automatically by not reusing the code
    }

    updateEmployee(data:any) 
    {
     this.employee.id =data.id;
     this.employee.empName=data.empName;
     this.employee.empSal=data.empSal;

     this.result=this.service.updateEmployee(this.employee);

     this.getAllEmployees(); //to update changes automatically by not reusing the code
    }

    deleteEmployee(data:any)
    {
     this.employee.id =data.id;
     this.employee.empName=data.empName;
     this.employee.empSal=data.empSal;

     this.result=this.service.deleteEmployee(this.employee);

     this.getAllEmployees(); //to update automatically by not reusing the code
    }

    getAllEmployees()
    {
      this.service.getAllEmployeeDetails().subscribe(employees=> this.empList = employees);
    }
}
