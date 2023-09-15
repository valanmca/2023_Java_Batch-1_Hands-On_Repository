import { Component } from '@angular/core';

@Component({
  selector: 'app-angular-forms',
  templateUrl: './angular-forms.component.html',
  styleUrls: ['./angular-forms.component.css']
})
export class AngularFormsComponent {

  // myFunction(data : any){
    // alert(data.name+" "+data.email+" "+data.age+" "+data.phone+" "+data.country);
  // }
  name1 : string = "";
  email1 : string = "";
  age1 : string = "";
  phone1 : string = "";
  country1 : string = "";
  

  myFunction(data : any){
    this.name1 = data.name;
    this.email1 = data.email;
    this.age1 = data.age;
    this.phone1 = data.phone;
    this.country1 = data.country;
  }
  
}
