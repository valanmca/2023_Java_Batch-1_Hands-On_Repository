import { Component } from '@angular/core';

@Component({
  selector: 'app-child-one',
  templateUrl: './child-one.component.html',
  styleUrls: ['./child-one.component.css']
})
export class ChildOneComponent {
  empid:number;
  empname:string;
  empsalary:number;

  constructor()
  {
    this.empid=101;
    this.empname="mahesh";
    this.empsalary=15000;    
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
