import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Customer } from './model/Customer';
@Injectable({
  providedIn: 'root'
})
export class HelloService {
private url:string = "http://localhost:7834";
constructor(private http: HttpClient) {
}
insertCustomer(customer : Customer){
  this.http.post(this.url+"/PerformInsert",customer).subscribe();
  return "Record Inserted";
}
updateCustomer(customer: Customer) {
  this.http.put(this.url + "/PerformUpdate" ,customer).subscribe();
  return "Record Updated";
}
deleteCustomer(customer: Customer) {
  this.http.delete(this.url+"/PerformDelete/"+customer.cusID).subscribe();
  return "Record Deleted";
}
getAllCustomer(){
 return this.http.get<Customer[]>(this.url+"/viewAll");
}
}