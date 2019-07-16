import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FuncionarioListComponent } from './funcionario-list/funcionario-list.component';
import { FuncionarioFormComponent } from './funcionario-form/funcionario-form.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { FormsModule } from '@angular/forms';
import { FuncionarioService } from './services/funcionario.service';
import { PagamentoRegisterComponent } from './pagamento-register/pagamento-register.component';
import { PagamentoListComponent } from './pagamento-list/pagamento-list.component';
import { AutorizadorListComponent } from './autorizador-list/autorizador-list.component';
import { AutorizadorFormComponent } from './autorizador-form/autorizador-form.component';

@NgModule({
  declarations: [
    AppComponent,
    FuncionarioListComponent,
    FuncionarioFormComponent,
    PagamentoRegisterComponent,
    PagamentoListComponent,
    AutorizadorListComponent,
    AutorizadorFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [FuncionarioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
