import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(_title: any) {
    throw new Error('Method not implemented.');
  }
  empid: number;
  empname: string;
  empsalary: number;
  email: string;
  imagepath: string;
  width: number;
  height: number;

  constructor() {
    this.empid = 101;
    this.empname = "Shiva";
    this.empsalary = 2000;
    this.email = "shiva@gmail.com";
    this.imagepath = "./assets/angular logo.png";
    this.width = 400;
    this.height = 200;
  }

  getaddition(a: number, b: number): number {
    let sum = a + b;
    return sum;
  }

  getfactorial(a: number): number {
    let fact = 1;
    for (let i = 1; i <= a; i++) {
      fact = fact * i;
    }
    return fact;
  }

  changeName() {
    this.empname = "Aravind";
  }

  changeEmail() {
    this.email = "aravind@gmail.com";
  }

  changeImage() {
    this.imagepath = "./assets/AngularJS_logo.svg.png";
  }
}
