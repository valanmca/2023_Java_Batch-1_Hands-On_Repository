import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';    

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { Child1Component } from './child1/child1.component';
import { ChildPropertybindComponent } from './child-propertybind/child-propertybind.component';
import { ChildEventComponent } from './child-event/child-event.component';
import { ChildTwowayComponent } from './child-twoway/child-twoway.component';
import { ChildStructComponent } from './child-struct/child-struct.component';
import { ChildAttributeComponent } from './child-attribute/child-attribute.component';
import { FactorialComponent } from './factorial/factorial.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CalculatorService } from './calculator.service';
import { Calculator1Component } from './calculator1/calculator1.component';
import { FactorialService } from './factorial.service';
import { PipesComponent } from './pipes/pipes.component';
import { SortPipe } from './sort.pipe';
import { FormComponent } from './form/form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';


@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    ChildPropertybindComponent,
    ChildEventComponent,
    ChildTwowayComponent,
    ChildStructComponent,
    ChildAttributeComponent,
    FactorialComponent,
    CalculatorComponent,
    Calculator1Component,
    PipesComponent,
    SortPipe,
    FormComponent,
    ReactiveFormComponent,
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],

  providers: [
    CalculatorService,
    FactorialService
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
