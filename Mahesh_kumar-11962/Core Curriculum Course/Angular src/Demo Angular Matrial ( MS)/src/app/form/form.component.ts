import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  BloodGroup:string [] = ['A+','A-','B+','B-','O+','O-','AB+','AB-'];

  myform:FormGroup;
  constructor()
  {
    this.myform= new FormGroup({
      id:  new FormControl('',Validators.required),
      name:new FormControl('',Validators.required),
      std:new FormControl('',Validators.required)

    });
  }
}
