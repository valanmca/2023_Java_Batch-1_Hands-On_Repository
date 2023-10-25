import { Component } from '@angular/core';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent {
myFunction(data : any){
  alert ("Name : "+data.name+" Email :"+data.email+" Age : "+data.age+" Mobile No : "+data.mobileno+" Country : "+data.country);
}
}
