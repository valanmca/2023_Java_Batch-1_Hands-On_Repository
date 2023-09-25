import { Component } from '@angular/core';
import { Doctor } from './model/Doctor';
import { DataService } from './data.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hospital-Manage';
  flag: boolean = false;

  doctor: Doctor;
  result: string = "";
  DocList: Doctor[] = [];
  constructor(private service: DataService) {
    this.doctor = new Doctor;
    this.getAllDetails();
  }
  changediv() {
    this.flag = !this.flag;
  }
  insert(data: any) {
    this.doctor.id = data.id;
    this.doctor.name = data.name;
    this.doctor.age = data.age;
    this.doctor.email = data.email;
    this.doctor.spec = data.spec;
    this.doctor.phoneno = data.phoneno;
    this.doctor.address = data.address;
    this.result = this.service.insert(this.doctor);
    this.getAllDetails();
  }
  
  update(data: any) {
    this.doctor.id = data.id;
    this.doctor.name = data.name;
    this.doctor.age = data.age;
    this.doctor.email = data.email;
    this.doctor.spec = data.spec;
    this.doctor.phoneno = data.phoneno;
    this.doctor.address = data.address;
    this.result = this.service.update(this.doctor);
    this.getAllDetails();
  }
  delete(data: any) {
    this.doctor.id = data.id;
    this.doctor.name = data.name;
    this.doctor.age = data.age;
    this.doctor.email = data.email;
    this.doctor.spec = data.spec;
    this.doctor.phoneno = data.phoneno;
    this.doctor.address = data.address;
    this.result = this.service.delete(this.doctor);
    this.getAllDetails();
  }
  getAllDetails() {
    this.service.getAllDetails().subscribe(doctors => this.DocList = doctors);
  }
}
