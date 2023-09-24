import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiplyTableService {
    
  getTable(a:number, b:number){
    return (a*b);
  }
}
