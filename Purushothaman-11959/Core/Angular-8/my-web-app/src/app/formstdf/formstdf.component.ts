import { Component } from '@angular/core';

@Component({
  selector: 'app-formstdf',
  templateUrl: './formstdf.component.html',
  styleUrls: ['./formstdf.component.css']
})
export class FormstdfComponent {
uname : string = "";
uemail : string = "";
uage: number = 0;
uphone: number = 0;
ucountry:string="";
myFunction(data:any){
  alert("Name: "+data.name+" Email: "+data.email+" Mobile: "+data.mobile+" Age:"+data.age+" Country: "+data.country)
  this.uname = data.name;
  this.uemail = data.email;
  this.uage = data.age;
  this.uphone = data.mobile;
  this.ucountry = data.country;
}
}
