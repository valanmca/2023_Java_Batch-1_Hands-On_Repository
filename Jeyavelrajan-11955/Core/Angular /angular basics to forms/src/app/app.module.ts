
//in app module.ts file will have the configuration files to run the angular componment
//main configuration file in angular - whaen we run the angular ti will refer these files 
import { NgModule } from '@angular/core';//predefined library files 
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { Child3Component } from './child3/child3.component';
import { CalculatorService } from './calculator.service';
import { Child4Component } from './child4/child4.component';
import { Child41Component } from './child41/child41.component';
import { Child5Component } from './child5/child5.component';
import { SortPipe } from './sort.pipe';
import { Child6Component } from './child6/child6.component';
import { Child7Component } from './child7/child7.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';


@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    Child2Component,
    Child3Component,
    Child4Component,
    Child41Component,
    Child5Component,
    SortPipe,
    Child6Component,
    Child7Component,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule
    
  ],
  providers: [CalculatorService], //-?
  bootstrap: [AppComponent]//starting point componment in angular 
})
export class AppModule { }
