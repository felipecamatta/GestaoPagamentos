import { Component, OnInit } from '@angular/core';
import { Pagamento } from '../models/pagamento';
import { PagamentoService } from '../services/pagamento.service';
import { ɵangular_packages_platform_browser_dynamic_platform_browser_dynamic_a } from '@angular/platform-browser-dynamic';

@Component({
  selector: 'app-pagamento-list',
  templateUrl: './pagamento-list.component.html',
  styleUrls: ['./pagamento-list.component.css']
})
export class PagamentoListComponent implements OnInit {

  pagamentos: Pagamento[]

  constructor(private pagamentoService: PagamentoService) { }

  ngOnInit() {
    this.pagamentoService.findAll().subscribe(data => {
      this.pagamentos = data
    });
  }

  semcriatividade(pagamento: Pagamento) {
    pagamento.ocorrencias.forEach(function (value) {
      alert(`Descrição: ${value.descricao}\nUsuário: ${value.usuario}`);
    });
  }

}
