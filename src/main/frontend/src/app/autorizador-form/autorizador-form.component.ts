import { Component, OnInit } from '@angular/core';
import { Autorizador } from '../models/autorizador';
import { AutorizadorService } from '../services/autorizador.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-autorizador-form',
  templateUrl: './autorizador-form.component.html',
  styleUrls: ['./autorizador-form.component.css']
})
export class AutorizadorFormComponent {

  autorizador: Autorizador

  constructor(private route: ActivatedRoute, private router: Router, private autorizadorService: AutorizadorService) {
    this.autorizador = new Autorizador();
  }
 
  onSubmit() {
    this.autorizadorService.save(this.autorizador).subscribe(result => this.gotoautorizadorList());
  }
 
  gotoautorizadorList() {
    this.router.navigate(['/autorizadores']);
  }
}
