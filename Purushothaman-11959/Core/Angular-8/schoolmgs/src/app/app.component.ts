import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { School } from './model/School';
import { SclmgsService } from './sclmgs.service';
import { MatDialog } from '@angular/material/dialog';
import { FormComponent } from './form/form.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'schoolmgs';
  myform:FormGroup;

  school:School;
  result:string="";
  sclList:School[]=[];
  flag:boolean=false;



  constructor(private scl:SclmgsService,private dialog:MatDialog){
    this.myform=new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      name: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z_ ]*$')]),
      fname: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z_ ]*$')]),
      dob: new FormControl('',[Validators.required]),
      bg: new FormControl('',[Validators.required]),
      gender: new FormControl('',[Validators.required])
    });

    this.school=new School();
    this.getAll();
  }

  insertdetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fname=data.fname;
    this.school.dob=data.dob;
    this.school.bg=data.bg;
    this.school.gender=data.gender;

    this.result=this.scl.insertdetails(this.school);
    this.getAll();
  }

  getAll(){
    this.scl.getAllDetails().subscribe(schools => this.sclList = schools);
   }

   updatedetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fname=data.fname;
    this.school.dob=data.dob;
    this.school.bg=data.bg;
    this.school.gender=data.gender;

    this.result=this.scl.updatedetails(this.school);
    this.getAll();
  }

  deletedetails(data:any){
    this.school.id=data.id;
    this.school.name=data.name;
    this.school.fname=data.fname;
    this.school.dob=data.dob;
    this.school.bg=data.bg;
    this.school.gender=data.gender;

    this.result=this.scl.deletedetails(this.school);
    this.getAll();
  }

  Openwindow(){
    this.dialog.open(FormComponent);
  }

  changediv(){
    this.flag=!this.flag;
  }
}
