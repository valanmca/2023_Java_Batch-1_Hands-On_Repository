import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  empid:number;
  email:string;
  constructor(){
    this.empid=1001;
    this.email="aravind@gmail.com"
  }

  getaddition(a:number,b:number) :number{
    let sum=a+b;
    return  sum;

  }
}
