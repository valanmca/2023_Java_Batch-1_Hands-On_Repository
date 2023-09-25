import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  empid: number;
  empname: string;
  empsalary: number;

  MyName: string;
  constructor() {
    this.empid = 101;
    this.empname = "mahesh";
    this.empsalary = 15000;
    this.MyName = "";
  }


  factorial(argument : number): number
  {
    let factresult=1;
    for(let index =1;index<= argument;index++)
    {
      factresult =factresult*index;
    }
    return factresult;
  }


}
