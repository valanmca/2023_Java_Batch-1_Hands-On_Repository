import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FormControl,Validators } from '@angular/forms';
import { Employee } from './model/Employee';
import { EmpserviceService } from './empservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title='EMS';
  myform:FormGroup;

  employee:Employee;
  result:string="";
  empList: Employee[]=[];


  constructor(private emp:EmpserviceService){
    this.myform=new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      salary: new FormControl('',[Validators.required,Validators.pattern('[0-9][1-9.]*[0-9]+[1-9]*')]),
  });

    this.employee=new Employee();
    this.getAllEmployees();

  }


 
  InsertEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;

    this.result=this.emp.InsertEmployee(this.employee);

    this.getAllEmployees();
    
   }

   getAllEmployees(){
    this.emp.getAllEmployeeDetails().subscribe(employees => this.empList = employees);
   }

   updateEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;

    this.result=this.emp.updateEmployee(this.employee);

    this.getAllEmployees();
    
   }

   deleteEmployee(data:any){
    this.employee.id=data.id;
    this.employee.name=data.name;
    this.employee.salary=data.salary;

    this.result=this.emp.deleteEmployee(this.employee);

    this.getAllEmployees();
    
   }

   
}
