import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-medicine',
  templateUrl: './medicine.component.html',
  styleUrls: ['./medicine.component.scss']
})
export class MedicineComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}

export class Medicine{
  constructor(
    public id: number,
    public medicineName : string,
    public medicineType : string,
    public company : string,
    public timeInterval : string,
    public amoutPerInterval : string,
    public instruction : string,
    public quantity : string,
    public duration : string
  ){}
}