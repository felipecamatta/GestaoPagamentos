import { TestBed } from '@angular/core/testing';

import { AutorizadorService } from './autorizador.service';

describe('AutorizadorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AutorizadorService = TestBed.get(AutorizadorService);
    expect(service).toBeTruthy();
  });
});
