import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PagamentoService } from '../services/pagamento.service';
import { Pagamento } from '../models/pagamento';
 
@Component({
  selector: 'app-pagamento-register',
  templateUrl: './pagamento-register.component.html',
  styleUrls: ['./pagamento-register.component.css']
})
export class PagamentoRegisterComponent {
 
  pagamento: Pagamento;
 
  constructor(private route: ActivatedRoute, private router: Router, private pagamentoService: PagamentoService) {
    this.pagamento = new Pagamento();
  }
 
  onSubmit() {
    this.pagamentoService.save(this.pagamento).subscribe(result => this.gotoPagamentoList());
  }
 
  gotoPagamentoList() {
    this.router.navigate(['/pagamentos']);
  }
}
