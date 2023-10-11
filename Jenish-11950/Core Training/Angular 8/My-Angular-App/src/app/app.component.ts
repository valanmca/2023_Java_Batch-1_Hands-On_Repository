import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  eid:number;
  ename:string;
  esalary:number;
  email:string;
  imagepath:string;
  width:number;
  height:number;
  name:string;

  constructor(){
    this.eid=11950;
    this.ename="Jenish";
    this.esalary=3000;
    this.email="jenish@gmail.com";
    this.imagepath="./assets/logo.png";
    this.width=200;
    this.height=200;
    this.name="";

  }
  getAddition(a : number, b : number) : number{
    let sum=a+b;
    return sum;
  }
  getFactorial(n:number) : number{
    let i;
    let fact=1;
    for(i=1; i<=n; i++){
      fact=fact*i;
    }
    return fact;
  }
  changeName() {
    if(this.ename=="Jenish")
    this.ename="Naveen";
    else
    this.ename="Jenish"
  }
  changeEmail() {
    if(this.email=="jenish@gmail.com")
    this.email="naveen@gmail.com"
    else 
    this.email="jenish@gmail.com"
  }
  changeImage(){
    if(this.imagepath=="./assets/logo.png")
    this.imagepath="./assets/logo2.png"
    else 
    this.imagepath="./assets/logo.png"
  }
}
