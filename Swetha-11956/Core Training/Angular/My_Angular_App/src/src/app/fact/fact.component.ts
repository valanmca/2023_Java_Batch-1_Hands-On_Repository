import { Component } from '@angular/core';

@Component({
  selector: 'app-fact',
  templateUrl: './fact.component.html',
  styleUrls: ['./fact.component.css']
})
export class FactComponent {
  factorial:number[];

  constructor(){
    this.factorial=[1,2,3,4,5,6,7,8,9,10];
  }
  
  getFactorial(n:number):number{
    let i;
    let fact=1;
    for(i=1;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }
}
