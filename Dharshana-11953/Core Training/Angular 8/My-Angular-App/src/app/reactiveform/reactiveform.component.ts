import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {
  myForm : FormGroup;


  constructor() {
    this.myForm = new FormGroup({
      name : new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z ][a-zA-Z ]')]),
      email : new FormControl('', [Validators.required, Validators.pattern('^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$')]),
      age : new FormControl('', [Validators.required, Validators.pattern('[0-9]')]),
      mobileNo : new FormControl('', [Validators.required, Validators.pattern('[1-9]{1}')])
    });
  }
  myFunction(data : any) {
    alert(data.name +"" + data.email +"" +data.age +"" +data.mobileNo);
  }
}