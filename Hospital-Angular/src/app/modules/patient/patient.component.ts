import { Component, OnInit } from '@angular/core';
import { PatientService } from './shared/patient.service';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.scss']
})
export class PatientComponent implements OnInit {

  constructor(
    private patientDataService: PatientService
  ) { }

  ngOnInit() {
    this.retrieveAllPatient();
  }

  retrieveAllPatient(){
    console.log("Loding Patient details ")
    this.patientDataService.retrieveAllPatient().subscribe(
      response => {
        console.log(response);
      }
    );
  }

}

export class Patient{

  constructor(
    public id: number,
    public firstName : string,
    public lastName: string,
    public dob : Date,
    public registrationDate: Date,
    public email: string,
    public mobileNo: number,
    public gender : string,
    public maritalStatus: string
  ){  }
}
