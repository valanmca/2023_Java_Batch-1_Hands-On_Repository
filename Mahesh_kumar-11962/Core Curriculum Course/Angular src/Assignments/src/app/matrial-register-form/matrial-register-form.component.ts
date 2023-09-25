import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-matrial-register-form',
  templateUrl: './matrial-register-form.component.html',
  styleUrls: ['./matrial-register-form.component.css']
})
export class MatrialRegisterFormComponent {

  myForm:FormGroup;
  hide:boolean;
  constructor(){
      this.myForm = new FormGroup({
        fName: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
        lName: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
        uName: new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')]),
        email: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+')]),
        phone: new FormControl('',[Validators.required,Validators.pattern('[0-9]+'), Validators.maxLength(10),Validators.minLength(10)]),
        password: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9!@#$%^&*]+'),Validators.minLength(6),Validators.maxLength(16)]),
        cPwd: new FormControl('',[Validators.required,Validators.pattern('^[a-zA-Z0-9!@#$%^&*]+'),Validators.minLength(6),Validators.maxLength(16)]),
      });
      this.hide=true
  }
  register(data:any){
    alert(data.uName+" - "+data.email+" - "+data.phone)
  }


}
