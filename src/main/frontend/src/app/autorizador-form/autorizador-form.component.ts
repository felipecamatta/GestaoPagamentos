import { Component, OnInit } from '@angular/core';
import { Autorizador } from '../models/autorizador';
import { AutorizadorService } from '../services/autorizador.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-autorizador-form',
  templateUrl: './autorizador-form.component.html',
  styleUrls: ['./autorizador-form.component.css']
})
export class AutorizadorFormComponent implements OnInit {

  autorizador: Autorizador

  constructor(private route: ActivatedRoute, private router: Router, private autorizadorService: AutorizadorService) {
    this.autorizador = new Autorizador();
  }

  ngOnInit() {
    this.autorizador = this.autorizadorService.getAutorizador();
  }

  onSubmit() {
    if (this.autorizador.id == undefined) {
      this.autorizadorService.save(this.autorizador).subscribe(result => this.gotoautorizadorList());
    } else {
      this.autorizadorService.update(this.autorizador).subscribe();
      this.router.navigate(['/autorizadores']);
    }
  }

  gotoautorizadorList() {
    this.router.navigate(['/autorizadores']);
  }
}
