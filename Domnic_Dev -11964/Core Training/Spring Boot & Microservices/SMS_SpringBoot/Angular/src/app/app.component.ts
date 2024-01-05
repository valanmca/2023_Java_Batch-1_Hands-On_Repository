import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { StudentserviceService } from './studentservice.service';
import { Student } from './model/student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'studentmng';
  myform:FormGroup;

  student:Student;
  result:string="";

  stdlist:Student[]=[];

  constructor(private std:StudentserviceService){
    this.myform=new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
      email: new FormControl('',[Validators.required]),
      standard: new FormControl('',[Validators.required]),
      location: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),


    })
    this.student=new Student();
    this.getAll();

  }
  insertDetails(data:any){
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.email=data.email;
    this.student.standard=data.standard;
    this.student.location=data.location;

    this.result=this.std.insertDetails(this.student);
    this.getAll();
  }
  updateDetails(data:any){
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.email=data.email;
    this.student.standard=data.standard;
    this.student.location=data.location;

    this.result=this.std.updateDetails(this.student);
    this.getAll();
  }
  deleteDetails(data:any){
    this.student.id=data.id;
    this.student.name=data.name;
    this.student.email=data.email;
    this.student.standard=data.standard;
    this.student.location=data.location;

    this.result=this.std.deleteDetails(this.student);
    this.getAll();
  }
  getAll() {
    this.std.getAllDetails().subscribe(student => this.stdlist = student);
  }
}
