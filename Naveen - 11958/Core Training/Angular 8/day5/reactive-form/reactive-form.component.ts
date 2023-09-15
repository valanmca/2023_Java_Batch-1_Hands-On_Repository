import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {
  myForm: FormGroup;

  constructor(){
    this.myForm = new FormGroup({
      name: new FormControl('', [Validators.required, Validators.pattern('[A-Z a-z]+')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-z0-9]+@[a-z]+\.[a-z]{2,3}$')]),
      age: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      phone: new FormControl('', [Validators.required, Validators.pattern('[0-9]{10}')]),
      country: new FormControl('', [Validators.required])

    });
  }
  name1 : string = "";
  email1 : string = "";
  age1 : string = "";
  phone1 : string = "";
  country1 : string = "";
  

  myFunction(data : any){
    this.name1 = data.name;
    this.email1 = data.email;
    this.age1 = data.age;
    this.phone1 = data.phone;
    this.country1 = data.country;
  }
  
}
