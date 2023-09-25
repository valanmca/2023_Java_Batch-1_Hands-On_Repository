import { Component } from '@angular/core';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent {
  fname : string ="";
  femail : string ="";
  fage : string ="";
  fphone : string ="";
  fcntry : string ="";

  formFunction(data:any){
    this.fname = data.name;
    this.fage = data.age;
    this.fcntry = data.cntry;
    this.femail = data.email;
    this.fphone = data.phone;
  }
}
