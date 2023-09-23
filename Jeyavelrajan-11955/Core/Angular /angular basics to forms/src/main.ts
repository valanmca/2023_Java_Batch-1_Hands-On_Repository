
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
//from here it starts and checks the app.module.ts file 
import { AppModule } from './app/app.module';


platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
