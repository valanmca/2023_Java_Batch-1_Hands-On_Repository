import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

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
