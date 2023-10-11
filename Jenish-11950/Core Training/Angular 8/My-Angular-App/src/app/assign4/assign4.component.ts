import { Component } from '@angular/core';
import { TableService } from '../table.service';

@Component({
  selector: 'app-assign4',
  templateUrl: './assign4.component.html',
  styleUrls: ['./assign4.component.css']
})
export class Assign4Component {
  a:number[];
  a1:number;
  constructor(private tab:TableService){
    this.a=[1,2,3,4,5,6,7,8,9,10];
    this.a1=1;
  }
  c:number=0;
  getFactorial(a:number,b:number):number{
    return this.c=this.tab.getTable(a,b);
  }

}
