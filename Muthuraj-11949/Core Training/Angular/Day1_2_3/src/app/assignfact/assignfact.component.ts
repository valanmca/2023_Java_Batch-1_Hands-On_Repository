import { Component } from '@angular/core';

@Component({
  selector: 'app-assignfact',
  templateUrl: './assignfact.component.html',
  styleUrls: ['./assignfact.component.css']
})
export class AssignfactComponent
{
  getFact( a: number): number{
    let fact = 1,i;
    for(i=1; i<= a;i++)
    {
      fact=fact*i;
       }
    return fact;
  }
}
