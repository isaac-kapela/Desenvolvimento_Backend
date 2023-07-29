
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Comestico } from 'src/app/model/Comestico';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

Comesticos!: Comestico[];

  constructor(private httpClient: HttpClient){}


  ngOnInit(): void {
    this.getComestico();
  }

  getComestico(){
    this.httpClient.get<Comestico[]>("http://localhost:8080/comesticos").subscribe(res =>{
      this.Comesticos = res;
    })
  }

}
