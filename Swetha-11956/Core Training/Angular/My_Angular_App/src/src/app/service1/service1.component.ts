import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-service1',
  templateUrl: './service1.component.html',
  styleUrls: ['./service1.component.css']
})
export class Service1Component {
  mul:number;
  div:number;
  
constructor(private calc: CalculatorService){
  this.mul=calc.getMultiplication(10,2);
  this.div=calc.getDivision(20,10);
}
}
