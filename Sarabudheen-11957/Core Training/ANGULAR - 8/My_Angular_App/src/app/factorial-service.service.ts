import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialServiceService {

  getFactorial(a:number){
    let fact = 1;
    let i = 1;
    for(i=1;i<=a;i++){
      fact = fact * i;
    }
    return (fact)
  }
}
