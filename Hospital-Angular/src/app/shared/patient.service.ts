import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor() { }

  form: FormGroup = new FormGroup({
    $id: new FormControl(null),
    firstName: new FormControl('', Validators.required),
    lastName: new FormControl(''),
    email: new FormControl('', Validators.email),
    mobileNo: new FormControl('', [Validators.required, Validators.minLength(10)]),
    dob: new FormControl(''),
    registrationDate: new FormControl(''),
    gender: new FormControl(0),
    maritalStatus: new FormControl('1'),
    
  });

}
