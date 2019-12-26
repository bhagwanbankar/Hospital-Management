import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';

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
    CommonModule
  ],
  exports: [
    sharedComponets
  ]
})
export class SharedModule { }
