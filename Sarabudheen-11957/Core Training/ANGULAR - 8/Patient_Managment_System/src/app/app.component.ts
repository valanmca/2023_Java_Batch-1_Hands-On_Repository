import { Component } from '@angular/core';
import { Patient } from './Model/Patient';
import { PatientService } from './patient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Patient_Management';
  patient!:Patient;
  result:string="";
  patientList:Patient[]=[];
  flag:boolean=false;
  constructor(private service :PatientService)
  {
    this.patient=new Patient();
  
  }

}
