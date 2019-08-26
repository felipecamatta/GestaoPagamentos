import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pagamento } from '../models/pagamento';
import { AutorizaPagamentoService } from '../services/autoriza-pagamento.service';

@Component({
  selector: 'app-pagamento-authorize',
  templateUrl: './pagamento-authorize.component.html',
  styleUrls: ['./pagamento-authorize.component.css']
})
export class PagamentoAuthorizeComponent implements OnInit {

  pagamentos: Pagamento[];
  pagamentoFormArray: Number[] = [];

  constructor(private route: ActivatedRoute, private router: Router, private autorizaPagamentoService: AutorizaPagamentoService) { }

  ngOnInit() {
    this.autorizaPagamentoService.findAll().subscribe(data => {
      this.pagamentos = data
    });
  }

  onChange(id: Number, isChecked: boolean) {
    if (isChecked) {
      this.pagamentoFormArray.push(id);
    } else {
      let index = this.pagamentoFormArray.indexOf(id);
      this.pagamentoFormArray.splice(index, 1);
    }
  }

  autorizar() {
    this.autorizaPagamentoService.autorizar(this.pagamentoFormArray).subscribe(result => {
      this.router.navigate(['/pagamentos'])
      alert('Autorizado(s)!');
    });
  }

}
