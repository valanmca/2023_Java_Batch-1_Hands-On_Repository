import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }

  empid:number;
  empname:string;
  empsalary:number;
  email:string;

  constructor(){
        this.empid=101;
        this.empname="steve";
        this.empsalary=20000;
        this.email="steve007@gmail.com";
  }

  getadd(a:number,b:number):number
  {
      let sum=a+b;
      return sum; 
  }
  getfact(a:number): number
  {
    let fact=1;
    for( let i=1;i<=a;i++) {
      fact = fact*i;  
    }
    return fact;  
  }
}
