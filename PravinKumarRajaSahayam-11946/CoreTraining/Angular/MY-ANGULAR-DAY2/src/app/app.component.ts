import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 eid : number ; 
 ename : string ;
 esalary : number ;
 email : string ;
 constructor()
 {
  this.eid = 101 ;
  this.ename = "Pravinkumar RajaSahayam" ;
  this.esalary = 1000000 ;
  this.email = "rjpravins146@gmail.com" ;
 }
 getAddition(a : number , b : number ) : number 
 {
  let sum ;
  sum = a + b ;
  return sum ;
 }
}
