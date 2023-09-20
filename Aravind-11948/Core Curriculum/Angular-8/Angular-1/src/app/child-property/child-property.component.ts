import { Component } from '@angular/core';

@Component({
  selector: 'app-child-property',
  templateUrl: './child-property.component.html',
  styleUrls: ['./child-property.component.css']
})
export class ChildPropertyComponent {
  name:string;
  imgpath:string;

  constructor(){
    this.name="Aravind";
    this.imgpath="./assets/img1.jpg"
  }
  getaddition(a:number,b:number):number{
     let Sum=a+b;
    return Sum;

  }

}
