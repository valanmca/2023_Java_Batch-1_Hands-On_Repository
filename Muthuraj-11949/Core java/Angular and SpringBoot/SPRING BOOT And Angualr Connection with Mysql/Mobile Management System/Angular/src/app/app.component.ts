import { Component } from '@angular/core';
import { Mobile } from './model/Mobile';
import { RajService } from './raj.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  mobile : Mobile;
  result : string="";
  moblist: Mobile[] =[];
  title: any;

  constructor(private service:RajService){
    this.mobile= new Mobile();
    this.getAllMobile();
  }

  myFunction(data:any){
    alert("success");
  
  }
  InsertMobile(data:any){
    
    this.mobile.mobID=data.mobID;
    this.mobile.mobBrandName=data.mobBrandName;
    this.mobile.mobModelname=data.mobModelname;
    this.mobile.mobPrice=data.mobPrice;

    this.result = this.service.insertMobile(this.mobile);
    this.getAllMobile();
  }
  DeleteMobile(data:any){
    this.mobile.mobID=data.mobID;
    this.mobile.mobBrandName=data.mobBrandName;
    this.mobile.mobModelname=data.mobModelname;
    this.mobile.mobPrice=data.mobPrice;
  

    this.result = this.service.deleteMobile(this.mobile);
    this.getAllMobile();
  }
  UpdateMobile(data:any){

    this.mobile.mobID=data.mobID;
    this.mobile.mobBrandName=data.mobBrandName;
    this.mobile.mobModelname=data.mobModelname;
    this.mobile.mobPrice=data.mobPrice;
    this.result = this.service.updateMobile(this.mobile);
    this.getAllMobile();
  }
  getAllMobile(){
    this.service.getAllMobile().subscribe(mobile=>this.moblist = mobile);
  }
}





