import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Comestico } from "../model/Comestico";
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'

})


export class comesticoService{
  private rota: string = "http://localhost:8080/cosmeticos"

  constructor(private httpClient: HttpClient){}

  public getComestico(): Observable<Comestico[]>{
    return this.httpClient.get<Comestico[]>(this.rota);
  }

  public postComestico(cosmetico: Comestico): Observable<Comestico>{
    return this.httpClient.post<Comestico>(this.rota, cosmetico);
  }


}


