import { Component } from '@angular/core';
import { Patient } from './model/Patient';
import { HeroService } from './hero.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
  patient : Patient;
  result : string="";
  pmslist: Patient[] =[];
  title: any;

  constructor(private service:HeroService){
    this.patient= new Patient();
    this.getAllPatient();
  }

  myFunction(data:any){
    alert("success");
  
  }
  InsertPatient(data:any){
    
    this.patient.patId=data.patId;
    this.patient.patName=data.patName;
    this.patient.patEmail=data.patEmail;
    this.patient.patBloodGroup=data.patBloodGroup;
    this.patient.patPhonenumber=data.patPhonenumber;

    this.result = this.service.insertPatient(this.patient);
    this.getAllPatient();
  }
  DeletePatient(data:any){
    this.patient.patId=data.patId;
    this.patient.patName=data.patName;
    this.patient.patEmail=data.patEmail;
    this.patient.patBloodGroup=data.patBloodGroup;
    this.patient.patPhonenumber=data.patPhonenumber;
    this.result = this.service.deletePatient(this.patient);
    this.getAllPatient();
  }
  UpdatePatient(data:any){
    this.patient.patId=data.patId;
    this.patient.patName=data.patName;
    this.patient.patEmail=data.patEmail;
    this.patient.patBloodGroup=data.patBloodGroup;
    this.patient.patPhonenumber=data.patPhonenumber;
    this.result = this.service.updatePatient(this.patient);
    this.getAllPatient();
  }
  getAllPatient(){
    this.service.getAllPatient().subscribe(patient=>this.pmslist = patient);
  }
}





