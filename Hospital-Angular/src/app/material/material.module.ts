import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule } from '@angular/material';

const MaterialComponent = [MatToolbarModule];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MaterialComponent
  ],
  exports: [
    MaterialComponent
  ]
})
export class MaterialModule { }
