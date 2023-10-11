import { Component } from '@angular/core';

@Component({
  selector: 'app-tempdrivform',
  templateUrl: './tempdrivform.component.html',
  styleUrls: ['./tempdrivform.component.css']
})
export class TempdrivformComponent {
  uname : string="";
  uemail : string="";
  uage : number=0;
  ucontact : number=0;
  ucountry : string="";
  
  myFunction(data : any){
    //alert(data.name +""+ data.email +""+ data.age +""+ data.contact +""+ data.country +"")
    this.uname = data.name;
    this.uemail = data.email;
    this.uage = data.age;
    this.ucontact = data.contact;
    this.ucountry = data.country;
    alert(data.name+"Success")
  }
}
