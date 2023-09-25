import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-dir',
  templateUrl: './attribute-dir.component.html',
  styleUrls: ['./attribute-dir.component.css']
})
export class AttributeDirComponent {

myColor : string;
myClass : string;
constructor(){
  
  this.myColor="green";
  this.myClass="MyClass1"
}
changeStyle(){
  
}
changeColor(){
  if(this.myColor=="green"){
    this.myColor="red";
  }else{
    this.myColor="green"
  }
}
changeClass(){
  if( this.myClass=="MyClass1")
  {
   this.myClass="MyClass2";
  }
  else{
    this.myClass="MyClass1";
  }
}
}
