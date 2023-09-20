import { Component } from '@angular/core';
import { TableService } from '../table.service';

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent {
  a: number[];
  a1: number;

  constructor(private tab: TableService) {
    this.a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    this.a1 = 1;
  }
  c: number = 0;
  getfactorial(a: number, b: number): number {
    return this.c = this.tab.getTable(a, b);
  }

}

