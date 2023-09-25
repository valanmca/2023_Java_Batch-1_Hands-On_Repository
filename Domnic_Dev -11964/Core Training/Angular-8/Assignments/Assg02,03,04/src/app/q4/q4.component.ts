import { Component } from '@angular/core';
import { MultiplicationtableService } from '../multiplicationtable.service';

@Component({
  selector: 'app-q4',
  templateUrl: './q4.component.html',
  styleUrls: ['./q4.component.css']
})
export class Q4Component {
  Digits: number[];
  result: number = 0;
   
  constructor(private cal: MultiplicationtableService){
    this.Digits=[1,2,3,4,5,6,7,8,9,10];
  }

  getMultiplicationTable(Digit : number,Table : number): number {
    return this.result=this.cal.getTable(Digit,Table);
  }
}
