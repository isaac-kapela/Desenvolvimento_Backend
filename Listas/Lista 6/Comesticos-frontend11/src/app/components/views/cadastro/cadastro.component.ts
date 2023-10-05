import { Component, OnInit } from '@angular/core';
import { Comestico } from 'src/app/model/Comestico';
import { comesticoService } from 'src/app/service/comestico.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  comestico: Comestico = new Comestico();

    constructor(private comesticoService: comesticoService) {}
  ngOnInit() {

  }

  saveComestico(){
    this.comesticoService.postComestico(this.comestico).subscribe(res => {
      alert(" O Comestico" + this.comestico.nome + " foi cadastrado com sucesso!")
    })

}


}
