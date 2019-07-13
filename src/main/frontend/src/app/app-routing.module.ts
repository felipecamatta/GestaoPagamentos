import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FuncionarioListComponent } from './funcionario-list/funcionario-list.component';
import { FuncionarioFormComponent } from './funcionario-form/funcionario-form.component';
 
const routes: Routes = [
  { path: 'funcionarios', component: FuncionarioListComponent },
  { path: 'addfuncionario', component: FuncionarioFormComponent },
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }