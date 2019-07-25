import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FuncionarioListComponent } from './funcionario-list/funcionario-list.component';
import { FuncionarioFormComponent } from './funcionario-form/funcionario-form.component';
import { PagamentoListComponent } from './pagamento-list/pagamento-list.component';
import { PagamentoRegisterComponent } from './pagamento-register/pagamento-register.component';
import { AutorizadorListComponent } from './autorizador-list/autorizador-list.component';
import { AutorizadorFormComponent } from './autorizador-form/autorizador-form.component';

const routes: Routes = [
  { path: 'funcionarios', component: FuncionarioListComponent },
  { path: 'addfuncionario', component: FuncionarioFormComponent },
  { path: 'pagamentos', component: PagamentoListComponent },
  { path: 'addpagamento', component: PagamentoRegisterComponent },
  { path: 'autorizadores', component: AutorizadorListComponent },
  { path: 'addautorizador', component: AutorizadorFormComponent }
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }