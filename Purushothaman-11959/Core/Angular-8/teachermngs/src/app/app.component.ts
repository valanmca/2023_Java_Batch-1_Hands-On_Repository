import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { TeacherserviceService } from './teacherservice.service';
import { Teacher } from './Model/teacher';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'teachermngs';
  myform:FormGroup;
  teacher:Teacher;
  result:string="";
  teacherList:Teacher[]=[];
  flag:boolean=false;

  
  
  

  constructor(private tcr:TeacherserviceService){
    this.myform=new FormGroup({
      id:new FormControl ('',[Validators.required,Validators.pattern('[0-9]+')]),
      name:new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      email:new FormControl ('',[Validators.required,Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$')]),
      qualification: new FormControl ('',[Validators.required]),
      location:new FormControl ('',[Validators.required])
    });

    this.teacher=new Teacher();
    this.getAll();

  }

  insertdetails(data:any){
    this.teacher.id=data.id;
    this.teacher.name=data.name;
    this.teacher.email=data.email;
    this.teacher.qualification=data.qualification;
    this.teacher.location=data.location;

    this.result=this.tcr.insertdetails(this.teacher);
    this.getAll();
  }

  getAll(){
    this.tcr.getAllDetails().subscribe(teachers => this.teacherList = teachers);
   }

   updatedetails(data:any){
    this.teacher.id=data.id;
    this.teacher.name=data.name;
    this.teacher.email=data.email;
    this.teacher.qualification=data.qualification;
    this.teacher.location=data.location;

    this.result=this.tcr.updatedetails(this.teacher);
    this.getAll();
  }

  deletedetails(data:any){
    this.teacher.id=data.id;
    this.teacher.name=data.name;
    this.teacher.email=data.email;
    this.teacher.qualification=data.qualification;
    this.teacher.location=data.location;

    this.result=this.tcr.deletedetails(this.teacher);
    this.getAll();
  }

  changediv(){
    this.flag=!this.flag;
  }


}
