import { Component } from '@angular/core';

@Component({
  selector: 'app-tempdrivform',
  templateUrl: './tempdrivform.component.html',
  styleUrls: ['./tempdrivform.component.css']
})
export class TempdrivformComponent {
  uname:string="";
  uemail:string="";
  uage:string="";
  ucontact:string="";
  ucountry:string="";
   
  
  myFunction(data:any){
  
    this.uname=data.name;
    this.uemail=data.email;
    this.uage=data.age;
    this.ucontact=data.contact;
    this.ucountry=data.country;
    alert(data.name+"Success")
}
}
