import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiplyService {

  constructor() {

   }
   getMultiplication(a:number,b:number){
    return(a*b);
   }
}
