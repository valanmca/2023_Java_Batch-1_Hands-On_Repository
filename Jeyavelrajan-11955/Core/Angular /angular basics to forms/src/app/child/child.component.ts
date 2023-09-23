import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  eid: number;
  ename: string;
  esalary: number;
  email: string;
  imagepath:string;
  imgwidth:number;
  imgheight:number;
  name:string='';
  num1:number= 0;
  num2:number=0;

  // to define a constructor in TypeScript 
  constructor(){
    this.eid=101;
    this.ename="jeyavel";
    this.esalary=15000;
    this.email="jeyavelraj@gmail.com";
    this.imagepath="./assets/download.png";
    this.imgwidth=300;
    this.imgheight=300;
  }

// define  a function in typeScript 
getaddition(a: number,b: number){
  let sum = a+b;
  return sum;
}

//Event Binding
changename(){
  // this.ename="jeyavelrajan";
  //if else in typescript
  if(this.ename=="jeyavel")
     this.ename="jeyavelrajan";
     else
     this.ename="jeyavelR";

}

changeemail(){
  this.email="jeyavelrajanRelevantz@gmail.com";
}

changeimage(){
  this.imagepath="./assets/angular.png";
}


getadd(num1: number,num2: number){
  let num3 = num1+num2;
  return num3;
}

}
