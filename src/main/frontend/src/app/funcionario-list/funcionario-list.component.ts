import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Funcionario } from '../models/funcionario';
import { FuncionarioService } from '../services/funcionario.service';

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.css']
})
export class FuncionarioListComponent implements OnInit {

  funcionarios: Funcionario[]

  constructor(private route: ActivatedRoute, private router: Router, private funcionarioService: FuncionarioService) { }

  ngOnInit() {
    this.funcionarioService.findAll().subscribe(data => {
      this.funcionarios = data
    });
  }

  onDelete(id: number) {
    this.funcionarioService.delete(id).subscribe(result => {
      alert ("Funcionario deletado!");
      this.ngOnInit();
    });
  }

  onUpdate(funcionario: Funcionario) {
    this.funcionarioService.setFuncionario(funcionario);
    this.router.navigate(['/addfuncionario']);
  }
}
