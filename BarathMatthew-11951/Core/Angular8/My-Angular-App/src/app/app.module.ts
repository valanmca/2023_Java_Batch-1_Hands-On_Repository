import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { Child3Component } from './child3/child3.component';
import { Child4Component } from './child4/child4.component';
import { CalculatorService } from './calculator.service';
import { Child41Component } from './child41/child41.component';
import { Child5Component } from './child5/child5.component';
import { SortPipe } from './sort.pipe';
import { Child51Component } from './child51/child51.component';
import { Child6Component } from './child6/child6.component';
import { Child7Component } from './child7/child7.component';


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
    Child51Component,
    Child6Component,
    Child7Component,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 
    
}
