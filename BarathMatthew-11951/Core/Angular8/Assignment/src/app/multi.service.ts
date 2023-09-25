import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiService {
  getMultiplication(a:number,b:number){
    return(a*b);
  }
  
  constructor() { }
}
