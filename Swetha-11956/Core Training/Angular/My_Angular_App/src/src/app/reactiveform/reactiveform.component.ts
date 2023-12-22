import { Component } from '@angular/core';
import { Validators,FormControl,FormGroup } from '@angular/forms';



@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {
  myForm:FormGroup;
  constructor(){
    this.myForm=new FormGroup({
      name:new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z][a-zA-Z]+')]),
      email:new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$')]),
      age:new FormControl('',[Validators.required,Validators.pattern('[0-9]+'),Validators.maxLength(2)]),
      phone:new FormControl('',[Validators.required,Validators.pattern('[0-9]+'),Validators.maxLength(10),Validators.minLength(10)]),
    })
  }
  register(data:any){
    alert(data.name+" "+data.email+" "+data.age+" "+data.phone)
  }
}
