import { Component } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-child-emp-info',
  templateUrl: './child-emp-info.component.html',
  styleUrls: ['./child-emp-info.component.css'],
  providers:[DataService]
})
export class ChildEmpInfoComponent {
  infoReceived1 :string[]=[];
  infoReceived2 :string[]=[];
  infoReceived3 :string[]=[];
  num:number;
  a:number=0;
  result:number=0
 

  constructor(private dservice:DataService){
    this.num=0;
   

  }

  getInfoFromServices1(){
this.infoReceived1=this.dservice.getInfo1()
  }

  getInfoFromServices2(){
    this.infoReceived2=this.dservice.getInfo2()
  }

  getInfoFromServices3(){
    this.infoReceived3=this.dservice.getInfo3()
  }

 getid1(){
return this.num=this.dservice.getid();
 }
 getfact()
 {
  return this.result=this.dservice.getfactorial(this.a);
 }
}
