import { Component } from '@angular/core';
import { StudentserviceService } from './studentservice.service';
import { student } from './model/student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  stud:student;
  result: string="";
  stlist:student[]=[];

  constructor(private service:StudentserviceService){
    this.stud=new student();
    
  }
  
  myFunction(data:any){
    alert("ok");
  }
  insertStudent(data:any){
    this.stud.srno=data.srno;
    this.stud.sname=data.sname;
    this.stud.opt=data.opt;
    this.stud.cours=data.cours;
    this.result=this.service.insertStudent(this.stud);
    

  }
  deleteStudent(data:any){
    this.stud.srno=data.srno;
    this.stud.sname=data.sname;
    this.stud.opt=data.opt;
    this.stud.cours=data.cours;
    this.result=this.service.deleteStudent(this.stud);
    
  }

updateStudent(data:any){
  this.stud.srno=data.srno;
  this.stud.sname=data.sname;
  this.stud.opt=data.opt;
  this.stud.cours=data.cours;
  this.result=this.service.updateStudent(this.stud);
  
}
}

