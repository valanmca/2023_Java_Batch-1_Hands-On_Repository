import { Component } from '@angular/core';
import { DataService } from './data.service';
import { Student } from './model/student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  student:Student;
  result:string=" ";
stuList:Student[]=[];
flag:boolean=true;
div:boolean=false;
  constructor(private service:DataService){
    this.student=new Student();
    this.getAlldetails();

  }

  insert(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.insert(this.student);
    this.getAlldetails();
    
  }
  update(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.update(this.student);
    this.getAlldetails();
    
  }

  delete(data:any)
  {
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.dob=data.dob;
    this.student.gender=data.gender;
    this.student.depart=data.depart;
    this.result=this.service.delete(this.student);
    this.getAlldetails();
    
  }
  getAlldetails(){
      this.service.getAlldetail().subscribe(
      students=>this.stuList=students
    );
  }
  changediv()
  {
    this.flag=! this.flag;
  }
  changediv1()
  {
    this.div=! this.div;
    this.flag=! this.flag;
  }

  // insert(data:any)
  // {
  //   alert(data.id+" "+data.name+" "+data.gender+" "+data.dob+" "+data.depart);
  // }

 
}
