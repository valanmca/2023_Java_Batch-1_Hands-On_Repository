import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildStructComponent } from './child-struct/child-struct.component';
import { ChildAttributeComponent } from './child-attribute/child-attribute.component';
import { ChildFactorialComponent } from './child-factorial/child-factorial.component';
import { ChildInterComponent } from './child-inter/child-inter.component';
import { ChildPropertyComponent } from './child-property/child-property.component';
import { ChildServicesComponent } from './child-services/child-services.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CalculatorService } from './calculator.service';
import { Calculator1Component } from './calculator1/calculator1.component';
import { FactorialService } from './factorial.service';
import { PipesComponent } from './pipes/pipes.component';
import { SortPipe } from './sort.pipe';
import { FormsModule } from '@angular/forms';
import { TemplateComponent } from './template/template.component';
import { NutritionComponent } from './nutrition/nutrition.component';
import { MulTableComponent } from './mul-table/mul-table.component';
import { TableService } from './table.service';

@NgModule({
  declarations: [
    AppComponent,
    ChildStructComponent,
    ChildAttributeComponent,
    ChildFactorialComponent,
    ChildInterComponent,
    ChildPropertyComponent,
    ChildServicesComponent,
    CalculatorComponent,
    Calculator1Component,
    PipesComponent,
    SortPipe,
    TemplateComponent,
    NutritionComponent,
    MulTableComponent,
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    
  ],
  providers: [CalculatorService,FactorialService,TableService],
  bootstrap: [AppComponent]
})
export class AppModule { }
