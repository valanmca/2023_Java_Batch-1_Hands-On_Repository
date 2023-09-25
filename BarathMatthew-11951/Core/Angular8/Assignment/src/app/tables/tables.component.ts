import { Component } from '@angular/core';
import { MultiService } from '../multi.service';

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent {
  num1:number=0;
  num2:number=0;
  num:number=0;
  coll : number[];
 
  
  constructor(private tab: MultiService){
    
    this.coll=[1,2,3,4,5,6,7,8,9,10 ]
      
  }

  getMulti(num1:number,num2:number):number{
    this.num1=num1;
    this.num2=num2;
    return this.num = this.tab.getMultiplication(this.num1,this.num2);
  }
  
}
