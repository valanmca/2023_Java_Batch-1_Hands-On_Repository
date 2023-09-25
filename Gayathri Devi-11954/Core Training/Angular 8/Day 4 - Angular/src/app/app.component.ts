import { Component } from '@angular/core';
import { CalcService } from './calc.service';
import { FactorialService } from './factorial.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Day4-Angular';
   mul : number;
   div : number;
   facto : number;
   constructor(private calc : CalcService,fact:FactorialService){
    this.mul = calc.getMultiplication(10,20);
    this.div = calc.getDivision(10,20);
    this.facto = fact.getFactorial(5);
   }

}
