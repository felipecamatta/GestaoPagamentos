import { Component, OnInit } from '@angular/core';
import { AutorizadorService } from '../services/autorizador.service';
import { Autorizador } from '../models/autorizador';

@Component({
  selector: 'app-autorizador-list',
  templateUrl: './autorizador-list.component.html',
  styleUrls: ['./autorizador-list.component.css']
})
export class AutorizadorListComponent implements OnInit {

  autorizadores: Autorizador[]

  constructor(private autorizadorService: AutorizadorService) { }

  ngOnInit() {
    this.autorizadorService.findAll().subscribe(data => {
      this.autorizadores = data
    });
  }

  deleteAutorizador(id: String) {
    this.autorizadorService.del(Number(id));
  }
}
