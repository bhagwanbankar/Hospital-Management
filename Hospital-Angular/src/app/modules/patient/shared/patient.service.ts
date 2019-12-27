import { Injectable } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor() { }

  form : FormGroup = new FormGroup({
    $key: new FormControl(null),
    firstName : new FormControl(''),
    lastName : new FormControl(''),
    dob : new FormControl(''),
    registrationDate : new FormControl(''),
    email : new FormControl(''),
    mobileNo : new FormControl(''),
    gender : new FormControl(1),
    maritalStatus : new FormControl(0)
  });
}
