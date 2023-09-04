import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Comestico } from '../models/cosmetico';
import { Observable } from 'rxjs/Observable';



@Injectable({
  providedIn: 'root'
})
export class CosmeticoService{
  private rota: string = "http://localhost:8080/comesticos"

  constructor(private httpClient : HttpClient) { }

  public getCosmeticos(): Observable<Comestico[]> {
    return this.httpClient.get<Comestico[]>(this.rota)
  }

  public postCosmetico(cosmetico: Comestico): Observable<Comestico>{
    return this.httpClient.post<Comestico>(this.rota, cosmetico)
  }
}