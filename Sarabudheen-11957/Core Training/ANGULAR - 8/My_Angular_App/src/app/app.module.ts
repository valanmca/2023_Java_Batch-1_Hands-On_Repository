import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { ChildInterpolationComponent } from './child-interpolation/child-interpolation.component';
import { AttributeDerectivesComponent } from './attribute-derectives/attribute-derectives.component';
import { FactorialTableComponent } from './factorial-table/factorial-table.component';
import { ServicesComponent } from './services/services.component';
import { CalculatorService } from './calculator.service';
import { FactorialServiceService } from './factorial-service.service';
import { DigitcountPipe } from './digitcount.pipe';
import { SortPipe } from './sort.pipe';
import { FormsModule } from '@angular/forms';
import { FormsComponent } from './forms/forms.component';
import { PipesComponent } from './pipes/pipes.component';
import { ReactiveFormsComponent } from './reactive-forms/reactive-forms.component';
import { DirectivesComponent } from './directives/directives.component';



@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    ChildInterpolationComponent,
    AttributeDerectivesComponent,
    FactorialTableComponent,
    ServicesComponent,
    DigitcountPipe,
    SortPipe,
    PipesComponent,
    FormsComponent,
    ReactiveFormsComponent,
    DirectivesComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [CalculatorService,FactorialServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
