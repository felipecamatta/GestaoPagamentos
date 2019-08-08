import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FuncionarioListComponent } from './funcionario-list/funcionario-list.component';
import { FuncionarioFormComponent } from './funcionario-form/funcionario-form.component';
import { PagamentoListComponent } from './pagamento-list/pagamento-list.component';
import { PagamentoFormComponent } from './pagamento-form/pagamento-form.component';
import { AutorizadorListComponent } from './autorizador-list/autorizador-list.component';
import { AutorizadorFormComponent } from './autorizador-form/autorizador-form.component';
import { PagamentoAuthorizeComponent } from './pagamento-authorize/pagamento-authorize.component';
import { PagamentoOcorrenciasComponent } from './pagamento-ocorrencias/pagamento-ocorrencias.component';

const routes: Routes = [
  { path: 'funcionarios', component: FuncionarioListComponent },
  { path: 'addfuncionario', component: FuncionarioFormComponent },
  { path: 'pagamentos', component: PagamentoListComponent },
  { path: 'addpagamento', component: PagamentoFormComponent },
  { path: 'autorizadores', component: AutorizadorListComponent },
  { path: 'addautorizador', component: AutorizadorFormComponent },
  { path: 'autpagamento', component: PagamentoAuthorizeComponent },
  { path: 'ocorrencia', component: PagamentoOcorrenciasComponent }
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }