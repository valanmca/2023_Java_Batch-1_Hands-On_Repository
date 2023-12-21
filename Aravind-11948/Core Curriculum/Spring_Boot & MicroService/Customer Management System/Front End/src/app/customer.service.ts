import { Injectable } from '@angular/core';
import { Customer } from './model/Customer';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private url:string="http://localhost:5679"

  constructor(private http:HttpClient) { }

  insertDetail(customer:Customer)
  {
    this.http.post(this.url+"/PerformInsert",customer).subscribe();
    return "Record inserted";

  }

  updateDetail(customer:Customer)
  {
    this.http.put(this.url+"/PerformUpdate",customer).subscribe();
    return "Record updated";

  }

  deleteDetail(customer:Customer)
  {
    this.http.delete(this.url+"/PerformDelete/"+customer.id).subscribe()
    return "Record Deleted"
  }

  getAlldetails()
  {
    return this.http.get<Customer[]>(this.url+"/ViewAll");
  }
}
