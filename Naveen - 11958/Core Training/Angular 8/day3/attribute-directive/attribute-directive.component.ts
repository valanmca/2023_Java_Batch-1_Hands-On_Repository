import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.scss']
})
export class AttributeDirectiveComponent {

  myStyle : {};
  myColor : string;
  myClass : string;
  myClassColor : string;


  constructor(){
    this.myStyle = {'color' : 'green', 'cursor' : 'pointer'};
    this.myColor = "green";
    this.myClass = "MyClass1"
    this.myClassColor = "MyClass1"
  }
  changeStyle(){
    this.myStyle = {'color' : 'blue', 'font-style' : 'italic'}
  }

  changeColor(){
    if( this.myColor == "green"){
      this.myColor = "red";
    } else {
      this.myColor = "green"
    }
  }

  changeClass(){
    this.myClass = "MyClass2"
  }

  changeClassColor(){
    if( this.myClassColor == "MyClass1"){
      this.myClassColor = "MyClass2";
    } else {
      this.myClassColor = "MyClass1";
    }
  }



}
