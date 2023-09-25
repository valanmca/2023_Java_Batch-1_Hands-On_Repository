import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';

//angular application execute the main.ts file only
platformBrowserDynamic().bootstrapModule(AppModule)//refer app module class , that is occur in app.module.ts file
  .catch(err => console.error(err));
