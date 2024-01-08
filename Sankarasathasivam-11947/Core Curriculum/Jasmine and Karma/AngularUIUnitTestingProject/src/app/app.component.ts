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
  factorial(a: number): any {

    var fact: any = 1;
    if (a >= 0) {


      for (var i: number = 1; i <= a; i++) {
        fact = fact * i;
      }
    } else {
      fact = "Negative values not accepted";
    }

    return fact;
  }
  prime(num: number): boolean {

    if (num <= 1) {
      return false;
    }

    for (let i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;

  }
}
