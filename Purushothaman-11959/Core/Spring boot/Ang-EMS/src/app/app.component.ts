import { Component } from '@angular/core';
import { ServiceService } from './service.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-web-app4';
  myform:FormGroup;

  employee:Employee;
  result:string="";
  empList: Employee[]=[];


  constructor(private emp:ServiceService){
    this.myform=new FormGroup({
      eid: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      ename: new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      esalary: new FormControl('',[Validators.required,Validators.pattern('[0-9][1-9.]*[0-9]+[1-9]*')]),
  });

    this.employee=new Employee();
    this.getAllEmployees();

  }


 
  InsertEmployee(data:any){
    this.employee.eid=data.eid;
    this.employee.ename=data.ename;
    this.employee.esalary=data.esalary;

    this.result=this.emp.InsertEmployee(this.employee);

    this.getAllEmployees();
    
   }

   getAllEmployees(){
    this.emp.getAllEmployeeDetails().subscribe(employees => this.empList = employees);
   }

   updateEmployee(data:any){
    this.employee.eid=data.eid;
    this.employee.ename=data.ename;
    this.employee.esalary=data.esalary;

    this.result=this.emp.updateEmployee(this.employee);

    this.getAllEmployees();
    
   }

   deleteEmployee(data:any){
    this.employee.eid=data.eid;
    this.employee.ename=data.ename;
    this.employee.esalary=data.esalary;

    this.result=this.emp.deleteEmployee(this.employee);

    this.getAllEmployees();
    
   }



}
