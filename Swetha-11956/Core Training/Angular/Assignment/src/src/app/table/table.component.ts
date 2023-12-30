import { Component } from '@angular/core';
import { MultiplicationService } from '../multiplication.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {
  table:number[];
  result:number=0;

  constructor(private service: MultiplicationService){
    this.table=[1,2,3,4,5,6,7,8,9,10];

  }
  getMul(a:number,b:number):number{
    return (this.result=this.service.getMultiply(a,b));
  }
}
