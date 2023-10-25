import { Component } from '@angular/core';

@Component({
  selector: 'app-ignesh',
  templateUrl: './ignesh.component.html',
  styleUrls: ['./ignesh.component.css']
})
export class IgneshComponent {
  myColor:string;
  myClass:string;
  constructor(){
    this.myColor='red';
    this.myClass='MyClass1'
  }
  changeColor(){
    if(this.myColor=='red'){
      this.myColor='blue';
    }else
    this.myColor='red';
  }
  changeClass(){
    if(this.myClass=='MyClass1'){
      this.myClass='MyClass2';
    }else
    this.myClass='MyClass1';
  }
  

  }


