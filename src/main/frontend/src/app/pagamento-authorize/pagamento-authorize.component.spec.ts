import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PagamentoAuthorizeComponent } from './pagamento-authorize.component';

describe('PagamentoAuthorizeComponent', () => {
  let component: PagamentoAuthorizeComponent;
  let fixture: ComponentFixture<PagamentoAuthorizeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PagamentoAuthorizeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PagamentoAuthorizeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
