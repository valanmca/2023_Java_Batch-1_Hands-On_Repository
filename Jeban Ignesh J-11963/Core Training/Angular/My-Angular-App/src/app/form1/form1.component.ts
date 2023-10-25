import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component {
  myForm:FormGroup;

  constructor(){
    this.myForm = new FormGroup({
      name:new FormControl('',[Validators.required, Validators.pattern('[a-zA-z][a-zA-z]+')]),
      email:new FormControl('',[Validators.required, Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$+")]),
      age:new FormControl('',[Validators.required, Validators.pattern('[0-9]+'),Validators.maxLength(2)]),
      mobileno:new FormControl('',[Validators.required, Validators.pattern('[0-9]+'),Validators.maxLength(10)]),

      

    });
  }
  myFunction(data:any){
    alert(data.name+""+data.email+""+data.age+""+data.mobileno);
  }

}
,