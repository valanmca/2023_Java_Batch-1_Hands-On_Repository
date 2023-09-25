import { Component } from '@angular/core';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-comp3',
  templateUrl: './comp3.component.html',
  styleUrls: ['./comp3.component.css']
})
export class Comp3Component {

  input:number=0;
  Fact_result:number =0;

  constructor(private fact : FactorialService)
  {
    this.Fact_result=fact.factorial(this.input);

  }

  getfact()
  {
    this.Fact_result = this.fact.factorial(this.input);
  }
}
