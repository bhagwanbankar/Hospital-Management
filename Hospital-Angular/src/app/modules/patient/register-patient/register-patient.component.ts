import { Component, OnInit } from '@angular/core';
import { PatientService } from '../shared/patient.service';

@Component({
  selector: 'app-register-patient',
  templateUrl: './register-patient.component.html',
  styleUrls: ['./register-patient.component.scss']
})
export class RegisterPatientComponent implements OnInit {

  constructor(private patientDataService : PatientService) { }

  ngOnInit() {
    
  }

  onClear(){
    
    this.patientDataService.form.reset();
    this.patientDataService.initializeFormGroup();
  }

  onSubmit(){
    if(this.patientDataService.form.valid){
      this.patientDataService.savePatient(this.patientDataService.form.value).subscribe(
        data => {
          console.log(data)
            
        }
      );
      this.onClear();
    }
  }
}
