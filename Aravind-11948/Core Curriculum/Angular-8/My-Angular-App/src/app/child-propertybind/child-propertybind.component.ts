import { Component } from '@angular/core';

@Component({
  selector: 'app-child-propertybind',
  templateUrl: './child-propertybind.component.html',
  styleUrls: ['./child-propertybind.component.css']
})
export class ChildPropertybindComponent {
  email:string;
  imagepath:string;
  width1:number;
  height1:number;
  constructor(){
    this.email="aravind@gmail1.com"
    this.imagepath="./assets/logo1.png";
    this.width1=500;
    this.height1=500;
  }

}
