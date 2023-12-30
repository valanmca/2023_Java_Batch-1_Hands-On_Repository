import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiplicationService {
  getMultiply(a:number,b:number):number{
    return (a*b);
  }

  constructor() { }
}
