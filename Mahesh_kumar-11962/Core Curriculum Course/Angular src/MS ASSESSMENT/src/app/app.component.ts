import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CustomerService } from './customer.service';
import { customers } from './model/customers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'cms';
  myform: FormGroup;
  customer: customers;
  result: string = "";
  cusList: customers[] = [];
  flag:boolean=false;

  constructor(private customerobj: CustomerService) {
    this.myform = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      mail: new FormControl('', [Validators.required, Validators.pattern('[a-z]+@gmail.com+')]),
      phone: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      location: new FormControl('', Validators.required)

    }),
      this.customer = new customers();
      this.getAllCustomers();
  }

  msg() {
    alert("Form Valid");
  }
  InsertCustomer(data: any) {

    this.customer.id = data.id;
    this.customer.name = data.name;
    this.customer.mail = data.mail;
    this.customer.phone = data.phone;
    this.customer.location = data.location;
    this.result = this.customerobj.InsertCustomer(this.customer);
    this.flag=true;

  }

  DeleteCustomer(data: any) {

    this.customer.id = data.id;
    this.customer.name = data.name;
    this.customer.mail = data.mail;
    this.customer.phone = data.phone;
    this.customer.location = data.location;
    this.result = this.customerobj.DeleteCustomer(this.customer);
    this.flag=true;


  }

  UpdateCustomer(data: any) {

    this.customer.id = data.id;
    this.customer.name = data.name;
    this.customer.mail = data.mail;
    this.customer.phone = data.phone;
    this.customer.location = data.location;
    this.result = this.customerobj.UpdateCustomer(this.customer);
    this.flag=true;

  }

  getAllCustomers() {
    this.customerobj.getAllCustomerDetails().subscribe(customers => this.cusList = customers);
  }
}
