import { Component } from '@angular/core';
import { FormControl, FormGroup, MaxLengthValidator, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {
  myForm:FormGroup;
  fname : string ="";
  femail : string ="";
  fage : string ="";
  fphone : string ="";
  

  constructor(){
    this.myForm = new FormGroup({
      name : new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      email : new FormControl('',[Validators.required,Validators.pattern('[a-z0-9]+@[a-z]+\.[a-z]{2,3}')]),
      age : new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      phone : new FormControl('',[Validators.required,Validators.pattern('[0-9]{10}')]),
      
    });
  }
  registerFunction(data:any){
     this.fname = data.name;
     this.femail = data.email;
     this.fage = data.age;
     this.fphone = data.phone;
     
  }
}


