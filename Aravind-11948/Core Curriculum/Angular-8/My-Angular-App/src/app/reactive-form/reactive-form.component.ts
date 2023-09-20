import { Component } from '@angular/core';
import { FormControl,Validators,FormGroup } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {
  myForm:FormGroup;

  constructor()
  {
    this.myForm=new FormGroup({
      name:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      email: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$')]),
      age: new FormControl('',[Validators.required,Validators.pattern('[0-9]'), Validators.maxLength(2)]),
      phone: new FormControl('',[Validators.required,Validators.pattern('[0-9]+'), Validators.maxLength(10),Validators.minLength(10)]),
    })
  }

  myFunction(data:any)
  {
    alert(data.name);
  }


}
