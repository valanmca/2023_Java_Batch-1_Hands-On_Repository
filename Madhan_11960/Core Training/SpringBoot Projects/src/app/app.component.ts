import { Component } from '@angular/core';
import { HospitalService } from './hospital.service';
import { hospital } from './Model/hospital';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hospital-http';

  Hospital : hospital;
  result : string ="";

  constructor(private service : HospitalService)
  {
    this.Hospital=new hospital();
  
  }

  inserthospital(data:any)
  {
   this.Hospital.name =data.name;
   this.Hospital.age=data.age;
   this.Hospital.contact=data.contact;
   this.Hospital.address=data.address;

   this.result=this.service.inserthospital(this.Hospital);

  //  this.getAllhospitals(); //to update automatically by not reusing the code
  }

  updatehospital(data:any) 
  {
    this.Hospital.name =data.name;
    this.Hospital.age=data.age;
    this.Hospital.contact=data.contact;
    this.Hospital.address=data.address;
 
    this.result=this.service.inserthospital(this.Hospital);

  //  this.getAllhospitals(); //to update changes automatically by not reusing the code
  }

  deletehospital(data:any)
  {
    this.Hospital.name =data.name;
    this.Hospital.age=data.age;
    this.Hospital.contact=data.contact;
    this.Hospital.address=data.address;
 
    this.result=this.service.inserthospital(this.Hospital);
    
  //  this.getAllhospitals(); //to update automatically by not reusing the code
  }

}
