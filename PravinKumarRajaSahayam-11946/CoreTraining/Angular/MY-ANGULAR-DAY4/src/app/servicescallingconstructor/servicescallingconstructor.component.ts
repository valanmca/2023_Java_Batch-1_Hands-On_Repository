import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-servicescallingconstructor',
  templateUrl: './servicescallingconstructor.component.html',
  styleUrls: ['./servicescallingconstructor.component.css']
})
export class ServicescallingconstructorComponent {
mul : number ;
div : number ;
fac : number ;
constructor(private calc : CalculatorService , private facts : FactorialService) 
{
  this.mul = calc.getMultiplication(10 , 80);
  this.div = calc.getDivision(10 , 50);
  this.fac = facts.getFactorial(10);
}
}
