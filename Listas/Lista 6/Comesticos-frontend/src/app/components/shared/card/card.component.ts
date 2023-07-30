import { Component, Input } from "@angular/core";
import { Comestico } from "src/app/model/Comestico";


@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export  class CardComponent   {

  @Input() comestico!: Comestico;


}
