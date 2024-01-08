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
    return ((a) * (b));
  }


  getFactorial(a: number): number {

    var fact: number = 1;


    if (a >= 1 || a == 0) {


      for (var i: number = 1; i <= a; i++) {

        fact = fact * i;
      }
    }
    else {
      fact = 0;
    }


    return fact;
  }

  isPrime(a: number): boolean {

    var temp: boolean = true;

    if (a == 0 || a == 1) {
      temp = false;
    }

    for (var i: number = 2; i <= a / 2; i++) {
      if (a % i == 0) {
        temp = false;
        break;
      }
    }
    return temp;


  }





}
