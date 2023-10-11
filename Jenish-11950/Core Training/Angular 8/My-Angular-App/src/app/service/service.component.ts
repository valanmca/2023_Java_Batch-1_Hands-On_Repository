import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent {
  mul: number;
  div: number;

  getMultiplication() {

  }

  getDivide() {

  }
  constructor(private calc: CalculatorService) {
    this.mul = calc.getMultiplication(5, 5);
    this.div = calc.getDivide(50, 5);
  }
}