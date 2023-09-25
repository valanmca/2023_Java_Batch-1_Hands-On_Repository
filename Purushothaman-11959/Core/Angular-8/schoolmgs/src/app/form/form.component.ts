import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { SclmgsService } from '../sclmgs.service';
import { MatDialog } from '@angular/material/dialog';
import { School } from '../model/School';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  myform:FormGroup;

  school:School;
  result:string="";
  sclList:School[]=[];



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

}
