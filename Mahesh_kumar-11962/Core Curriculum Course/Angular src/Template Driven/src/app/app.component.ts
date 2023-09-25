import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Template_Form';

  

  SubmitData( data:any){

  }

Uname : string = "";
 Uemail : string = "";
 Uage: number = 0;
 Uphone: number = 0;
 Ulocation :string ="";

   Register(data:any){

    alert("Name :"+data.name+" "+"Email :"+data.email+" "+"Age :"+data.age+" "+"Phone :"+data.mobile+"Locaton :"+data.Location);
    this.Uname = data.name;
    this.Uemail = data.email;
    this.Uage = data.age;
    this.Uphone = data.mobile;
    this.Ulocation = data.Location;

   }
}

