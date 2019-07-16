import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorizadorFormComponent } from './autorizador-form.component';

describe('AutorizadorFormComponent', () => {
  let component: AutorizadorFormComponent;
  let fixture: ComponentFixture<AutorizadorFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AutorizadorFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AutorizadorFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
