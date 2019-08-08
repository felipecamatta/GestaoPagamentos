import { Component, OnInit } from '@angular/core';
import { Pagamento } from '../models/pagamento';
import { PagamentoService } from '../services/pagamento.service';

@Component({
  selector: 'app-pagamento-authorize',
  templateUrl: './pagamento-authorize.component.html',
  styleUrls: ['./pagamento-authorize.component.css']
})
export class PagamentoAuthorizeComponent implements OnInit {

  pagamentos: Pagamento[]
  pagchecked: Pagamento[]
  
  constructor(private pagamentoService: PagamentoService) { }

  ngOnInit() {
    this.pagamentoService.findAll().subscribe(data => {
      this.pagamentos = data
    });
  }

  aut() {

  }
}
