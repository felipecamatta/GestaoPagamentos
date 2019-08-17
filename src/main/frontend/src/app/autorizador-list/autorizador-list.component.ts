import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AutorizadorService } from '../services/autorizador.service';
import { Autorizador } from '../models/autorizador';

@Component({
  selector: 'app-autorizador-list',
  templateUrl: './autorizador-list.component.html',
  styleUrls: ['./autorizador-list.component.css']
})
export class AutorizadorListComponent implements OnInit {

  autorizadores: Autorizador[]

  constructor(private route: ActivatedRoute, private router: Router, private autorizadorService: AutorizadorService) { }

  ngOnInit() {
    this.autorizadorService.findAll().subscribe(data => {
      this.autorizadores = data
      this.autorizadores.forEach(autorizador => {
        if (autorizador.disponivel == 's') {
          autorizador.disponivel = 'Sim';
        } else {
          autorizador.disponivel = 'Não';
        }
      });
    });
  }

  onDelete(id: number) {
    this.autorizadorService.delete(id).subscribe(data => {
      alert("Autorizador deletado!");
      this.ngOnInit();
    });
  }

  onUpdate(autorizador: Autorizador) {
    this.autorizadorService.setAutorizador(autorizador);
    this.router.navigate(['/addautorizador']);
  }

  onCreate() {
    let autorizador = new Autorizador();
    this.autorizadorService.setAutorizador(autorizador);
    this.router.navigate(['/addautorizador']);
  }
}
