import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalcService {

  getAddition(a:number,b:number){
    return(a+b);
  }
  getSubtraction(a:number,b:number){
    return(a-b);
  }
    getMultiplication(a:number,b:number){
    return(a*b);}

    getDivision(a:number,b:number){
    return(a/b);}
    
  constructor() { }
}
