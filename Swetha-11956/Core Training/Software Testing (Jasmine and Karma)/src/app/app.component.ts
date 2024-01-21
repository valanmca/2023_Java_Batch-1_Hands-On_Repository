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

  Multiplication(a : number, b : number) : number {
    return a * b;
  }

  Factorial (a : number) : number { 
     let i=1;
     let fact=1;
     for(i=1;i<=a;i++){
      fact=fact*i;
     }
     return fact;
  }

  Prime (n : number)  {
    if (n<=1){
      return false;
    }
    for(let i=2;i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }

  */
 
//   name : string;
//  email : string;
//  constructor(){
//   this.name = 'Swetha';
//   this.email = 'swethacse2002@gmail.com';
//  }

loginForm: FormGroup;
 
  constructor() {
    this.loginForm = new FormGroup ( {
       username : new FormControl('example@gmail.com', Validators.compose([Validators.required])),
       password : new FormControl('', Validators.compose([Validators.required]))
    });
  }
}


