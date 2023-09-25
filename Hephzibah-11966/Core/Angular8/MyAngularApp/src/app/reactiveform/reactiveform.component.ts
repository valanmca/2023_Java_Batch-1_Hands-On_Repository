import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {
  myForm: FormGroup;

  constructor(){
    this.myForm =new FormGroup({
    name: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z]+')]),
    email: new FormControl('',[Validators.required, Validators.pattern('^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,})$')]),
    age: new FormControl('',[Validators.required, Validators.pattern('[0-9]+')]),
    phone: new FormControl('',[Validators.required, Validators.pattern('^[1-9]{1}')]),
    
  });
  }
  register(data:any){
    alert(data.name+ " successfully registered");
  }

}
