import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

  constructor() { }
  getFactorial(a : number)
  {
var fact = 1 ;  
var i ;     
for(i=1;i<=a;i++)
{
  fact = fact*i ;
}
return (fact);
  }
}
