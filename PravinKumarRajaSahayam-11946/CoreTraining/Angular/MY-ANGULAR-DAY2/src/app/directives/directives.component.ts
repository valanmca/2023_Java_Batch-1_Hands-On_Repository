import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {
flag : boolean ;
bike : boolean ;
vehicles : string[] ;
selectedVehicle : string = "" ;
constructor()
{
  this.flag = true ;
  this.vehicles = ["car" , "bike" , "autos"] ;
  this.bike = true ;
}
changeFlag()
{ 
  this.flag = ! this.flag ;
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
