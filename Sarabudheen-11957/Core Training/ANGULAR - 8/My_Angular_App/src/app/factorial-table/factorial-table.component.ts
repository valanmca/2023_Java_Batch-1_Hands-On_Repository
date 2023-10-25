import { Component } from '@angular/core';

@Component({
  selector: 'app-factorial-table',
  templateUrl: './factorial-table.component.html',
  styleUrls: ['./factorial-table.component.css']
})
export class FactorialTableComponent {




    

  getfactorial(a : number):number
{
let i,fact = 1;
for(i=1;i<=a;i++) 
{
fact=fact*i;
}
return fact;  
}

}
