import { Component } from '@angular/core';

@Component({
  selector: 'app-template',
  templateUrl: './template.component.html',
  styleUrls: ['./template.component.css']
})
export class TemplateComponent {
    form = {
      fname: "",
      lname:"",
      uname :"",
      email :"",
      mobile :"",
      password :"",
      confirmpassword :""
     }

     integerRegex = /^\d+$/
     emailRegex = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/

     registerFn()
     {
      console.log(this.form)
     }
}
