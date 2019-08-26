import { Component, OnInit } from '@angular/core';
import { Pagamento } from '../models/pagamento';
import { Funcionario } from '../models/funcionario';
import { ActivatedRoute, Router } from '@angular/router';
import { PagamentoService } from '../services/pagamento.service';
import { FuncionarioService } from '../services/funcionario.service';

@Component({
  selector: 'app-pagamento-form',
  templateUrl: './pagamento-form.component.html',
  styleUrls: ['./pagamento-form.component.css']
})
export class PagamentoFormComponent implements OnInit {

  pagamento: Pagamento
  funcionarios: Funcionario[]
  funcid: number

  constructor(private route: ActivatedRoute, private router: Router,
    private pagamentoService: PagamentoService, private funcionarioService: FuncionarioService) {
    this.pagamento = new Pagamento();
  }

  ngOnInit() {
    this.funcionarioService.findAll().subscribe(data => {
      this.funcionarios = data
    });
  }

  onSubmit() {
    var i = 0;
    for (i; this.funcionarios[i].id != this.funcid; i++);

    this.pagamento.funcionario = this.funcionarios[i];
    this.pagamento.status = "Pendente";
    this.pagamentoService.save(this.pagamento).subscribe(result =>
      this.gotoPagamentoList()
    );
  }

  gotoPagamentoList() {
    this.router.navigate(['/pagamentos']);
    alert("Pagamento registrado com sucesso!");
  }
}

