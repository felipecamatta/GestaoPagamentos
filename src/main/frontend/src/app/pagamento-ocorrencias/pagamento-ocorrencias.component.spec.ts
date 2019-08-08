import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PagamentoOcorrenciasComponent } from './pagamento-ocorrencias.component';

describe('PagamentoOcorrenciasComponent', () => {
  let component: PagamentoOcorrenciasComponent;
  let fixture: ComponentFixture<PagamentoOcorrenciasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PagamentoOcorrenciasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PagamentoOcorrenciasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
