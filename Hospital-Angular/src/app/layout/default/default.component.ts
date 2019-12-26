import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-default',
  templateUrl: './default.component.html',
  styleUrls: ['./default.component.scss']
})
export class DefaultComponent implements OnInit {

  
  constructor() { }
  sideBarOpen =false;
  ngOnInit() {
  }
  sideBarToggle(){
    this.sideBarOpen = !this.sideBarOpen;
  }
}
