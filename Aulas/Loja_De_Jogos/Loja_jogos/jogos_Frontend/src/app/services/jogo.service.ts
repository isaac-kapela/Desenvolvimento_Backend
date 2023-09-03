import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Jogo } from '../model/jogo';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JogoService {
    private rota: string = "http://localhost:8080/jogos"

    private jogoAserExcluidoSubject = new BehaviorSubject<any>(null);
    jogoAserExcluido$ = this.jogoAserExcluidoSubject.asObservable();

    constructor(private httpClient: HttpClient) { }

    setJogosAserExcluido(jogo: any){
      this.jogoAserExcluidoSubject.next(jogo);
    }
  
    deletarJogo(id: number){
      this.httpClient.delete(this.rota + id).subscribe();
      window.location.reload();
    }

    public getJogos(): Observable<Jogo[]>{
      return this.httpClient.get<Jogo[]>(this.rota)
    }
    public postJogo(jogo: Jogo): Observable<Jogo>{
      return this.httpClient.post<Jogo>(this.rota, jogo);
  }

  public favoritarJogo(id: number): Observable<Jogo> {
    return this.httpClient.put<Jogo>(this.rota + "/favoritar/" + id , null);

  }
 
}
