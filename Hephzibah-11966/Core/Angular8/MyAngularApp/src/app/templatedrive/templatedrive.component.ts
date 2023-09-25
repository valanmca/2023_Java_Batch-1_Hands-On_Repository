import { Component } from '@angular/core';

@Component({
  selector: 'app-templatedrive',
  templateUrl: './templatedrive.component.html',
  styleUrls: ['./templatedrive.component.css']
})
export class TemplatedriveComponent {
  uname:string="";
  uemail:string="";
  uage:number=0;
  uphone:number=0;
  ucountry:string="";
  register(data:any){
    this.uname=data.name;
    this.uemail=data.email;
    this.uage=data.age;
    this.uphone=data.phone;
    this.ucountry=data.country;
    alert(data.name+ " successfully registered")
  }
 

}
