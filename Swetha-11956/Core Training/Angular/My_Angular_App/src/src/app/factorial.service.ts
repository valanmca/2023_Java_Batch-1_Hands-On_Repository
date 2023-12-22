import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

  getFactorial(n:number):number{
    let i;
    let fact=1;
    for(i=1;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }
}
