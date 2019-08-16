import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Funcionario } from '../models/funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  private funcionariosUrl: string;
  private funcionario = new Funcionario();

  constructor(private http: HttpClient) {
    this.funcionariosUrl = 'http://localhost:8080/funcionarios';
  }

  public findAll(): Observable<Funcionario[]> {
    return this.http.get<Funcionario[]>(this.funcionariosUrl);
  }

  public save(funcionario: Funcionario) {
    return this.http.post<Funcionario>(this.funcionariosUrl, funcionario);
  }

  public delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.funcionariosUrl}/${id}`);
  }

  public update(funcionario: Funcionario) {
    return this.http.put<Funcionario>(this.funcionariosUrl + '/' + funcionario.id, funcionario);
  }

  public getFuncionario() {
    return this.funcionario;
  }

  public setFuncionario(funcionario: Funcionario) {
    this.funcionario = funcionario
  }
}
