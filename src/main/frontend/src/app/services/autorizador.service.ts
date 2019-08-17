import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Autorizador } from '../models/autorizador';

@Injectable({
  providedIn: 'root'
})
export class AutorizadorService {

  private autorizadoresUrl: string;
  private autorizador = new Autorizador();

  constructor(private http: HttpClient) {
    this.autorizadoresUrl = 'http://localhost:8080/autorizadores';
  }

  public findAll(): Observable<Autorizador[]> {
    return this.http.get<Autorizador[]>(this.autorizadoresUrl);
  }
 
  public save(funcionario: Autorizador) {
    return this.http.post<Autorizador>(this.autorizadoresUrl, funcionario);
  }

  public delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.autorizadoresUrl}/${id}`);
  }
  
  public update(autorizador: Autorizador) {
    return this.http.put<Autorizador>(`${this.autorizadoresUrl}/${autorizador.id}`, autorizador);
  }

  public getAutorizador() {
    return this.autorizador;
  }

  public setAutorizador(autorizador: Autorizador) {
    this.autorizador = autorizador
  }
}
