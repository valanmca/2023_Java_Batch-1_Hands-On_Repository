import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PropertyBindingComponentsComponent } from './property-binding-components/property-binding-components.component';
import { EventsbindingcomponentsComponent } from './eventsbindingcomponents/eventsbindingcomponents.component';
import { FormsModule } from '@angular/forms';
import { WayDataBindingComponenetsComponent } from './way-data-binding-componenets/way-data-binding-componenets.component';
import { DirectivesComponent } from './directives/directives.component';

@NgModule({
  declarations: [
    AppComponent,
    PropertyBindingComponentsComponent,
    EventsbindingcomponentsComponent,
    WayDataBindingComponenetsComponent,
    DirectivesComponent
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
