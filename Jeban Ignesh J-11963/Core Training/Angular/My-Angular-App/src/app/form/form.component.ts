import { Component } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  yname:string="";
  yemail:string="";
  yage:string="";
  ymobileno:string="";
  ycountry:string="";
  myFunction(data:any){
    // alert(data.name+""+data.email+""+data.age+""+data.mobileno+""+data.country+"")
    this.yname=data.name;
    this.yemail=data.email;
    this.yage=data.age;
    this.ymobileno=data.mobileno;
    this.ycountry=data.country;
    alert(data.name+"Success");

  }

}
