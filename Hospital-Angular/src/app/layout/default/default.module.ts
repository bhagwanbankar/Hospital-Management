import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from 'src/app/material/material/material.module';
import { DefaultComponent } from './default.component';
import { DashboardComponent } from 'src/app/modules/dashboard/dashboard.component';
import { RouterModule } from '@angular/router';
import { PatientComponent } from 'src/app/modules/patient/patient.component';
import { DoctorComponent } from 'src/app/modules/doctor/doctor.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { PatientService } from 'src/app/modules/patient/shared/patient.service';
import { ReactiveFormsModule } from '@angular/forms';
import { RegisterPatientComponent } from 'src/app/modules/patient/register-patient/register-patient.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    DefaultComponent,
    DashboardComponent,
    PatientComponent,
    DoctorComponent,
    RegisterPatientComponent
  ],
  imports: [
    CommonModule,
    MaterialModule,
    RouterModule,
    SharedModule,
    ReactiveFormsModule,
    FlexLayoutModule,
    HttpClientModule
  ],
  providers: [
    PatientService
  ]
})
export class DefaultModule { }
