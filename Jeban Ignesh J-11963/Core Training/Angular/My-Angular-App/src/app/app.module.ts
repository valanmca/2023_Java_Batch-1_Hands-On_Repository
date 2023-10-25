import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import {FormsModule, ReactiveFormsModule} from  '@angular/forms';
import { JebanComponent } from './jeban/jeban.component';
import { IgneshComponent } from './ignesh/ignesh.component';
import { FactorialComponent } from './factorial/factorial.component';
import { ServicesComponent } from './services/services.component';
import { CalculatorService } from './calculator.service';
import { Sevices1Component } from './sevices1/sevices1.component';
import { FactorialService } from './factorial.service';
import { PipesComponent } from './pipes/pipes.component';
import { SortpipePipe } from './sortpipe.pipe';
import { FormComponent } from './form/form.component';
import { Form1Component } from './form1/form1.component';
import { ReactformComponent } from './reactform/reactform.component';



@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    JebanComponent,
    IgneshComponent,
    FactorialComponent,
    ServicesComponent,
    Sevices1Component,
    PipesComponent,
    SortpipePipe,
    FormComponent,
    Form1Component,
    ReactformComponent,
   
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
    
  ],
  providers: [CalculatorService,FactorialService],
  bootstrap: [AppComponent]
})
export class AppModule {
  
 }
