import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding-components',
  templateUrl: './property-binding-components.component.html',
  styleUrls: ['./property-binding-components.component.css']
})
export class PropertyBindingComponentsComponent {
  eid : number ; 
  ename : string ;
  esalary : number ;
  email : string ;
  imagePath : string ;
  imageheight : number ;
  imagewidth  : number ;
  constructor()
  {
   this.eid = 101 ;
   this.ename = "Pravinkumar RajaSahayam" ;
   this.esalary = 1000000 ;
   this.email = "rjpravins146@gmail.com" ;
   this.imagePath = "./assets/angulars.png" ;
   this.imageheight = 80 ;
   this.imagewidth = 100 ; 
  }
  getAddition(a : number , b : number ) : number 
  {
   let sum ;
   sum = a + b ;
   return sum ;
  }
}
