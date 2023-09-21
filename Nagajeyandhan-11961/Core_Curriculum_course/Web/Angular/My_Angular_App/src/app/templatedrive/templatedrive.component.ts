import { Component } from '@angular/core';

@Component({
  selector: 'app-templatedrive',
  templateUrl: './templatedrive.component.html',
  styleUrls: ['./templatedrive.component.css']
})
export class TemplatedriveComponent {
  uName : string = "";
  uEmail : string = "";
  uAge: number = 0;
  uPhone: number = 0;
  uCountry:string="";
  flag:boolean;
      register(data:any){
        this.uName = data.name;
        this.uEmail = data.email;
        this.uAge = data.age;
        this.uPhone = data.phone;
        this.uCountry = data.country; 
        this.flag =true
      }
      constructor(){
        this.flag = false
      }
  }
