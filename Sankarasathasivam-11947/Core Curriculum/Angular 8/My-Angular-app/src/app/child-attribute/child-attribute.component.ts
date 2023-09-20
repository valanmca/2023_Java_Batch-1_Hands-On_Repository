import { Component } from '@angular/core';

@Component({
  selector: 'app-child-attribute',
  templateUrl: './child-attribute.component.html',
  styleUrls: ['./child-attribute.component.css']
})
export class ChildAttributeComponent {
  myColor:string;
  myClass:string;

  constructor(){
    this.myColor="green";
    this.myClass="MyClass1";
  }

  changeColor(){
    if(this.myColor=="green"){
      this.myColor="red";  
    }else{
      this.myColor="green";
    }
  }

  changeStyle(){
    if(this.myClass=="MyClass1"){
      this.myClass="MyClass2";
    }else{
      this.myClass="MyClass3";
    }
    
  }
}
