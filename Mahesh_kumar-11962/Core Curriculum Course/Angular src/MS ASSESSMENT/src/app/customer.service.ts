import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { customers } from './model/customers';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private url: string = "http://localhost:3004/posts";

  constructor(private http: HttpClient) { }

  InsertCustomer(cus: customers) {
    this.http.post(this.url, cus).subscribe();
    return "Customer Record Inserted";
  }

  UpdateCustomer(cus: customers) {
    this.http.put(this.url + "/" + cus.id, cus).subscribe();
    return "Customer Record Updated";
  }
  
  DeleteCustomer(cus: customers) {
    this.http.delete(this.url + "/" + cus.id).subscribe();
    return "Customer Record Deleted";
  }

  getAllCustomerDetails()
  {
    return this.http.get<customers[]>(this.url);
  }
}