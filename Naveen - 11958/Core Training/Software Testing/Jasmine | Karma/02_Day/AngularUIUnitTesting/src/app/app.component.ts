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

  factorial(n : number) : number{
    let fact = 1 ;
    if (n<1){
      fact = 0;
    } else {
    for(let i = 1;i <= n; i++) {
      fact = fact * i;
    }}
  return fact;
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

  name: string;
  email: string;
  constructor(){
    this.name = "Naveenraj";
    this.email = "naveenraj@gmail.com";
  }*/
  LoginForm: FormGroup;
 
  constructor() {
    this.LoginForm = new FormGroup ( {
       username : new FormControl('example@gmail.com', Validators.compose([Validators.required])),
       password : new FormControl('', Validators.compose([Validators.required]))
    });
  }

}
