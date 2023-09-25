import { Component } from '@angular/core';

@Component({
  selector: 'app-child-two',
  templateUrl: './child-two.component.html',
  styleUrls: ['./child-two.component.css']
})
export class ChildTwoComponent {

  empid:number;
  empname:string;
  empsalary:number;

  constructor()
  {
    this.empid=101;
    this.empname="mahesh";
    this.empsalary=15000;    
  }

  find_fact(fact_input: number): number {
    let result = 1;
    for (let index = 1; index <= fact_input; index++) {
      result = fact_input * index;
    }
    return result;
  }

}
