import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  addition(a: number, b: number): number {
    return a + b;
  }
  subtraction(a: number, b: number): number {
    return a - b;
  }
  multiplication(a: number, b: number): number {
    return a * b;
  }
  divsion(a: number, b: number): number {
    return a / b;
  }
  factorial(a: number): number {
    let i = 1;
    let fact = 1;
    for (i = 1; i <= a; i++) {
      fact = fact * i;
    }
    return fact;
  }
  isPrime(a: number) {
    if (a <= 1) {
      return false;
    }
    for (let i = 2; i < a; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}