import { Component } from '@angular/core';
import { Customer } from './model/Customer';
import { HelloService } from './hello.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
  customer : Customer;
  result : string="";
  cmslist: Customer[] =[];
  title: any;

  constructor(private service:HelloService){
    this.customer= new Customer();
    this.getAllCustomer();
  }

  myFunction(data:any){
    alert("success");
  
  }
  InsertCustomer(data:any){
    
    this.customer.cusID=data.cusID;
    this.customer.cusname=data.cusname;
    this.customer.cusEmail=data.cusEmail;
    this.customer.cusContactNumber=data.cusContactNumber;
    this.customer.cusLocation=data.cusLocation;

    this.result = this.service.insertCustomer(this.customer);
    this.getAllCustomer();
  }
  DeleteCustomer(data:any){
  
    this.customer.cusID=data.cusID;
    this.customer.cusname=data.cusname;
    this.customer.cusEmail=data.cusEmail;
    this.customer.cusContactNumber=data.cusContactNumber;
    this.customer.cusLocation=data.cusLocation;
    this.result = this.service.deleteCustomer(this.customer);
    this.getAllCustomer();
  }
  UpdateCustomer(data:any){
    this.customer.cusID=data.cusID;
    this.customer.cusname=data.cusname;
    this.customer.cusEmail=data.cusEmail;
    this.customer.cusContactNumber=data.cusContactNumber;
    this.customer.cusLocation=data.cusLocation;
    this.result = this.service.updateCustomer(this.customer);
    this.getAllCustomer();
  }
  getAllCustomer(){
    this.service.getAllCustomer().subscribe(customer=>this.cmslist = customer);
  }
}





