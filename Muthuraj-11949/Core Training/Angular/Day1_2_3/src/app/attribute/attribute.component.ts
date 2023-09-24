import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute',
  templateUrl: './attribute.component.html',
  styleUrls: ['./attribute.component.css']
})
export class AttributeComponent {
  myColor : string;
  myclass : {};
  
  constructor(){
    this.myColor = "green";
    this.myclass = "Myclass";
    }
    changeColor(){
   if( this.myColor == "green"){
    this.myColor = "red";
   }else{
    this.myColor = "green";
   }
    }
  }