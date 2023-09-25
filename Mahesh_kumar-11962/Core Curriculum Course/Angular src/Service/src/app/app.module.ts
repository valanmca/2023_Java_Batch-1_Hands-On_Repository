import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalculatorService } from './calculator.service';
import { FormsModule } from '@angular/forms';
import { Comp2Component } from './comp2/comp2.component';
import { FactorialService } from './factorial.service';
import { Comp3Component } from './comp3/comp3.component';
import { PipeConceptComponent } from './pipe-concept/pipe-concept.component';
import { SortPipe } from './sort.pipe';

@NgModule({
  declarations: [
    AppComponent,
    Comp2Component,
    Comp3Component,
    PipeConceptComponent,
    SortPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    CalculatorService,
    FactorialService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
