-- MySQL
CREATE DATABASE dbagenda;
use dbagenda;
show tables;
drop table usuarios;
create table usuarios(
	id int primary key auto_increment,
    nome varchar(50) not null,
    email varchar(50) not null,
    senha varchar(20) not null,
    ddd varchar(2) not null,
    fone varchar(10) not null,
    tipo varchar(10) not null
);
describe usuarios;
SELECT * FROM usuarios;
jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC

-- PostgreSQL
CREATE DATABASE dbagenda
  WITH OWNER = admin
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;

CREATE TABLE usuarios(
    id serial NOT NULL,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(20) NOT NULL,
    ddd VARCHAR(2) NOT NULL,
    fone VARCHAR(10) NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    PRIMARY KEY(ID)
);
SELECT * FROM usuarios;
