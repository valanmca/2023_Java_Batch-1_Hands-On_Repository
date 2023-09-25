import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-formreactive',
  templateUrl: './formreactive.component.html',
  styleUrls: ['./formreactive.component.css']
})
export class FormreactiveComponent {
  myForm1:FormGroup;

   constructor(){
    this.myForm1 = new FormGroup({
      name: new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      age: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      mobile: new FormControl('',[Validators.required,Validators.pattern('^[1-9]{1}')])
    });
   }
   myFunction1(data:any){
    alert(data.name+" "+data.age+""+data.mobile)
   }
}
