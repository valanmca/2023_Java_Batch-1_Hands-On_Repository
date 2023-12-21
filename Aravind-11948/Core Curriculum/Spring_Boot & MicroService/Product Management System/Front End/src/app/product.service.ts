import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Product } from './model/Product';


@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url:string="http://localhost:3010";

  constructor(private http:HttpClient) { }

  insertProduct(product:Product)
  {
    this.http.post(this.url+"/PerformInsert",product).subscribe()
    return "Record inserted";

  }

  updateProduct(product:Product)
  {
    this.http.put(this.url+"/PerformUpdate",product).subscribe()
    return "Record updated";

  }

  deleteProduct(product:Product)
  {
    this.http.delete(this.url+"/PerformDelete/"+product.pId).subscribe()
    return "Record Deleted";

  }

  getAllProducts()
  {
     return this.http.get<Product[]>(this.url+"/ViewAll");
  }

  
}
