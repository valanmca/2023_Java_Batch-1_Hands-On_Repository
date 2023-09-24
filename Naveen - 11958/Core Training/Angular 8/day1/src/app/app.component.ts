import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employeeid : number ;
  employeename : string ;
  employeesalary : number ; 
  constructor()
  {
    this.employeeid=101 ;
    this.employeename="Naveenraj" ;
    this.employeesalary=100000 ; 
  }
  getaddition(a : number , b : number ) : number
  {
let sum = a + b ;
return sum ;
  }
  getfactorial(c : number ) : number{
    let i : number;
    let fact = 1;
    for(i=1;i<=c;i++)
    {
      fact = fact * i ;
    }
    return fact ;
  }
}