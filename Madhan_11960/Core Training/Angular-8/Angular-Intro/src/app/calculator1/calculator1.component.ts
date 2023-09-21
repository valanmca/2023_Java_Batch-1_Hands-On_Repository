import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calculator1',
  templateUrl: './calculator1.component.html',
  styleUrls: ['./calculator1.component.css']
})
export class Calculator1Component {
  mul : number;
  div : number;
  factorial:number;

  constructor(private calc : CalculatorService,private fact : FactorialService) // Multiple service added
  {
    
    this.mul=calc.getMultiplication(5,5);
    this.div=calc.getDivision(20,5);
    this.factorial=fact.getFact(5);
  }

}
