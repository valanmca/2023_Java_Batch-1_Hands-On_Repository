import { Injectable } from '@angular/core';

@Injectable({
  providedIn:'root'
})
  

export class CalculatorService {

getAddition(a:number,b:number){
  return (a+b);
}
getSubraction(a:number,b:number){
  return (a-b);
}
getMultiplication(a:number,b:number){
  return (a*b);
}
getDivision(a:number,b:number){
  return (a/b);
}
}
