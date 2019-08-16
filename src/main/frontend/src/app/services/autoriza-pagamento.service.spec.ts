import { TestBed } from '@angular/core/testing';

import { AutorizaPagamentoService } from './autoriza-pagamento.service';

describe('AutorizaPagamentoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AutorizaPagamentoService = TestBed.get(AutorizaPagamentoService);
    expect(service).toBeTruthy();
  });
});
