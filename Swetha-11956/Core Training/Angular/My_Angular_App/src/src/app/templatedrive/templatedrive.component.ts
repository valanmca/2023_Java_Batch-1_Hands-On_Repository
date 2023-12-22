import { Component } from '@angular/core';

@Component({
  selector: 'app-templatedrive',
  templateUrl: './templatedrive.component.html',
  styleUrls: ['./templatedrive.component.css']
})
export class TemplatedriveComponent {
  uName:string="";
  uEmail:string="";
  uAge:string="";
  uPhone:string="";
  uCountry:string="";

  register(data:any){
    this.uName=data.name;
    this.uEmail=data.email;
    this.uAge=data.age;
    this.uPhone=data.phone;
    this.uCountry=data.country;
  }
}
