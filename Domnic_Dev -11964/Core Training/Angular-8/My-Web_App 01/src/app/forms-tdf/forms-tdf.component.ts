import { Component } from '@angular/core';

@Component({
  selector: 'app-forms-tdf',
  templateUrl: './forms-tdf.component.html',
  styleUrls: ['./forms-tdf.component.css']
})
export class FormsTDFComponent {

  uname:string="";
  uemail:string="";
  uphno:number=0;
  uage:number=0;
  ucountry:string="";
myFunction(data:any){
  alert("Name :"+data.name+" "+"Email :"+data.email+" "+"Phno :"+data.mobileno+" "+"Age :"+data.age+" "+"Country :"+data.country)

  this.uname=data.name;
  this.uemail=data.email;
  this.uphno=data.mobileno;
  this.uage=data.age;
  this.ucountry=data.country;
}
}
