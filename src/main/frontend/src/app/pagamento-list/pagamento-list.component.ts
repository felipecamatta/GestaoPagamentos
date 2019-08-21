import { Component, OnInit } from '@angular/core';
import { Pagamento } from '../models/pagamento';
import { PagamentoService } from '../services/pagamento.service';

import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Ocorrencia } from '../models/ocorrencia';

@Component({
  selector: 'app-pagamento-list',
  templateUrl: './pagamento-list.component.html',
  styleUrls: ['./pagamento-list.component.css']
})
export class PagamentoListComponent implements OnInit {

  pagamentos: Pagamento[];
  ocorrencias: Ocorrencia[];

  constructor(private pagamentoService: PagamentoService, private modalService: NgbModal) { }

  ngOnInit() {
    this.pagamentoService.findAll().subscribe(data => {
      this.pagamentos = data
    });
  }

  openModal(modal, ocorrencias2: Ocorrencia[]) {
    this.ocorrencias = ocorrencias2;
    this.modalService.open(modal);
  }

}
