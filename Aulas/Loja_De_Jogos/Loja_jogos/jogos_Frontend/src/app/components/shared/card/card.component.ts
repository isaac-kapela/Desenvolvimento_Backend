import { Component, Input } from '@angular/core';
import { Jogo } from 'src/app/model/jogo';
import { faHeart,faCircleXmark } from '@fortawesome/free-solid-svg-icons';
import { JogoService } from 'src/app/services/jogo.service';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  @Input() jogo!: Jogo;
  faHeart = faHeart;
  faCircleXmark =faCircleXmark;
  mouseOver: boolean = false;

  constructor(private  httpClient: HttpClient, private jogoService: JogoService){ }

  ngOnInit(){
  
  }

  onClickBotaoExcluir (){
    this.jogoService.setJogosAserExcluido(this.jogo);
  }
  

  favoritarJogo(){
    this.jogoService.favoritarJogo(this.jogo.id).subscribe();
    this.jogo.esta_favoritado = !this.jogo.esta_favoritado;
  }
}
