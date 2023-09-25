import { Component } from '@angular/core';
import { details } from './Model/details';
import { EmployeeService } from './employee.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Manage';
  student:details;
  result:string="";
  stuList:details[]=[];
  studentList:details[]=[];
  flag:boolean=false;
  constructor(private service :EmployeeService)
  {
    this.student=new details();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }


  insert(data:any)
  {
    this.student.id=data.id;
    this.student.patientname=data.patientname;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.address=data.address;
    this.result=this.service.insert(this.student);
    this.getAllDetails();


  }
  update(data:any)
  {
    this.student.id=data.id;
    this.student.patientname=data.patientname;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.address=data.address;
    this.result=this.service.update(this.student);
    this.getAllDetails();


  }
  delete(data:any)
  {
    this.student.id=data.id;
    this.student.patientname=data.patientname;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.address=data.address;
    this.result=this.service.delete(this.student);
    this.getAllDetails();


  }


  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      students=>this.studentList=students
    );


  }
}
