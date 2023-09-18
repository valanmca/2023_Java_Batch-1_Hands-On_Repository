import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  names : string = " ";
  emails : string = " ";
  ages : string = " ";
phonenumbers : string = " ";
countrys : string = " ";

  myFunction(date : any)   
  {
/*alert(date.name + " " + date.email + " " + date.age + " " + date.phonenumber + " " + date.country + " " );*/
this.names = date.name;
this.emails = date.email;
this.ages = date.age;
this.phonenumbers = date.phonenumber;
this.countrys = date.country;
  }
}
