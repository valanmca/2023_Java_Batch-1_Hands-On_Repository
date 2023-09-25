import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  empid :number;
  empname :string;
  empsalary :number;
  email: string;
  imagepath: string;
  imgwidth: number;
  imgheight:number;
  name: string="";

  //we can declare a constructor as a name of constructor
  // used to initialize a variables
  constructor(){
    this.empid=101;
    this.empname="Minion";
    this.empsalary=20000;
    this.email="minion2301@gmail.com";
    this.imagepath="./assets/minion.jpg";
    this.imgwidth=300;
    this.imgheight=200;
    
  }
  changeName(){
    if(this.empname=="DharshuMinion")
        this.empname="Minion";
        else
        this.empname="DharshuMinion";
  }

  changeEmail(){
    if(this.email=="dharshu2301@gmail.com")
    this.email="minion2301@gmail.com";
    else
    this.email="dharshu2301@gmail.com";
  }

  changeImage(){
    if(this.imagepath=="./assets/angular.png")
    this.imagepath="./assets/minion.jpg";
    else
    this.imagepath="./assets/angular.png";
  }
  getaddition(a:number,b:number):number{
    let sum=a+b;
    return sum;
  }

  getfactorial(c:number):number{
    let i=1;
    let fact=1;
    for(i=1;i<=c;i++){
      fact = fact*i;
    } return fact;
  }
  
}
