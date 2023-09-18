import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-myapp',
  templateUrl: './myapp.component.html',
  styleUrls: ['./myapp.component.css']
})
export class MyappComponent{
  myForm : FormGroup;

  constructor()
  {
    this.myForm = new FormGroup(
      {
        name : new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z]+$')]),
        email : new FormControl('',[Validators.required,Validators.pattern('^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,})$')]),
        age : new FormControl('', [Validators.required, Validators.pattern('[0-9]+$')]),
        mobileNo : new FormControl('', [Validators.required, Validators.pattern('[0-9]+$')])
      }
    );
     }
     names : string = " ";
     emails : string = " ";
     ages : string = " ";
     mobileNos : string = " ";
   countrys : string = " ";
   
     onSubmit(date : any)   
     {
   /*alert(date.name + " " + date.email + " " + date.age + " " + date.phonenumber + " " + date.country + " " );*/
   this.names = date.name;
   this.emails = date.email;
   this.ages = date.age;
   this.mobileNos = date.mobileNo;
   
     }


     
}
