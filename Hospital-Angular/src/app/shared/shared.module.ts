import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { MaterialModule } from '../material/material/material.module';
import {FlexLayoutModule} from '@angular/flex-layout'
import { RouterModule } from '@angular/router';
const sharedComponets =[
  HeaderComponent,
  FooterComponent,
  SidebarComponent
]

@NgModule({
  declarations: [
    sharedComponets
  ],
  imports: [
    CommonModule,
    MaterialModule,
    FlexLayoutModule,
    RouterModule
  ],
  exports: [
    sharedComponets
  ]
})
export class SharedModule { }
