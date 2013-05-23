create schema engajamundoDB;
use engajamundoDB;
create table Produto (nome VARCHAR(100),preco INT);

create table Engajador (nome VARCHAR(50), sobrenome VARCHAR(50), email VARCHAR(50), dataNascimento VARCHAR(10),	
telefone INT (12), skype VARCHAR (20), fbProfile VARCHAR(50), cidade VARCHAR(30), estado VARCHAR(30),  		
pais VARCHAR(20), comentarios VARCHAR (140), login VARCHAR(20) PRIMARY KEY, senha VARCHAR(16));


