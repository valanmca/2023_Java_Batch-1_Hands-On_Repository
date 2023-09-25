import { Component } from '@angular/core';

@Component({
  selector: 'app-assign-one',
  templateUrl: './assign-one.component.html',
  styleUrls: ['./assign-one.component.css']
})
export class AssignOneComponent {



  values: number[];

  constructor()
  {
    this.values=[1,2,3,4,5,6,7,8,9,10];

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
