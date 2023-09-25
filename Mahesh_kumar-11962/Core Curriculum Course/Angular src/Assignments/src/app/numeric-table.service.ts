import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NumericTableService {

  getTable(digits: number, table_value: number) {
    return digits * table_value;
  }

}
