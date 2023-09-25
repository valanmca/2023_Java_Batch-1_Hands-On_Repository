import { Component } from '@angular/core';

@Component({
  selector: 'app-child3',
  templateUrl: './child3.component.html',
  styleUrls: ['./child3.component.css']
})
export class Child3Component {

  listvalue:number[]; 
   
  constructor()
  {     
    this.listvalue=[1,2,3,4,5,6,7,8,9,10];  
   }
   factorial(num :number){
      let temp =1;
      
      for (let i =1;i<=num;i++){
        temp = temp*i;
      }
      return temp;
    }
  


}