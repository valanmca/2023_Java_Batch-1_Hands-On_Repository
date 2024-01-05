import { Component } from '@angular/core';
import { Doctor } from './model/Doctor';
import { DoctorService } from './doctor.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  doctor:Doctor;
  result:string="";
  docList: Doctor[] = [];
  
  
  constructor(private service:DoctorService){
    this.doctor=new Doctor;
    this.getAllDoctors();

  }
  insertDoctor(data:any){
    this.doctor.dId=data.dId;
    this.doctor.dName=data.dName;
    this.doctor.dAge=data.dAge;
    this.doctor.dEmail=data.dEmail;
    this.doctor.dSpecialization=data.dSpecialization;
    this.doctor.dPhno=data.dPhno;
    this.doctor.dLocation=data.dLocation;
    this.result=this.service.insertDoctor(this.doctor);
    this.getAllDoctors();

  
  }

  updateDoctor(data:any){
    this.doctor.dId=data.dId;
    this.doctor.dName=data.dName;
    this.doctor.dAge=data.dAge;
    this.doctor.dEmail=data.dEmail;
    this.doctor.dSpecialization=data.dSpecialization;
    this.doctor.dPhno=data.dPhno;
    this.doctor.dLocation=data.dLocation;
    this.result=this.service.updateDoctor(this.doctor);
    this.getAllDoctors();

  
  }
  deleteDoctor(data:any){
    this.doctor.dId=data.dId;
    
    this.result=this.service.deleteDoctor(this.doctor);
    this.getAllDoctors();
  
  }
  getAllDoctors() {
    this.service.getAllDoctorDetails().subscribe(doctors => this.docList = doctors);
  }
  }
  


