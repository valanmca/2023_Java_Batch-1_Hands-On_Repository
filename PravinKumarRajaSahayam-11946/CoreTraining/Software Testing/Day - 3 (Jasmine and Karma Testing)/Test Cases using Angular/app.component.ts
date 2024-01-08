import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
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
  primeNumber(a : number, flag : boolean = true , i : number = 2) : boolean {
    flag = true;
    for (i = 2; i <= a / 2; ++i) {
      if (a % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
  factorial(a : number , fact : number = 1 , i : number = 1) : number { 
 if(a >= 1)
{
  for(i=1;i<=a;i++){    
    fact=fact*i;    
} 
}
if(a <= -1)
{
  return i;
}  
    return fact;  
   }  
  }