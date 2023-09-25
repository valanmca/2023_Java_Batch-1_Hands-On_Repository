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

  constructor()
  {
    this.empid=101;
    this.empname="mahesh";
    this.empsalary=15000;    
  }

  getaddition(a:number,b:number) : number
  {
    let sum=a+b;
    return sum;
  }

  getfact(factnum:number):number{
    
    let resultfact=1;
    for(let index=1;index<=factnum;index++)
    {
      resultfact=resultfact*index;
    }

    return resultfact;
  }
}

