import { Component } from '@angular/core';
import { CalculateService } from '../calculate.service';
import { FactorailService } from '../factorail.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css'],
  
})
export class CalculatorComponent {
  num1:number = 0
  num2:number = 0
  fact:number = 0
  result:number = 0
  factRes:number = 0
  getAddition(){
    this.result = this.calcService.getAdd(this.num1,this.num2)
  }
  getSubtraction(){
    this.result = this.calcService.getSub(this.num1,this.num2)
  }
  getMultiplication(){
    this.result = this.calcService.getMul(this.num1,this.num2)
  }
  getDivision(){
    this.result = this.calcService.getDiv(this.num1,this.num2)
  }
  getFactorial(){
    this.factRes = this.factService.getFact(this.fact)
  }

  constructor(private calcService:CalculateService, private factService:FactorailService){}
}
