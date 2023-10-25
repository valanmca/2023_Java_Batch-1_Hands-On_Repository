import { Component } from '@angular/core';
import { MultiplicationService } from '../multiplication.service';

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent {
  table:number[];
  result:number=0;

  constructor(private service:MultiplicationService){
    this.table=[1,2,3,4,5,6,7,8,9,10];

  }
  getmulti(a:number,b:number):number{
    return (this.result=this.service.getMultiply(a,b));
  }

}
