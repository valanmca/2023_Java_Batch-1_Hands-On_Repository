import { Component } from '@angular/core';

@Component({
  selector: 'app-attributedirective',
  templateUrl: './attributedirective.component.html',
  styleUrls: ['./attributedirective.component.css']
})
export class AttributedirectiveComponent {
  myStyle:{};
  myColor:string;
  myClass:string;
  
  constructor(){
    this.myStyle={'color':'Blue','cursor':'pointer'};
    this.myColor="green";
    this.myClass="myClass";
    
  }
  changeStyle(){
    this.myStyle={'color':'Green','cursor':'pointer'};
  }
  changeColor(){
    if(this.myColor=="green"){
      this.myColor="red";
    }else{
      this.myColor="green";
    }
  }
  changeClass(){
    if(this.myClass=="myClass"){
      this.myClass="myClass1";
    }
    else{
      this.myClass="myClass";
    }
  }

}
