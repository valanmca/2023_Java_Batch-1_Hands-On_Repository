import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiplicationService {

  getMultiplicationTable(a:number,b:number){
      return a*b;
  }
}
