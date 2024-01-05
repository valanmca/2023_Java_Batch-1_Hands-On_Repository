import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { CustomerService } from './customer.service';
import { Customer } from './model/Customer';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CMS-SB';
  customer:Customer;
  myForm:FormGroup;
  result:String="";
  cusList:Customer[]=[];

  constructor(private cus:CustomerService){
    this.myForm = new FormGroup({
    cId: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
    cName: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
    cEmail: new FormControl('', [Validators.required, Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}')]),
    cNum: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
    cLoc: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')])
    })

    this.customer = new Customer();
    this.getAllproducts;

  }

  InsertCustomer(data:any){
    this.customer.cId = data.cId;
    this.customer.cName = data.cName;
    this.customer.cEmail = data.cEmail;
    this.customer.cNum = data.cNum;
    this.customer.cLoc = data.cLoc;
    this.result = this.cus.InsertCustomer(this.customer);
    this.getAllproducts();
    alert(data.cId+" "+data.cName+" "+data.cEmail+" "+data.cNum+" "+data.cLoc);
  }
  DeleteCustomer(data: any) {
    alert(data.cId+" Deleted ");
    this.customer.cId = data.cId;
    this.result = this.cus.DeleteCustomer(this.customer);
    this.getAllproducts();
  }
  
  
  UpdateCustomer(data: any) {
    alert("UpdatedData" + data.cId + " " + data.cName + " " +data.cEmail+" "+ data.cNum);
    this.customer.cId= data.cId;
    this.customer.cName = data.cName;
    this.customer.cEmail = data.cEmail;
    this.customer.cNum = data.cNum;
    this.customer.cLoc = data.cLoc;
    this.result = this.cus.UpdateCustomer(this.customer);
    this.getAllproducts();  
  
   }
  
  
  
  
  getAllproducts() {
    this.cus.getAllCustomerDetails().subscribe(customer => this.cusList = customer);
  }
  
}
