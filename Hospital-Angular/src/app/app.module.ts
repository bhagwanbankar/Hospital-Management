import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DefaultModule } from './layout/default/default.module';
import { MedicineModule } from './modules/medicine/shared/medicine/medicine.module';
import { ExaminePatientComponent } from './modules/doctor/examine-patient/examine-patient.component';

@NgModule({
  declarations: [
    AppComponent,
    ExaminePatientComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    DefaultModule,
    MedicineModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
