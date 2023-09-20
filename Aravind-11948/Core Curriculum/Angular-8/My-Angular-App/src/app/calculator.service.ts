import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor() { }

  getAddition(a:number,b:number):number{
  return(a+b);
  }

  getSubtraction(a:number,b:number):number{
    return(a-b);
    }

    getMultiplication(a:number,b:number):number{
      return(a*b);
      }

      getDivision(a:number,b:number):number{
        return(a/b);
        }
}
