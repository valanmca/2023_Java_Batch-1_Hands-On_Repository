import { Component } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  email:string;
  constructor (){
    this.email="aravind@gmail.com";
  }
}
