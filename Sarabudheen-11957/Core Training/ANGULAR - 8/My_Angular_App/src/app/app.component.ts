import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
empid:number;
empname:string;
empsalary:number;
empemail:string;
imagePath : string;

constructor(){
  this.empid = 101;
  this.empname = "Sara";
  this.empsalary = 5000;
  this.empemail = "sarabudheen@gmail.com";
  this.imagePath = "./assets/angular-8-logo.png";
}

getaddition(a:number,b:number) : number
{
  let sum = a+b;
return sum;
}

getfactorial(a : number):number
{
let i,fact = 1;
for(i=1;i<=a;i++) 
{
fact=fact*i;
}
return fact;  
}

changeName(){
  this.empname = "Virat";
}

changeEmail(){
  this.empemail = "@imkohli18";
}

changeImage(){
  this.imagePath = "./assets/angular.png";
}
}

