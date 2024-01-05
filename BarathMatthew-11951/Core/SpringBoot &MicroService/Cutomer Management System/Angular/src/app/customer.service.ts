import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from './model/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private url : string="http://localhost:1233"
  constructor(private http:HttpClient) { }

  InsertCustomer(customer: Customer){
    this.http.post(this.url+"/PerformInsert",customer).subscribe();
    return "Record Inserted";
  }

  DeleteCustomer(customer: Customer) {
    this.http.delete(this.url + "/PerformDelete/" + customer.cId).subscribe();
    return "Record Deleted";
  }


  UpdateCustomer(customer: Customer)
  {
    this.http.put(this.url+"/PerformUpdate",customer).subscribe();
    return "Record Updated";
  }


  getAllCustomerDetails() {
    return this.http.get<Customer[]>(this.url + "/ViewAll");
  }
}
