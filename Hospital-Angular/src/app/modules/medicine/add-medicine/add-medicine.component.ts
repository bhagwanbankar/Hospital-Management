import { Component, OnInit } from '@angular/core';
import { MedicineService } from '../shared/medicine.service';

@Component({
  selector: 'app-add-medicine',
  templateUrl: './add-medicine.component.html',
  styleUrls: ['./add-medicine.component.scss']
})
export class AddMedicineComponent implements OnInit {

  constructor(
    private medicineDataService: MedicineService
  ) { }

  ngOnInit() {
  }

  onClear(){
    
    this.medicineDataService.form.reset();
    this.medicineDataService.initializeFormGroup();
  }

  onSubmit(){
    if(this.medicineDataService.form.valid){
      this.medicineDataService.saveMedicine(this.medicineDataService.form.value).subscribe(
        data => {
          console.log(data)
            
        }
      );
      this.onClear();
    }
  }

}


