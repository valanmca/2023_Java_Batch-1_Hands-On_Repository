import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { OnewayDatabindingComponent } from './oneway-databinding/oneway-databinding.component';
import { TwowayDataBindingComponent } from './twoway-data-binding/twoway-data-binding.component';
import { FormsModule } from '@angular/forms';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { FactorialComponent } from './factorial/factorial.component';

@NgModule({
  declarations: [
    AppComponent,    
    OnewayDatabindingComponent,
    TwowayDataBindingComponent,
    StructuralDirectivesComponent,
    AttributeDirectivesComponent,
    FactorialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
