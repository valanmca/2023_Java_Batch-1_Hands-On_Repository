import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { Child3Component } from './child3/child3.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { StrucdirectiveComponent } from './strucdirective/strucdirective.component';
import { AttributeDirComponent } from './attribute-dir/attribute-dir.component';
import { Assg1Component } from './assg1/assg1.component';
import { CalculatorService } from './calculator.service';
import { CalculatorComponent } from './calculator/calculator.component';
import { FactorialService } from './factorial.service';
import { PipeConceptComponent } from './pipe-concept/pipe-concept.component';
import { SortPipe } from './sort.pipe';
import { FormsTDFComponent } from './forms-tdf/forms-tdf.component';
import { FormsReactiveComponent } from './forms-reactive/forms-reactive.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    Child2Component,
    Child3Component,
    StrucdirectiveComponent,
    AttributeDirComponent,
    Assg1Component,
    CalculatorComponent,
    PipeConceptComponent,
    SortPipe,
    FormsTDFComponent,
    FormsReactiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule
  ],
  providers: [CalculatorService,FactorialService],
  bootstrap: [AppComponent]
})
export class AppModule { }
