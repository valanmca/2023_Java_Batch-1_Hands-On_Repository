import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-calccomponent',
  templateUrl: './calccomponent.component.html',
  styleUrls: ['./calccomponent.component.css']
})
export class CalccomponentComponent {
  sum:number;
  sub:number;
  num1:number=0;
  num2:number=0;
  res:number=0;

  constructor(private calc: CalculatorService){
    this.sum=calc.getAddition(10,20);
    this.sub=calc.getSubtraction(10,20);

    this.res=calc.getAddition(this.num1,this.num2);
    this.res=calc.getSubtraction(this.num1,this.num2);
    this.res=calc.getMultiplication(this.num1,this.num2);
    this.res=calc.getDivision(this.num1,this.num2);
  }

  getAdd(){
    this.res=this.calc.getAddition(this.num1,this.num2);
  }

  getSub(){
    this.res=this.calc.getSubtraction(this.num1,this.num2);
  }

  getMul(){
    this.res=this.calc.getMultiplication(this.num1,this.num2);
  }
  
  getDiv(){
    this.res=this.calc.getDivision(this.num1,this.num2);
  }

}
