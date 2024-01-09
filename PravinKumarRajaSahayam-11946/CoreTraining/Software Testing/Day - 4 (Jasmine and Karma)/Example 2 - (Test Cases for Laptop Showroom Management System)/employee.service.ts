import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Laptop } from './model/Laptop';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private url : string = "http://localhost:1239";
  constructor(private _http: HttpClient) {}

  insertLaptop(data: any){
    return this._http.post('http://localhost:1239/PerformInsert', data);
  }

  updateLaptop(laptopId: number, data: any){
    return this._http.put(`http://localhost:1239/PerformUpdate`, data);
  }

  getAllLaptopDetails()
  {
    return this._http.get<Laptop[]>(this.url+"/ViewAll");
  }

  deleteLaptop(laptopId: number){
    return this._http.delete(`http://localhost:1239/PerformDelete/${laptopId}`);
  }
}
