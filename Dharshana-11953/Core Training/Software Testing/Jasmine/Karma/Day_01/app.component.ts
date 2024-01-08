import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  addition(a : number, b : number) : number {
    return a + b;
  }
  subtraction(a : number, b : number) : number {
    return a - b;
  }
  multiplication(a : number, b : number) : number {
    return a * b;
  }
  division(a : number, b : number) : number {
    return a / b;
  }
  factorial(a : number) : number{
    let i=1;
    let fact=1;
    for(i=1;i<=a;i++){
      fact = fact*i;
    } return fact;
  }
  isPrime(n : number) {
      if (n <= 1) {
          return false;
      }
      for (let i = 2; i < n; i++) {
          if (n % i == 0) {
              return false;
          }
      }
      return true;
    }
}

