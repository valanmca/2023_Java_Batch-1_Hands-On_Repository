import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-q2',
  templateUrl: './q2.component.html',
  styleUrls: ['./q2.component.css']
})
export class Q2Component {
  myform:FormGroup;


  constructor(){
    this.myform=new FormGroup({
      fname:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      lname:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      uname:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      mail: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+')]),
      phnum: new FormControl('',[Validators.required,Validators.pattern('[0-9]+'), Validators.maxLength(10),Validators.minLength(10)]),
      pass: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9!@#$%^&*]+'),Validators.minLength(6),Validators.maxLength(16)]),
      cnpass: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9!@#$%^&*]+'),Validators.minLength(6),Validators.maxLength(16)]),
      });
   
  }
  register(data:any){
    alert(data.fname+" "+data.lname+" "+data.uname+" "+data.mail+" "+data.phnum)
  }

}
