import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TableService {

 getTable(a:number,b:number):number{
  return (a*b);
 }
}
