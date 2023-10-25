import { Component } from '@angular/core';
import { EmailValidator } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  emid: number;
  emname: string;
  emsalary: number;
  ememail: string;
  imagePath: string;

  imagehight: number;
  imagewidth: number;
  name: string = "";
  title: any;

  constructor() {
    this.emid = 101;
    this.emname = "Jeban";
    this.emsalary = 15000;
    this.ememail = "jeban@gmail.com";
    this.imagePath = "./assets/logo.jpg";

    this.imagehight = 250;
    this.imagewidth = 250;

  }

  getaddition(a: number, b: number): number {
    let sum = a + b;
    return sum;
  }
  getmutiplication(a: number, b: number): number {
    let sum = a * b;
    return sum;

  }
  getsub(a: number, b: number): number {
    let sum = a - b;
    return sum;
  }
  getdiv(a: number, b: number): number {
    let sum = a / b;
    return sum;
  }
  getfactorial(a: number): number {
    let i, fact = 1;

    for (i = 1; i <= a; i++) {
      fact = fact * i;

    }
    return fact;
  }
  changeName() {
    if (this.emname == "Jeban")
      this.emname = "Ignesh";
    else
      this.emname = "Jeban";
  }
  changeEmail() {
    if(this.ememail == "jeban@gmail.com")
       this.ememail="ignesh@gmail.com";
    else
     this.ememail="jeban@gmail.com";
       
  }
  changeImage() {
    if (this.imagePath == "./assets/logo.jpg")
      this.imagePath = "./assets/logo2.jpg";
    else
      this.imagePath = "./assets/logo.jpg";
    }



}
