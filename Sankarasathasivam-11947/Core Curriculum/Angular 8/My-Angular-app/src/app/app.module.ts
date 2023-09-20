import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { ChildpropertyComponent } from './childproperty/childproperty.component';
import { ChildStructComponent } from './child-struct/child-struct.component';
import { ChildAttributeComponent } from './child-attribute/child-attribute.component';
import { ChildFactorialComponent } from './child-factorial/child-factorial.component';
import { CalculatorService } from './calculator.service';
import { CalculatorComponent } from './calculator/calculator.component';
import { CalcComponent } from './calc/calc.component';
import { PipesComponent } from './pipes/pipes.component';
import { SortPipe } from './sort.pipe';
import { TdFormsComponent } from './td-forms/td-forms.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';


@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    ChildpropertyComponent,
    ChildStructComponent,
    ChildAttributeComponent,
    ChildFactorialComponent,
    CalculatorComponent,
    CalcComponent,
    PipesComponent,
    SortPipe,
    TdFormsComponent,
    ReactiveFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [CalculatorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
