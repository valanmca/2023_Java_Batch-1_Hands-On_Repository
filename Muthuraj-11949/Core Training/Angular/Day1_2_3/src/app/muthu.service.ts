import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class MuthuService {
    getaddition(a: number ,b: number){
      return(a+b);
    }
    getsubtraction(a: number, b: number){
      return(a-b);
    }
    getmultiplication(a: number, b: number){
      return(a*b);
    }
    getdivison(a: number , b: number){
      return(a/b);
    }  
    getFactorial(c:number):number{
      let i=1;
      let fact=1;
      for( i=1;i<=c;i++){
        fact=fact*i;
      }return fact;
    }
    
}
