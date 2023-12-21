import { Component } from '@angular/core';
import { Product } from './model/Product';
import { ProductService } from './product.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
product:Product;
result:String="";
proList:Product[]=[];
  constructor(private service:ProductService)
  {
    this.product=new Product;
    this.getAllProducts();
  }


  insertProduct(data:any)
  {
    this.product.pId=data.pId;
    this.product.pName=data.pName;
    this.product.pQuantity=data.pQuantity;
    this.product.pPrice=data.pPrice;
    this.result=this.service.insertProduct( this.product);

    this.getAllProducts();
  }


  updateProduct(data:any)
  {
    this.product.pId=data.pId;
    this.product.pName=data.pName;
    this.product.pQuantity=data.pQuantity;
    this.product.pPrice=data.pPrice;
    this.result=this.service.updateProduct( this.product);
    this.getAllProducts();
  }

  deleteProduct(data:any)
  {
    this.product.pId=data.pId;
   
    this.result=this.service.deleteProduct( this.product);
    this.getAllProducts();
  }


  getAllProducts()
  {
    this.service.getAllProducts().subscribe(products=>this.proList=products);

  }
  
}
