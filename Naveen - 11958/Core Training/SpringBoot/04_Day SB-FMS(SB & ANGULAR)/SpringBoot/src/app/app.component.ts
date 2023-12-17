import { Component } from '@angular/core';
import { Flight } from './model/flight';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  [x: string]: any;
  title = 'FMS-CRUD';
  flight: Flight;
  result: string = "";
  fliList: Flight[] = [];
  flightList: Flight[] = [];
  flag: boolean = false;
  constructor(private service: DataService) {
    this.flight = new Flight();
    this.getAllDetails();
  }
  changeDiv() {
    this.flag =!this.flag;
  }

  insert(data: any) {
    this.flight.flightno = data.flightno;
    this.flight.flighttype = data.flighttype;
    this.flight.source = data.source;
    this.flight.destination = data.destination;
    this.flight.economyseatcount = data.economyseatcount;
    this.flight.businessseatcount = data.businessseatcount;
    this.flight.economyfare = data.economyfare;
    this.flight.businessfare = data.businessfare;
    alert(this.result = this.service.insert(this.flight));
    // this['myform'].reset()
    this.getAllDetails();


  }
  update(data: any) {
    this.flight.flightno = data.flightno;
    this.flight.flighttype = data.flighttype;
    this.flight.source = data.source;
    this.flight.destination = data.destination;
    this.flight.economyseatcount = data.economyseatcount;
    this.flight.businessseatcount = data.businessseatcount;
    this.flight.economyfare = data.economyfare;
    this.flight.businessfare = data.businessfare;
    alert( this.result = this.service.update(this.flight));
    this.getAllDetails();


  }
  delete(data: any) {
    this.flight.flightno = data.flightno;
    alert(this.result = this.service.delete(this.flight));
    this.getAllDetails();


  }


  getAllDetails() {
    this.service.getAlldetails().subscribe(ans => this.flightList = ans );


  }
}
