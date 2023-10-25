import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  getaddition(a:number,b:number){
    return(a+b);
  }
  getsubtraction(a:number,b:number){
    return(a-b);
  }
  getmultiplication(a:number,b:number){
    return(a*b);
  }
  getdivision(a:number,b:number){
    return(a/b);
  }
 
}
