import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FuncionarioListComponent } from './funcionario-list/funcionario-list.component';
import { FuncionarioFormComponent } from './funcionario-form/funcionario-form.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { FormsModule } from '@angular/forms';
import { FuncionarioService } from './services/funcionario.service';
import { PagamentoListComponent } from './pagamento-list/pagamento-list.component';
import { AutorizadorListComponent } from './autorizador-list/autorizador-list.component';
import { AutorizadorFormComponent } from './autorizador-form/autorizador-form.component';
import { AutorizadorService } from './services/autorizador.service';
import { PagamentoAuthorizeComponent } from './pagamento-authorize/pagamento-authorize.component';
import { PagamentoOcorrenciasComponent } from './pagamento-ocorrencias/pagamento-ocorrencias.component';
import { PagamentoFormComponent } from './pagamento-form/pagamento-form.component';

import { NgbModule, NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    FuncionarioListComponent,
    FuncionarioFormComponent,
    PagamentoListComponent,
    AutorizadorListComponent,
    AutorizadorFormComponent,
    PagamentoAuthorizeComponent,
    PagamentoOcorrenciasComponent,
    PagamentoFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [
    FuncionarioService,
    AutorizadorService,
    NgbActiveModal
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
