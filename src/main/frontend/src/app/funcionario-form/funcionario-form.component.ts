import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FuncionarioService } from '../services/funcionario.service';
import { Funcionario } from '../models/funcionario';

@Component({
  selector: 'app-funcionario-form',
  templateUrl: './funcionario-form.component.html',
  styleUrls: ['./funcionario-form.component.css']
})
export class FuncionarioFormComponent implements OnInit {
  
  funcionario: Funcionario

  constructor(private route: ActivatedRoute, private router: Router, private funcionarioService: FuncionarioService) {
    this.funcionario = new Funcionario();
  }

  ngOnInit() {
    this.funcionario = this.funcionarioService.getFuncionario();
  }
 
  onSubmit() {
    if (this.funcionario.id == undefined) {
      this.funcionarioService.save(this.funcionario).subscribe(result => this.gotofuncionarioList());
    } else {
      this.funcionarioService.update(this.funcionario).subscribe();
      this.router.navigate(['/funcionarios']);
    }
  }
 
  gotofuncionarioList() {
    this.router.navigate(['/funcionarios']);
    alert("Funcionario adicionado com sucesso!");
  }
}
