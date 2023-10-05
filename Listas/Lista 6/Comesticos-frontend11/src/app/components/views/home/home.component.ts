import { comesticoService } from './../../../service/comestico.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Comestico } from 'src/app/model/Comestico';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{


Comesticos!: Comestico[];

constructor(private comesticoService: comesticoService ){ }
  ngOnInit(): void {
    this.fillComestico();
  }

  fillComestico(){
    this.comesticoService.getComestico().subscribe(res => {
      this.Comesticos = res;
   })
  }


}
