import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MedicalService } from './medical.service';
import { School } from './model/school';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Management';
  myform:FormGroup;


  school:School;
  result:string="";


   scllist:School[]=[];
  constructor(private scl:MedicalService){
    this.myform=new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
      fathername: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
      gender: new FormControl('',[Validators.required]),
      board: new FormControl('',[Validators.required]),
      dob: new FormControl('',[Validators.required]),
      bgrp: new FormControl('',[Validators.required,Validators.pattern('[A|B|AB|O][\+|\-]')])
    });
    this.school=new School();
    this.getAll();
  }
  insertDetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fathername=data.fathername;
    this.school.gender=data.gender;
    this.school.board=data.board;
    this.school.dob=data.dob;
    this.school.bgrp=data.bgrp;
   
    this.result=this.scl.insertDetails(this.school);
    this.getAll();
  }
  updateDetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fathername=data.fathername;
    this.school.gender=data.gender;
    this.school.board=data.board;
    this.school.dob=data.dob;
    this.school.bgrp=data.bgrp;
   
    this.result=this.scl.updateDetails(this.school);
    this.getAll();
  }
  deleteDetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fathername=data.fathername;
    this.school.gender=data.gender;
    this.school.board=data.board;
    this.school.dob=data.dob;
    this.school.bgrp=data.bgrp;
   
    this.result=this.scl.deleteDetails(this.school);
    this.getAll();
  }
  getAll() {
    this.scl.getAllDetails().subscribe(school => this.scllist = school);
  }
}



