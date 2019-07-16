import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorizadorListComponent } from './autorizador-list.component';

describe('AutorizadorListComponent', () => {
  let component: AutorizadorListComponent;
  let fixture: ComponentFixture<AutorizadorListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AutorizadorListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AutorizadorListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
