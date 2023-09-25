import { Component } from '@angular/core';
import { CalcService } from '../calc.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-service-calculator',
  templateUrl: './service-calculator.component.html',
  styleUrls: ['./service-calculator.component.css']
})
export class ServiceCalculatorComponent {
  sum:number;
  sub:number;
  facto : number;
 
  constructor(private calc : CalcService,private fact : FactorialService){ //constructor injection & private is optional
    this.sum = calc.getAddition(10,20);
    this.sub = calc.getSubtraction(10,20);
    this.facto = fact.getFactorial(5);
   
  }
}
