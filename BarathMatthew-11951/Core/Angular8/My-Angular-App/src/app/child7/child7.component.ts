import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-child7',
  templateUrl: './child7.component.html',
  styleUrls: ['./child7.component.css']
})
export class Child7Component {

    myForm:FormGroup;

    constructor(){
      this.myForm = new FormGroup({
        name: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
        email: new FormControl('',[Validators.required,Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$')]),
        age : new FormControl('',[Validators.required,Validators.pattern('[0-9]{0,3}$')]),
        monileNo: new FormControl('',[Validators.required,Validators.pattern('[0-9]{10}$')]),
      })
    }

    myFunction(data : any){
      alert(data.name +" "+ data.email +" "+ data.age+" "+data.mobileNo);
    }
}
