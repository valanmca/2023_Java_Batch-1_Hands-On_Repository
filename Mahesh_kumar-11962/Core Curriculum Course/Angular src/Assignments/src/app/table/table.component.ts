import { Component } from '@angular/core';
import { NumericTableService } from '../numeric-table.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {

  Digits: number[];
  result: number = 0;

  constructor(private cal: NumericTableService) {
    this.Digits = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  }

  getMultiplicationTable(Digits: number, Table: number): number {
    return this.result = this.cal.getTable(Digits, Table);
  }

}
