import { Component } from '@angular/core';

@Component({
  selector: 'app-nutrition-table',
  templateUrl: './nutrition-table.component.html',
  styleUrls: ['./nutrition-table.component.css']
})
export class NutritionTableComponent {

  fruits: string[];
  carb: number[];
  water: number[];
  calories: number[];

  constructor() {
    this.fruits = ["Strawberries", "Watermelon", "Orange", "Apple", "Grapes", "Blueberries", "Banana", "Pure fruit juice (250ml)", "Dates", "Raisins"];
    this.carb = [6, 7, 8, 12, 15, 15, 23, 25, 65, 70];
    this.water = [0.92, 0.92, 0.87, 0.84, 0.80, 0.85, 0.75, 0.85, 0.20, 0.15];
    this.calories = [30, 33, 40, 60,66, 70, 95, 125, 290, 295];
  }

}