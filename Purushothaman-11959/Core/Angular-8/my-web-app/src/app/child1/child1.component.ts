import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
   email:string;
   imagePath:string;
   width:number;
   height:number;
   constructor(){
    this.email="steve@gmail.com";
    this.imagePath="https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/250px-Angular_full_color_logo.svg.png";
    this.width=600;
    this.height=600;

  }
}
