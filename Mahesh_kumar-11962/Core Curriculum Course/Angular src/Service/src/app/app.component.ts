import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


num1:number = 0;
num2:number = 0;
res:number = 0;

constructor(private calc : CalculatorService)
{
this.res = calc.getAddition(this.num1,this.num2);
this.res = calc.getSubraction(this.num1,this.num2);
}

getAdd()
{
 this.res = this.calc.getAddition(this.num1,this.num2); 
}

getSub()  
{
 this.res = this.calc.getSubraction(this.num1,this.num2); 
}

}
