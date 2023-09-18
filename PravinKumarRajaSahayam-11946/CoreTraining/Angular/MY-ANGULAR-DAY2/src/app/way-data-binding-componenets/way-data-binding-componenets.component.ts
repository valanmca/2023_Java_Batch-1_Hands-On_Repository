import { Component } from '@angular/core';

@Component({
  selector: 'app-way-data-binding-componenets',
  templateUrl: './way-data-binding-componenets.component.html',
  styleUrls: ['./way-data-binding-componenets.component.css']
})
export class WayDataBindingComponenetsComponent {
  eid : number ; 
  ename : string ;
  esalary : number ;
  email : string ;
  imagePath : string ;
  imageheight : number ;
  imagewidth  : number ;
  name : string = "" ;
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
  changeID()
  {
    this.eid = 105 ;
  }
  changeName()
  {
    this.ename = "Surya" ;
  }
  changeSalary()
  {
    this.esalary = 1010000 ;
  }
  changeEmail()
  {
    this.email = "rjpravins146@gmail.com" ;
  }
  changeImage()
  {
    this.imagePath = "./assets/angulars8.jpg" ;
  }
  changeIDa()
  {
    if(this.eid = 101)
    this.eid = 105 ;
    else
    this.eid = 101 ;
  }
  changeNamea()
  {
    if(this.ename = "PravinKumar RajaSahayam")
    this.ename = "Surya" ;
    else
    this.ename= "PravinKumar RajaSahayam" ;
  }
  changeSalarya()
  {
    if(this.esalary = 1000000)
    this.esalary = 1010000 ;
    else
    this.esalary = 1000000 ;
  }
  changeEmaila()
  {
    if(this.email = "rjpravins146@gamil.com")
    this.email = "rjpravins146@gmail.com" ;
    else
    this.email = "rjpravins146@gmail.com" ;
  }
  changeImagea()
  {
    if(this.imagePath = "./assets/angulars.png")
    this.imagePath = "./assets/angulars8.jpg" ;
    else
    this.imagePath = "./assets/angulars.png" ;
  }
}
