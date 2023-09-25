import { Component } from '@angular/core';

@Component({
  selector: 'app-oneway-databinding',
  templateUrl: './oneway-databinding.component.html',
  styleUrls: ['./oneway-databinding.component.css']
})
export class OnewayDatabindingComponent {
  eId : number;
  eName : string;
  eSalary : number;
  eMail : string;
  imagePath : string;
  imgHeight : number;
  imgWidth : number;

  constructor(){
    this.eId = 11954;
    this.eName = "Gayathri Kuppusamy";
    this.eSalary = 100000;
    this.eMail = "gayathri@gmail.com";
    this.imagePath= "./assets/logo.png";
    this.imgHeight = 100;
    this.imgWidth = 250;
  }
 getAddition(a:number,b:number):number{
  let sum = a+b;
  return sum;
 }
 changeId(){
  this.eId=420;
 }
 changeSalary(){
  this.eSalary= 200000;
 }
 changeName(){
  this.eName="Yathrik Sam";
 }
 changeImage(){
  this.imagePath="./assets/newlogo.png";
 }
}
