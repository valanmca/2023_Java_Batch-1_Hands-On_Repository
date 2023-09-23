import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-child41',
  templateUrl: './child41.component.html',
  styleUrls: ['./child41.component.css']
})
export class Child41Component {
  mul:number;
div: number;


constructor(private calc: CalculatorService){

  this.mul=calc.getMultiplication(10,10);
  this.div=calc.getDivision(12,10);

}
}
