import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { CardComponent } from "./components/shared/card/card.component";
import { NavbarComponent } from "./components/shared/navbar/navbar.component";
import { CadastroComponent } from "./components/views/cadastro/cadastro.component";
import { HomeComponent } from "./components/views/home/home.component";
import { AppRoutingModule } from "./app-routing.module";
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from "@angular/forms";
import { FontAwesomeModule } from "@fortawesome/angular-fontawesome";
import { NgModule } from "@angular/core";
import { ModalExclusaoComponent } from './components/shared/modal-exclusao/modal-exclusao.component';



@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    HomeComponent,
    CadastroComponent,
    NavbarComponent,
    ModalExclusaoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    FontAwesomeModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
