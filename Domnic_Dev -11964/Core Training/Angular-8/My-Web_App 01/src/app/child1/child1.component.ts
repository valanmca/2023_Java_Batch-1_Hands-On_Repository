import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  getadd(a:number,b:number):number
  {
    let sum=a+b;
    return sum;
  }
  email:string;
  imagepath:string;
  height:number;
  width:number;
  constructor(){
    this.email="domnic@gmail.com";
    this.imagepath="https://repository-images.githubusercontent.com/24195339/87018c00-694b-11e9-8b5f-c34826306d36";
    this.height=200;
    this.width=400;
  }
}
