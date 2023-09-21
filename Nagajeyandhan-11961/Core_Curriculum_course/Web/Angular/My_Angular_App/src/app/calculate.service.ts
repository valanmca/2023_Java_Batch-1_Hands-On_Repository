import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculateService {

  getAdd(a: number, b:number){
    return (a+b)
  }
  getSub(a: number, b:number){
    return (a-b)
  }
  getMul(a: number, b:number){
    return (a*b)
  }
  getDiv(a: number, b:number){
    return (a/b)
  }
  constructor() { }
}
