import { Component } from '@angular/core';
import { Doctor } from './model/Doctor';
import { HttpClient } from '@angular/common/http';
import { DoctorService } from './doctor.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  doctor: Doctor;
  result: string = "";
  docList:Doctor[]=[];

  constructor(private service: DoctorService) {
    this.doctor = new Doctor();
   this. getAllDoctors();
  }

  insertDoctor(data: any) {
    this.doctor.dID = data.dID;
    this.doctor.dName = data.dName;
    this.doctor.dDept = data.dDept;
    this.doctor.dSalary = data.dSalary
    this.result = this.service.insertDoctor(this.doctor);
    this. getAllDoctors();
  }

  updateDoctor(data: any) {
    this.doctor.dID = data.dID;
    this.doctor.dName = data.dName;
    this.doctor.dDept = data.dDept;
    this.doctor.dSalary = data.dSalary
    this.result = this.service.updateDoctor(this.doctor);
    this. getAllDoctors();
  }
  deleteDoctor(data:any)
  {
    this.doctor.dID=data.dID;
    this.result=this.service.deletedoctor(this.doctor);
    this. getAllDoctors();
  }

  getAllDoctors()
  {
    this.service.getAllDoctordetail().subscribe(doctors =>this.docList=doctors)
  }


}
