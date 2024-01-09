import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  /*addition(a : number, b : number) : number {
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
   }  */
/*name : string;
email : string;
  constructor() {
    this.name = 'PravinKumar';
    this.email = 'rjpravin146@gmail.com';
  }*/
  loginForm: FormGroup;
 
  constructor() {
    this.loginForm = new FormGroup ( {
       username : new FormControl('rjpravin146@gmail.com', Validators.compose([Validators.required])),
       password : new FormControl('', Validators.compose([Validators.required]))
    });
  }
}