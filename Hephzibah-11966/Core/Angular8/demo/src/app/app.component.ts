import { Component } from '@angular/core';
import { Student } from './model/Student';
// import { Student } from './module/Student';
import { DataService } from './dataservice.service';
// import { Student } from './model/student';
// import { DataService } from './data.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'studentManage';
  student:Student;
  result:string="";
  stuList:Student[]=[];
  studentList:Student[]=[];
  flag:boolean=false;
  constructor(private service :DataService)
  {
    this.student=new Student();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }


  insert(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.insert(this.student);
    this.getAllDetails();


  }
  update(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.update(this.student);
    this.getAllDetails();


  }
  delete(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.delete(this.student);
    this.getAllDetails();


  }


  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      (      students: Student[])=>this.studentList=students
    );


  }
  // getAllDetail()
  // {
  // this.service.getAlldetails().subscribe(
  //   students=>this.stuList=students
  //    );


  }
  // insert(data:any)
  // {
 
  //  alert(data.id+" "+data.name+" "+data.dob+" "+data.gender+" "+data.depart+" ");
  // }


