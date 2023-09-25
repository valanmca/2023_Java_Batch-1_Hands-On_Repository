import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './childEventbinding/child2.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Child2waybindingComponent } from './child2waybinding/child2waybinding.component';
import { StructdirectiveComponent } from './structdirective/structdirective.component';
import { AttributedirectiveComponent } from './attributedirective/attributedirective.component';
import { AssigncomponentComponent } from './assign1/assigncomponent.component';
import { CalculatorService } from './calculator.service';
import { CalccomponentComponent } from './calccomponent/calccomponent.component';
import { Calc2Component } from './calc2/calc2.component';
import { FactorialService } from './factorial.service';
import { PipeComponent } from './pipe/pipe.component';
import { SortPipe } from './sort.pipe';
import { FormstdfComponent } from './formstdf/formstdf.component';
import { FormreactiveComponent } from './formreactive/formreactive.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    Child2Component,
    Child2waybindingComponent,
    StructdirectiveComponent,
    AttributedirectiveComponent,
    AssigncomponentComponent,
    CalccomponentComponent,
    Calc2Component,
    PipeComponent,
    SortPipe,
    FormstdfComponent,
    FormreactiveComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,
  ],
  providers: [CalculatorService,FactorialService],
  bootstrap: [AppComponent]
})
export class AppModule { }
