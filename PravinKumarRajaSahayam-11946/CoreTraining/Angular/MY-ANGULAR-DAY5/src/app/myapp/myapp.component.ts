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
        age : new FormControl('', [Validators.required, Validators.pattern('[0-9]+$'),Validators.maxLength(3)]),
        mobileNo : new FormControl('', [Validators.required, Validators.pattern('[0-9]+$'),Validators.minLength(10),Validators.maxLength(10)])
      }
    );
     }
     onSubmit(date : any) {
      console.log('Valid?', date.valid); // true or false
      console.log('Name : ', date.value.name);
      console.log('Email : ', date.value.email);
      console.log('Age : ', date.value.age);
      console.log('PhoneNumber : ', date.value.mobileNo);
    }


     
}
