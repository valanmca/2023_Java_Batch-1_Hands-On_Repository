import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalculatorService } from './calculator.service';
import { ServicescallingconstructorComponent } from './servicescallingconstructor/servicescallingconstructor.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustomPipeFilePipe } from './custom-pipe-file.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ServicescallingconstructorComponent,
    PipesComponent,
    CustomPipeFilePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
