import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PagamentoRegisterComponent } from './pagamento-register.component';

describe('PagamentoRegisterComponent', () => {
  let component: PagamentoRegisterComponent;
  let fixture: ComponentFixture<PagamentoRegisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PagamentoRegisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PagamentoRegisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
