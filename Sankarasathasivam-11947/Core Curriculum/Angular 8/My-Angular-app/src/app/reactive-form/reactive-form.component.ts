import { Component } from '@angular/core';
import {FormControl,Validators,FormGroup} from '@angular/forms';
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {
  myForm: FormGroup;

  constructor() {
    this.myForm = new FormGroup({
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z')])
    })
  }
  myFunction(data:any){
    alert(data.name+""+data.email+""+data.age+"");
  }
}
