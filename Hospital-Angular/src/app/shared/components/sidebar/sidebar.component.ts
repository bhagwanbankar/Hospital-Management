import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }


  menu: NavItem [] = [
    {
      displayName: 'Dashboard',
      iconName: 'dashboard',
      route: '/',
    },        
    {
      displayName: 'Patient',
      iconName: '',
      route: '/patient',
    },
    {
      displayName: 'Doctor',
      iconName: '', 
      route: '/doctor',         
      children: [
        {
          displayName: 'Examine patient',
          iconName: 'how_to_reg',
          route: '/examine-patient'
        },
        { 
          displayName: 'Todos',
          iconName: 'waves',
          route: '/todos'
        }
      ]
    },
    {
      displayName: 'Medicine',
      iconName: 'group',
      route: '/medicine'
      }
  ];

}

export interface NavItem {
  displayName: string;
  disabled?: boolean;
  iconName: string;
  route?: string;
  children?: NavItem[];
}