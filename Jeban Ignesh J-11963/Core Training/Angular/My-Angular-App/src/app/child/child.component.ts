import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  sum:number;
  

  constructor(private calc:CalculatorService){
    this.sum=calc.getaddition(10,20);

  }

}
