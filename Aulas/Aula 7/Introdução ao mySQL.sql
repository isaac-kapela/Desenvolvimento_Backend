create database jogo;

use jogo;

create table heroi(
	id int auto_increment primary key,
    nome varchar(30),
    ataque int,
    defesa int,
    pontos_vida int
);


alter table heroi modify column id int  auto_increment primary key;


describe heroi;

insert into heroi (id,nome,ataque,defesa,pontos_vida) values('1','sonic','10','8','20');

insert into heroi (id,nome,ataque,defesa,pontos_vida)values('2',' Sonic amarelo','5','10','15');

insert into heroi (id,nome,ataque,defesa,pontos_vida) values('3',' Sonic vermelho','15','10','20');

insert into heroi (id,nome,ataque,defesa,pontos_vida) values('4',' Sonic rosa','15','15','15');

insert into heroi (id,nome,ataque,defesa,pontos_vida) values('4',' Sonic rosa','15','15','15');

insert into heroi (id,nome,ataque,defesa,pontos_vida) values('5',' Sonic marrom','15','13','25');

insert into heroi (id,nome,ataque,defesa,pontos_vida) values(' Sonic preto','15','13','25');

select * from heroi;

delete from heroi;

  

 create table dungeon(
	id int,
	nome varchar(30),
    lugar varchar(30),
    numero_inimigos varchar(30),
    numero_sala_secreta varchar(30)
);
    
create table inimigo(
		id int,
        nome varchar(30),
        ataque int,
        defesa int,
        pontos_vida int
);

create table mascote(
	id int auto_increment primary key,
    nome varchar(30),
    id_heroi int,
    foreign key (id_heroi) references heroi(id)
    );
    
    insert into mascote (nome, id_heroi) values('soniczin',1);
    insert into mascote (nome, id_heroi) values('sonic rosasin',4);
    insert into mascote (nome, id_heroi) values('sonic pretin',3);
    
    select * from mascote where id_heroi =1;
    
    describe mascote;
    
    alter table mascote modify column id_heroi int not null;
    
    
    
	


    
    
    

    


