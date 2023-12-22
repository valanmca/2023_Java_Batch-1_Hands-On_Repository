import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Child1Component } from './child1/child1.component';
import { FactComponent } from './fact/fact.component';
import { CalculatorService } from './calculator.service';
import { ServiceComponent } from './service/service.component';
import { Service1Component } from './service1/service1.component';
import { PipeComponent } from './pipe/pipe.component';
import { SortPipe } from './sort.pipe';
import { CustompipeComponent } from './custompipe/custompipe.component';
import { TemplatedriveComponent } from './templatedrive/templatedrive.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';


@NgModule({
  declarations: [
    AppComponent,ChildComponent,Child1Component, FactComponent,ServiceComponent, Service1Component, PipeComponent, SortPipe, CustompipeComponent, TemplatedriveComponent, ReactiveformComponent, HomeComponent, ContactComponent, AboutComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [CalculatorService],
  bootstrap: [AppComponent] 
  
})
export class AppModule { }
