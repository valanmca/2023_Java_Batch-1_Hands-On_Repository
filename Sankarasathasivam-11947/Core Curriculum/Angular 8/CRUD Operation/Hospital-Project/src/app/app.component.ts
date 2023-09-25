import { Component } from '@angular/core';
import { Patient } from './model/Patient';
import { PatientService } from './patient.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  patient:Patient;
  result:string="";

  constructor(private service:PatientService){
    this.patient=new Patient();
    //this.getAllPatients();
  }

  InsertPatient(data:any){
    this.patient.name=data.name;
    this.patient.age=data.age;
    this.result=this.service.InsertPatient(this.patient);
    //this.getAllPatients();
  }

  // getAllPatients(){
  //   this.service.getAllPatientDetails().subscribe( patients => this.patList=patients);
  // }
}
