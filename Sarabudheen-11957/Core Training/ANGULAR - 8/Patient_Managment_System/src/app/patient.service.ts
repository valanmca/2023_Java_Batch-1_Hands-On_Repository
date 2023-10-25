import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Patient } from './Model/Patient';


@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private url:string="http://localhost:3004/posts";


  constructor(private http:HttpClient) { }
  getAlldetails()
  {
    return this.http.get<Patient[]>(this.url);
  }


}
