import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DefaultComponent } from './layout/default/default.component';
import { DashboardComponent } from './modules/dashboard/dashboard.component';
import { PatientComponent } from './modules/patient/patient.component';
import { DoctorComponent } from './modules/doctor/doctor.component';
import { MedicineComponent } from './modules/medicine/medicine.component';
import { ExaminePatientComponent } from './modules/doctor/examine-patient/examine-patient.component';


const routes: Routes = [{
  path:'',
  component: DefaultComponent,
  children: [{
    path: '',
    component: DashboardComponent
  },{
    path: 'patient',
    component: PatientComponent
  },{
    path: 'doctor',
    component: DoctorComponent
  },{
    path: 'medicine',
    component: MedicineComponent
  },{
    path: 'examine-patient',
    component: ExaminePatientComponent
  }]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
