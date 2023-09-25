import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServiceCalculatorComponent } from './service-calculator/service-calculator.component';
import { CalcService } from './calc.service';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { CustomPipeComponent } from './custom-pipe/custom-pipe.component';
import { SortpipePipe } from './sortpipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ServiceCalculatorComponent,
    PipeExampleComponent,
    CustomPipeComponent,
    SortpipePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    CalcService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
