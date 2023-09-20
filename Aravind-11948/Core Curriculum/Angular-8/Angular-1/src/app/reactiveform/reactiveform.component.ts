import { Component } from '@angular/core';
import { FormGroup,FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {
  Myform:FormGroup;
  constructor(){
    this.Myform=new FormGroup({
     name:new FormControl('',[Validators.required,Validators.pattern('[a-zA-z]+')])

    })
  }

}
