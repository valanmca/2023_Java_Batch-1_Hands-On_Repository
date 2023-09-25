import { Injectable } from '@angular/core';

@Injectable()
export class FactorialService {

  constructor() { }

  getFactorial(a:number): number
  {
    let fact=1;
    for( let i=1;i<=a;i++) {
      fact = fact*i;  
    }
    return fact;  
  }
}
