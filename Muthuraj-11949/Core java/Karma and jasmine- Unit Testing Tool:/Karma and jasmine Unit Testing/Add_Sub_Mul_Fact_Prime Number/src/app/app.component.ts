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
   factorial(a:number){
    var fact:number=1;
    for(var i=1;i<=a;i++){
      fact =fact*i;
    }
    return fact;
    
}
isPrime(a:number){
  var flag:boolean=true;
  for(var i=2;i<=a/2;i++){
    if(a%i==0){
      flag=false;
      Boolean;
    }
  }
  return flag;
}
}
