import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

  constructor() { }

  getfactorial(a: number): number {
    let fact = 1;
    for (let i = 1; i <= a; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
