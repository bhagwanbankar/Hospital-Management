import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {

  

  constructor() { }

  ngOnInit() {
  }

}

export class patient{
  constructor(
    public id : number,
    public firstName : string,
    public lastName : string,
    public email : string,
    public mobileNo : string,
    public dob : string,
    public registrationDate : Date,
    public gender : string,
    public maritalStatus : string,
    public address : Address){
  }
}

class Address{
  constructor(
    public line1 : string,
    public line2 : string,
    public city : string,
    public district : string,
    public state : string,
    public pincode : string
  ){}
}