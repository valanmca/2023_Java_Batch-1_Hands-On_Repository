import { Component } from '@angular/core';
import { MultiplyTableService } from '../multiply-table.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class AngularFormComponent {
  a: number[];
  a1: number;
  constructor(private tab:MultiplyTableService){
    this.a=[1,2,3,4,5,6,7,8,9,10];
    this.a1=1;
  }
  c: number=0;
  getMultiply(a:number, b:number):number{
    return this.c= this.tab.getTable(a,b);
  }
}
