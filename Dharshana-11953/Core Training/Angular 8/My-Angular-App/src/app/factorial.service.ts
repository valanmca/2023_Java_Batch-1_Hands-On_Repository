import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {
  getfactorial(c:number):number{
    let i=1;
    let fact=1;
    for(i=1;i<=c;i++){
      fact = fact*i;
    } return fact;
  }
  constructor() { }
}
