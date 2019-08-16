import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pagamento } from '../models/pagamento';
import { AutorizaPagamentoService } from '../services/autoriza-pagamento.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-pagamento-authorize',
  templateUrl: './pagamento-authorize.component.html',
  styleUrls: ['./pagamento-authorize.component.css']
})
export class PagamentoAuthorizeComponent implements OnInit {

  pagamentos: Pagamento[];
  pagamentosChecked: Int16Array[];
  
  constructor(private route: ActivatedRoute, private router: Router, private autorizaPagamentoService: AutorizaPagamentoService) { }

  ngOnInit() {
    this.autorizaPagamentoService.findAll().subscribe(data => {
      this.pagamentos = data
    });
  }

  onSubmit() {
    console.log(this.pagamentosChecked)
    //this.autorizaPagamentoService.autorizar(this.pagamentosChecked).subscribe(result => this.gotopagamentosList());
  }
  
  gotopagamentosList() {
    this.router.navigate(['/pagamentos']);
  }
}
