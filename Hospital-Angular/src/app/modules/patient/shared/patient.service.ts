import { Injectable } from '@angular/core';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Patient } from '../patient.component';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  
  

  initializeFormGroup() {
    this.form.setValue({
      $key: null,
      firstName : '',
      lastName : '',
      dob : '',
      registrationDate : '',
      email : '',
      mobileNo : '',
      gender : 1,
      maritalStatus : 0
    }

    );
  }

  constructor(
    private http : HttpClient
  ) { }

  form : FormGroup = new FormGroup({
    $key: new FormControl(null),
    firstName : new FormControl('',Validators.required),
    lastName : new FormControl('',Validators.required),
    dob : new FormControl(''),
    registrationDate : new FormControl(''),
    email : new FormControl('',Validators.email),
    mobileNo : new FormControl('',[Validators.required, Validators.minLength(10)]),
    gender : new FormControl(1),
    maritalStatus : new FormControl(0)
  });

  retrieveAllPatient() {

    return this.http.get<Patient[]>(`http://localhost:8080/hospital/patients`);

  }

  savePatient(patient: any) {
    return this.http.post(`http://localhost:8080/hospital/patients`,patient);
  }

}
