import { Component } from '@angular/core';
import { ServicetmsService } from './Service/servicetms.service';
import { Doctor} from './ModelTeacher/Doctor';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'DMS';
 

  mt: Doctor;
  result:string="";
  //doctorList:Doctor[]=[];
  modelDoctorList:Doctor[]=[];
  flag:boolean=false;
modelList: any;
  
  
  constructor(private service :ServicetmsService)
  {
    this.mt=new Doctor();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }


  insert(data:any)
  {
    this.mt.id=data.id;
    this.mt.name=data.name;
    this.mt.age=data.age;
    this.mt.email=data.email;
    this.mt.special=data.special;
    this.mt.contact=data.contact;
    this.mt.location=data.location;
    alert(this.result=this.service.insert(this.mt));
    this.getAllDetails();
    //this.myForm.reset();


  }
  update(data:any)
  {
    if(data.id == "" ){
    // || data.name == "" || data.depart == "" || data.dur ==""){
      alert("All Fields must be enter");
    }
    
    else{
      this.mt.id=data.id;
    this.mt.name=data.name;
    this.mt.age=data.age;
    this.mt.email=data.email;
    this.mt.special=data.special;
    this.mt.contact=data.contact;
    this.mt.location=data.location;
    alert(this.result=this.service.update(this.mt));    
    this.getAllDetails();
  }

  }
  delete(data:any)
  {
    if(data.id == "" ){
      // || data.name == "" || data.depart == "" || data.dur ==""){
      alert("All Fields must be enter");
    }
    else{
   
      this.mt.id=data.id;
    this.mt.name=data.name;
    this.mt.age=data.age;
    this.mt.email=data.email;
    this.mt.special=data.special;
    this.mt.contact=data.contact;
    this.mt.location=data.location;
    alert(this.result=this.service.delete(this.mt));    
    this.getAllDetails();
  }

  }

  
  getAllDetails()
  {
    this.service.getAlldetails().subscribe( ans=>this.modelDoctorList=ans );


  }

}

