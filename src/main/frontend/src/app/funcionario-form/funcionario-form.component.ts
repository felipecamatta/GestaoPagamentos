import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FuncionarioService } from '../services/funcionario.service';
import { Funcionario } from '../models/funcionario';

@Component({
  selector: 'app-funcionario-form',
  templateUrl: './funcionario-form.component.html',
  styleUrls: ['./funcionario-form.component.css']
})
export class FuncionarioFormComponent {
  
  funcionario: Funcionario

  constructor(private route: ActivatedRoute, private router: Router, private funcionarioService: FuncionarioService) {
    this.funcionario = new Funcionario();
  }
 
  onSubmit() {
    this.funcionarioService.save(this.funcionario).subscribe(result => this.gotofuncionarioList());
  }
 
  gotofuncionarioList() {
    this.router.navigate(['/funcionarios']);
    alert("Funcionario adicionado com sucesso!");
  }
}
