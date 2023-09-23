import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  flag : boolean ;
bike : boolean ;
vehicles : string[] ;
selectedVehicle : string = "" ;
myStyle : {} ;
Style : boolean ;
styles : {} ;
myColor : string ;
myClass : string ;
myClassColor : string ;
constructor()
{
  this.flag = true ;
  this.vehicles = ["car" , "bike" , "autos"] ;
  this.bike = true ;
  this.myStyle = {'color' : 'red' , 'cursor' : 'pointer'} ;
  this.Style = true ;
  this.styles = {'color' : 'lightred' , 'cursor' : 'pointer'} ;
  this.myColor = "green" ;
  this.myClass = "MyClass1" ;
  this.myClassColor = "MyClasss" ;
}
changeFlag()
{ 
  this.flag = ! this.flag ;
}
changeColor()
{
  if(this.myColor == "green")
  {
    this.myColor = "red";
  }
  else{
    this.myColor = "green" ;
  }
}
changeClass()
{
  if(this.myClassColor == "MyClasss")
  {
    this.myClassColor = "MyClass1";
  }
  else{
    this.myClassColor = "MyClasss" ;
  }
}
/*changeBike()
{
  this.bike = ! this.bike ;
}*/
/*selectedVehicles : string = "";
setSelectedVehicles(selectedVehicles : string)
{
  this.selectedVehicles = selectedVehicles;
}*/

setSelectedVehicle(vec : string)
{
this.selectedVehicle = vec ;
}


}
