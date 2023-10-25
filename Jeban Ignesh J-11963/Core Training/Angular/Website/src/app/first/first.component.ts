import { Component } from '@angular/core';
import { HotelService } from '../Hotel.service';
import { Travel } from '../Model/Travel';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent {
  travel: Travel;
  result: string = "";
  traList: Travel[] = [];

  constructor(private service: HotelService) {
    this.travel = new Travel();
    this.getAllTravel();

  }

  InsertTravel(data: any) {
    this.travel.id = data.id;
    this.travel.Name = data.Name;
    this.travel.Email = data.Email;
    this.travel.Mobilenumber = data.Mobilenumber;

    this.result = this.service.InsertTravel(this.travel);
    this.getAllTravel();
    alert("Registered successfully")
    alert("data is inserted")
  }
  DeleteTravel(data: any) {
    this.travel.id = data.id;
    this.travel.Name = data.Name;
    this.travel.Email = data.Email;
    this.travel.Mobilenumber = data.Mobilenumber;

    this.result = this.service.DeleteTravel(this.travel);
    this.getAllTravel();

    alert("data is deleted")
  }
  UpdateTravel(data: any) {
    this.travel.id = data.id;
    this.travel.Name = data.Name;
    this.travel.Email = data.Email;
    this.travel.Mobilenumber = data.Mobilenumber;

    this.result = this.service.UpdateTravel(this.travel);
    this.getAllTravel();

    alert("data is Updated")
  }
  getAllTravel() {
    this.service.getAllTravelsDetails().subscribe(
      travel => this.traList = travel
    );
  }


}
