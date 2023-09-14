import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { Child3Component } from './child3/child3.component';
import { Child4Component } from './child4/child4.component';
import { CalculatorService } from './calculator.service';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    Child2Component,
    Child3Component,
    Child4Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 
 
}
