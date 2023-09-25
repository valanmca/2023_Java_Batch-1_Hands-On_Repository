import { Component } from '@angular/core';

@Component({
  selector: 'app-child-three',
  templateUrl: './child-three.component.html',
  styleUrls: ['./child-three.component.css']
})
export class ChildThreeComponent {
 imagePath : string;
 img_width:number;
 img_height:number;


  constructor(){

  this.imagePath ="https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/512px-Angular_full_color_logo.svg.png";
this.img_height=100;
this.img_width=100;
}
}
