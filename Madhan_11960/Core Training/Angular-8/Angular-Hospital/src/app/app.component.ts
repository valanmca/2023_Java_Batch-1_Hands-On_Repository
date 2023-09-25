import { Component } from '@angular/core';
import { PatientDataService } from './patient-data.service';
import { Patient } from './model/Patient';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hosp-Angularhttp';

   patient : Patient;
  result : string ="";
  patList : Patient[] = [];
  constructor(private service : PatientDataService)
  {
    this.patient=new Patient();
    this.getAllPatients();
  }

  insertPatient(data:any)
  {
    this.patient.name=data.name;
    this.patient.id=data.id;
    this.patient.add=data.add;

    this.result=this.service.insertPatient(this.patient);
    this.getAllPatients();
  }

  updatePatient(data:any)
  {
    this.patient.name=data.name;
    this.patient.id=data.id;
    this.patient.add=data.add;

    this.result=this.service.updatePatient(this.patient);
    this.getAllPatients();
  }

  deletePatient(data:any)
  {
    this.patient.name=data.name;
    this.patient.id=data.id;
    this.patient.add=data.add;

    this.result=this.service.deletePatient(this.patient);
    this.getAllPatients();
  }

  getAllPatients()
  {
    this.service.getAllPatientDetails().subscribe(patients=> this.patList = patients);
  }
}
