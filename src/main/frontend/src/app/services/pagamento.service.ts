import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pagamento } from '../models/pagamento';

@Injectable({
  providedIn: 'root'
})
export class PagamentoService {

  private pagamentosUrl: string;

  constructor(private http: HttpClient) {
    this.pagamentosUrl = 'http://localhost:8080/pagamentos';
  }

  public findAll(): Observable<Pagamento[]> {
    return this.http.get<Pagamento[]>(this.pagamentosUrl);
  }
 
  public save(pagamento: Pagamento) {
    return this.http.post<Pagamento>(this.pagamentosUrl, pagamento);
  }

  public del(id: number): Observable<void> {
    return this.http.delete<void>('${this.rPagamentoUrl}/${id}');
  }
}
