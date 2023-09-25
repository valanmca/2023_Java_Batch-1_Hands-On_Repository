import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Child1Component } from './child1/child1.component';
import { DirectivesComponent } from './directives/directives.component';
import { AssignFactComponent } from './assign-fact/assign-fact.component';
import { CalculatorService } from './calculator.service';
import { ServicecalcComponent } from './servicecalc/servicecalc.component';
import { FactorialService } from './factorial.service';
import { PipeComponent } from './pipe/pipe.component';
import { SortPipe } from './sort.pipe';
import { CustompipeComponent } from './custompipe/custompipe.component';
import { TemplatedriveComponent } from './templatedrive/templatedrive.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { RegisterFormComponent } from './register-form/register-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child1Component,
    DirectivesComponent,
    ServicecalcComponent,
    AssignFactComponent,
    PipeComponent,
    SortPipe,
    CustompipeComponent,
    TemplatedriveComponent,
    ReactiveformComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    RegisterFormComponent
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
export class AppModule { }
