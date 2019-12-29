import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExaminePatientComponent } from './examine-patient.component';

describe('ExaminePatientComponent', () => {
  let component: ExaminePatientComponent;
  let fixture: ComponentFixture<ExaminePatientComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExaminePatientComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExaminePatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
