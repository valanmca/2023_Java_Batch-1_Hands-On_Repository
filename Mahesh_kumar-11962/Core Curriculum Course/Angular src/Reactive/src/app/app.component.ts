import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  myForm: FormGroup;

  constructor() {
    this.myForm = new FormGroup({
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$')]),
      age: new FormControl('', [Validators.required, Validators.pattern('[0-9]+'), Validators.maxLength(2)]),
      phone: new FormControl('', [Validators.required, Validators.pattern('[0-9]+'), Validators.maxLength(10), Validators.minLength(10)]),
    })
  }


  Function(data: any) {
    alert(data.name+" "+data.email+" "+data.age+" "+data.phone);
  }
}
