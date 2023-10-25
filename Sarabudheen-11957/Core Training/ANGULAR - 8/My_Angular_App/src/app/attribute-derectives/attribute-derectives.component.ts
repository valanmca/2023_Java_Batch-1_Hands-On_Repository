import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-derectives',
  templateUrl: './attribute-derectives.component.html',
  styleUrls: ['./attribute-derectives.component.css']
})
export class AttributeDerectivesComponent {

  myColor : string;
  myClass : string ;

  constructor(){
    this.myColor = "green";
    this.myClass = "myClass1";
  }

  changeColor(){
    if(this.myColor == "green"){
      this.myColor = "red";
    } else 
    {
      this.myColor = "green";
    }
  }

  changeClass(){
    if(this.myClass == "myClass1"){
      this.myClass = "myClass2";
    }else{
      this.myClass = "myClass1";
    }
  }

}
