import { Component } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  uname:string=" ";
  uemail:string=" ";
  uage:number=0;
  uphone:number=0;
  ucountry:string=" ";
  constructor(){
    
   
  }
  myFunction(data :any)
  {
    alert(data.name+" "+data.email+" "+data.age+" "+data.phone+""+data.country);
    this.uname=data.name;
    this.uemail=data.email;
    this.uage=data.age;
    this.uphone=data.phone;
    this.ucountry=data.country;
  }
 

}
