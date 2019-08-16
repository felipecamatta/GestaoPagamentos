import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pagamento } from '../models/pagamento';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutorizaPagamentoService {

  private autorizaPagamentoUrl: string;

  constructor(private http: HttpClient) {
    this.autorizaPagamentoUrl = 'http://localhost:8080/autorizarpagamentos';
  }

  public findAll(): Observable<Pagamento[]> {
    return this.http.get<Pagamento[]>(this.autorizaPagamentoUrl);
  }

  public autorizar(pagamentos: Pagamento[]) {
    return this.http.post<Boolean>(this.autorizaPagamentoUrl, pagamentos);
  }
}
