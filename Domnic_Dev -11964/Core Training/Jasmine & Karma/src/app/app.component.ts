import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
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

  factorial(num: number): number {
    let fact = 1;
    if (num >= 1 || num == 0) {

      for (let i = 1; i <= num; i++) {
        fact = fact * i;
      }
    }
    else {
      fact = 0;
    }
    return fact;
  }

  prime(num: number): boolean {

    var temp: boolean = true;

    if (num <= 1) {
      temp = false;
    }

    for (let i = 2; i < num; i++) {
      if (num % i == 0) {
        temp = false;
      }
    }

    return temp;

  }

}
