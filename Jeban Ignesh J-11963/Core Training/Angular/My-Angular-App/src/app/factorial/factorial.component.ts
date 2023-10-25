import { Component } from '@angular/core';

@Component({
  selector: 'app-factorial',
  templateUrl: './factorial.component.html',
  styleUrls: ['./factorial.component.css']
})
export class FactorialComponent {
  factorial:number[];
  constructor(){
    this.factorial=[1,2,3,4,5,6,7,8,9,10];
  }
  getFact( a: number): number{
    let fact = 1;
    let i=1;
    for(i=1;i<=a; i++){
    fact=fact*i;
    }
     return fact;
    }

}
