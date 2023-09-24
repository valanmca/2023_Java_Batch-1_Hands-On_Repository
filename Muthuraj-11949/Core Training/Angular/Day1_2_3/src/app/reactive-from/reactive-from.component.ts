import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-from',
  templateUrl:'./reactive-from.component.html',
  styleUrls: ['./reactive-from.component.css']
})
export class ReactiveFromComponent {
  myform: FormGroup;
  constructor(){
    this.myform =new FormGroup({
      name:new FormControl('',[Validators.required, Validators.pattern('[a-zA-z][a-ZA-Z]')])
    })    
  }  
}

