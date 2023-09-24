import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  empid:number;
  empname:string;
  empsalary:number;
  empphone:number;
  ememail:string;
  imagepath:string;
  imagehight:number;
  imagewidth:number;
  name:string="";
  constructor(){
    this.empid=101;
    this.empname="Muthu";
    this.empsalary=15000;
    this.empphone=9629438526;
    this.ememail="muthurajp632@gmail.com";
    this.imagepath="./assets/aimage.png";
    this.imagehight=300;
    this.imagewidth=100;
  }
  getAddition(a:number,b:number):number{
  let sum=a+b;
  return sum;
  let average=sum/2;
  return average;
}
getFactorial(c:number):number{
  let i=1;
  let fact=1;
  for( i=1;i<=c;i++){
    fact=fact*i;
  }return fact;
}
getaddition(a:number,b:number):number{
  let sum=a+b;
  return sum;
}

changeName(){
  if(this.empname == "Muthu")
  this.empname="Raj";

else
  this.empname="Muthu";

}
changeEmail(){

  if(this.ememail == "muthurajp632@gmail.com")
  this.ememail="raj@gmail.com";

else
  this.ememail="muthurajp632@gmail.com";
}
changephone(){
  
  if(this.empphone == 9629438526)
  this.empphone= 8526036571;

else
  this.empphone=9629438526;
}

changeImage(){
  if(this.imagepath == "./assets/aimage.png")
  this.imagepath="./assets/logo1.png";

else
  this.imagepath="./assets/aimage.png";
}


}


