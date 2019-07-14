import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../models/funcionario';
import { FuncionarioService } from '../services/funcionario.service';

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.css']
})
export class FuncionarioListComponent implements OnInit {

  funcionarios: Funcionario[]

  constructor(private funcionarioService: FuncionarioService) { }

  ngOnInit() {
    this.funcionarioService.findAll().subscribe(data => {
      this.funcionarios = data
    });
  }

  deleteFuncionario(id: String) {
    this.funcionarioService.del(Number(id));
  }
}
