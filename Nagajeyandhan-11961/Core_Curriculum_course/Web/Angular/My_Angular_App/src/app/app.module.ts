import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { InterpolComponent } from './interpol/interpol.component';
import { EventbindComponent } from './eventbind/eventbind.component';
import { PropertybindComponent } from './propertybind/propertybind.component';
import { TwowaybindComponent } from './twowaybind/twowaybind.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { StructuredirectiveComponent } from './structuredirective/structuredirective.component';
import { AttributedirectiveComponent } from './attributedirective/attributedirective.component';
import { FactorialComponent } from './factorial/factorial.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CalculateService } from './calculate.service';
import { PipeComponent } from './pipe/pipe.component';
import { SortPipe } from './sort.pipe';
import { CustompipeComponent } from './custompipe/custompipe.component';
import { TemplatedriveComponent } from './templatedrive/templatedrive.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { RouterExComponent } from './router-ex/router-ex.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    InterpolComponent,
    EventbindComponent,
    PropertybindComponent,
    TwowaybindComponent,
    StructuredirectiveComponent,
    AttributedirectiveComponent,
    FactorialComponent,
    CalculatorComponent,
    PipeComponent,
    SortPipe,
    CustompipeComponent,
    TemplatedriveComponent,
    ReactiveformComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    RouterExComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    CalculateService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
