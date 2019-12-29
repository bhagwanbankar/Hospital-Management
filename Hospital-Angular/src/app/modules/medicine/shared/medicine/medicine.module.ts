import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from 'src/app/material/material/material.module';
import { RouterModule } from '@angular/router';
import { SharedModule } from 'src/app/shared/shared.module';
import { ReactiveFormsModule } from '@angular/forms';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';
import { MedicineService } from '../medicine.service';
import { MedicineComponent } from '../../medicine.component';
import { AddMedicineComponent } from '../../add-medicine/add-medicine.component';



@NgModule({
  declarations: [
    MedicineComponent,
    AddMedicineComponent
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
    MedicineService
  ]
})
export class MedicineModule { }
