import { Component } from '@angular/core';
import { Customer } from './model/Customer';
import { CustomerService } from './customer.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  customer: Customer;
  result: string = "";
  cusList: Customer[] = [];

  constructor(private service: CustomerService) {
    this.customer = new Customer();
    this.getAll();
  }

  insert(data: any) {
    this.customer.id = data.id;
    this.customer.name = data.name;
    this.customer.email = data.email;
    this.customer.no = data.no;
    this.customer.location = data.location;

    this.result = this.service.insertDetail(this.customer);
    this.getAll();
  }

  update(data: any) {

    this.customer.id = data.id;
    this.customer.name = data.name;
    this.customer.email = data.email;
    this.customer.no = data.no;
    this.customer.location = data.location;

    this.result = this.service.updateDetail(this.customer);
    this.getAll();
  }

  delete(data: any) {
    this.customer.id = data.id;
    this.result = this.service.deleteDetail(this.customer);
    this.getAll();
  }

  getAll() {
    this.service.getAlldetails().subscribe(customers => this.cusList = customers)
  }


}
