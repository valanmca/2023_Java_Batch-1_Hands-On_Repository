import { Component } from '@angular/core';

@Component({
  selector: 'app-eventsbindingcomponents',
  templateUrl: './eventsbindingcomponents.component.html',
  styleUrls: ['./eventsbindingcomponents.component.css']
})
export class EventsbindingcomponentsComponent {

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
  }
  

