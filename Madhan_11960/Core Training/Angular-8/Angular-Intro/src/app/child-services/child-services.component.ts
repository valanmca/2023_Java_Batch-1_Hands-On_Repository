import { Component } from '@angular/core';
import {DataServiceService} from "../data-service.service"

@Component({
  selector: 'app-child-services',
  templateUrl: './child-services.component.html',
  styleUrls: ['./child-services.component.css'],
  providers:[DataServiceService]
})
export class ChildServicesComponent {
   infoReceived1: string[]=[];
   infoReceived2: string[]=[];
   infoReceived3: string[]=[];
   constructor(private dservice :DataServiceService)
   {

   }

   getInfofromService1()
   {
    this.infoReceived1=this.dservice.getInfo1();
   }
   getInfofromService2()
   {
    this.infoReceived2=this.dservice.getInfo2();
   }
   getInfofromService3()
   {
    this.infoReceived3=this.dservice.getInfo3();
   }

  
}
