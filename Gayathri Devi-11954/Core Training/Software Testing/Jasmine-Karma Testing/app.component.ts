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
  factorial(a: number): number {
    let fact = 1;
    let i = 1;
    for (i = 1; i <= 5; i++) {
      fact = fact * i;
    }
    return fact;
  }
  prime(a: number):boolean{
    if(a>1){
    for(let i=2;i<a;i++){
      if(a%i==0){
        return false;
      }
    }
  }
  if(a<=1){
    return false;
  }
    return true;
  
  }

}
