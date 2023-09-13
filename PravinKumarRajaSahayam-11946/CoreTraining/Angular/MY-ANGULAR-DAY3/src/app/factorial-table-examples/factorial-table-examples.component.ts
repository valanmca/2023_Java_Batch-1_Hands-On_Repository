import { Component } from '@angular/core';

@Component({
  selector: 'app-factorial-table-examples',
  templateUrl: './factorial-table-examples.component.html',
  styleUrls: ['./factorial-table-examples.component.css']
})
export class FactorialTableExamplesComponent {
  flags : boolean ;
  div1 : string[] ;
  div2 : string[] ;
  div3 : string[] ;
  div4 : string[] ;
  div5 : string[] ;
  div6 : string[] ;
  div7 : string[] ;
  div8 : string[] ;
  div9 : string[] ;
  div10 : string[] ;
  selectedVehicle : string = "" ;
  vehicles1 : string[] ;
  vehicles2 : string[] ;
  vehicles3 : string[] ;
  vehicles4 : string[] ;
  vehicles5 : string[] ;
  vehicles6 : string[] ;
  vehicles7 : string[] ;
  vehicles8 : string[] ;
  vehicles9 : string[] ;
  vehicles10 : string[] ;
  constructor()
  {
    this.flags = true ;
    this.div1 = ["1"] ;
    this.div2 = ["2"] ;
    this.div3 = ["6"] ;
    this.div4 = ["24"] ;
    this.div5 = ["120"] ;
    this.div6 = ["720"] ;
    this.div7 = ["5040"] ;
    this.div8 = ["40320"] ;
    this.div9 = ["362880"] ;
    this.div10 = ["3628800"] ;
    this.vehicles1 = ["1"] ;
    this.vehicles2 = ["2"] ;
    this.vehicles3 = ["6"] ;
    this.vehicles4 = ["24"] ;
    this.vehicles5 = ["120"] ;
    this.vehicles6 = ["720"] ;
    this.vehicles7 = ["5040"] ;
    this.vehicles8 = ["40320"] ;
    this.vehicles9 = ["362880"] ;
    this.vehicles10 = ["3628800"] ;
  }

}
