import { Component } from '@angular/core';
import { Doctor } from './model/doctor';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'doctor';
  doctor:Doctor;
  result:string="";
  docList:Doctor[]=[];
  doctorList:Doctor[]=[];
  flag:boolean=false;
  constructor(private service :DataService)
  {
    this.doctor=new Doctor();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }


  insert(data:any)
  {
    this.doctor.id=data.id;
    this.doctor.name=data.name;
    this.doctor.age=data.age;
    this.doctor.email=data.email;
    this.doctor.specialized=data.specialized;
    this.doctor.contact=data.contact;
    this.doctor.location=data.location;
    this.result=this.service.insert(this.doctor);
    this.getAllDetails();


  }
  update(data:any)
  {
    this.doctor.id=data.id;
    this.doctor.name=data.name;
    this.doctor.age=data.age;
    this.doctor.email=data.email;
    this.doctor.specialized=data.specialized;
    this.doctor.contact=data.contact;
    this.doctor.location=data.location;
    this.result=this.service.update(this.doctor);
    this.getAllDetails();


  }
  delete(data:any)
  {
    this.doctor.id=data.id;
    this.doctor.name=data.name;
    this.doctor.age=data.age;
    this.doctor.email=data.email;
    this.doctor.specialized=data.specialized;
    this.doctor.contact=data.contact;
    this.doctor.location=data.location;
    this.result=this.service.delete(this.doctor);
    this.getAllDetails();


  }

  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      doctors=>this.docList=doctors
    );


  }
}
