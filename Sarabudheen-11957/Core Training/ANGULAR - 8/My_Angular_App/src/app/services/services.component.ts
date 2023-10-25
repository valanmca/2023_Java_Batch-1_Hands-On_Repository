import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialServiceService } from '../factorial-service.service';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css']
})
export class ServicesComponent {

  sum : number;
  sub : number;
  mul : number;
  div : number;
  fact : number;

  constructor(private calc : CalculatorService,private factorial : FactorialServiceService){
    this.sum = calc.getAddition(10,20);
    this.sub = calc.getSubtraction(10,20);
    this.mul = calc.getMultiplication(10,20);
    this.div = calc.getDivision(10,20);
    this.fact = factorial.getFactorial(5);
  
  }
 
}

