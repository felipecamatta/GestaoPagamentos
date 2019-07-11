import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Funcionario } from '../models/funcionario';

@Injectable()
export class FuncionarioService {

  private funcionariosUrl: string

  constructor(private http: HttpClient) {
    this.funcionariosUrl = 'http://localhost:8080/funcionarios'
  }

  public findAll(): Observable<Funcionario[]> {
    return this.http.get<Funcionario[]>(this.funcionariosUrl);
  }
 
  public save(funcionario: Funcionario) {
    return this.http.post<Funcionario>(this.funcionariosUrl, funcionario);
  }

}
