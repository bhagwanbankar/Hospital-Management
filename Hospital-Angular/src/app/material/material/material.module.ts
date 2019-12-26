import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MatToolbarModule, MatButtonModule, MatSidenavModule, 
  MatIconModule, MatListModule, MatGridListModule, MatInputModule,
  MatFormFieldModule, MatRadioModule, MatSelectModule, MatDatepickerModule, MatCheckboxModule, MatNativeDateModule, MatSnackBarModule, MatTableModule, MatPaginatorModule, MatSortModule, MatDialogModule } from '@angular/material';

const MaterialComponent = [
  MatToolbarModule,
  MatButtonModule,
  MatSidenavModule,
  MatIconModule,
  MatListModule,
  MatGridListModule,
  MatInputModule,
  MatFormFieldModule,
  MatRadioModule,
  MatSelectModule,
  MatDatepickerModule,
  MatNativeDateModule,
  MatCheckboxModule,
  MatSnackBarModule,
  MatTableModule,
  MatPaginatorModule,
  MatSortModule,
  MatDialogModule
]


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MaterialComponent
  ],
  exports:[
    MaterialComponent
  ]
})
export class MaterialModule { }
