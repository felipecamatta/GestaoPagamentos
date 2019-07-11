import { Component, OnInit } from '@angular/core';
import { FuncionarioService } from '../services/funcionario.service';

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.css']
})
export class FuncionarioListComponent implements OnInit {
  private funcionarios: Array<any>;

  constructor(private funcionarioService: FuncionarioService) { }

  ngOnInit() {
    this.funcionarioService.getAll().subscribe( next: data => {
      this.funcionarios = data;
    });
  }

}
