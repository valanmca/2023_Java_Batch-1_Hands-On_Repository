import { Component } from '@angular/core';
import { MultiplyTablesService } from '../multiply-tables.service';

@Component({
  selector: 'app-assignment4-services',
  templateUrl: './assignment4-services.component.html',
  styleUrls: ['./assignment4-services.component.css']
})
export class Assignment4ServicesComponent  {
  
  n : number[] = [];
  MultiplyTablesService: any;

  constructor(private tabl : MultiplyTablesService){
   this.n = [1,2,3,4,5,6,7,8,9,10];
   
    
  }
  ans : number =0;
  getMultipli(a:number,b:number):number{
    return this.ans = this.tabl.getTable(a,b);
    }
  }

  // constructor(private obj:MultiplyTablesService){
  //   const table1 = this.obj.getMultiplicationTable();
  // }

// multiplicationTable : number[];
// constructor(private obj : MultiplyTablesService){
//   this.multiplicationTable = this.obj.getMultiplication(5);

// }

// }
