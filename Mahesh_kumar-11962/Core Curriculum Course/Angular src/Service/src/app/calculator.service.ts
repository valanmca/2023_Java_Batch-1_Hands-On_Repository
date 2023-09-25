import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {

getAddition(first_val : number,second_val : number){
  return (first_val + second_val);
}

getSubraction(first_val : number,second_val : number){
  return (first_val - second_val);
}
getMultiplication(first_val : number,second_val : number){
  return (first_val * second_val);
}
getDevision(first_val : number,second_val : number){
  return (first_val / second_val);
}


}
