import { Component } from '@angular/core';

@Component({
  selector: 'app-interpolation',
  templateUrl: './interpolation.component.html',
  styleUrls: ['./interpolation.component.css']
})
export class InterpolationComponent {
  name:string;
  email:string;
  empid:number;

  constructor(){
    this.name="Sankarasathasivam";
    this.email="sss123@gmail.com";
    this.empid=11947;
  }
}
