import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Medicine } from '../medicine.component';

@Injectable({
  providedIn: 'root'
})
export class MedicineService {

  initializeFormGroup() {
    this.form.setValue({
      $key: null,
      medicineName : '',
      medicineType : '',
      company : '',
      timeInterval : '',
      amoutPerInterval : '',
      instruction : '',
      quantity : '0',
      duration : ''
    }

    );
  }

  constructor(
    private http : HttpClient
  ) { }

  form : FormGroup = new FormGroup({
    $key: new FormControl(null),
    medicineName : new FormControl('',Validators.required),
    medicineType : new FormControl(''),
    company : new FormControl(''),
    timeInterval : new FormControl(''),
    amoutPerInterval : new FormControl(''),
    instruction : new FormControl(''),
    quantity : new FormControl('0'),
    duration : new FormControl('')
  });

  retrieveAllMedicine() {

    return this.http.get<Medicine[]>(`http://localhost:8080/medicines`);

  }

  saveMedicine(medicine: any) {
    return this.http.post(`http://localhost:8080/medicines`,medicine);
  }
}
