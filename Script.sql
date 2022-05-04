	CREATE DATABASE UNIVERSIDAD;
	USE UNIVERSIDAD;
    
	CREATE TABLE ESTUDIANTE(
	id_estudiante int primary key auto_increment,
	tipo varchar(20),
	documento bigint,
	nombre varchar(20),
	apellido varchar(20),
	valorMatricula int);
    
    CREATE TABLE PROFESOR(
    DOCUMENTO BIGINT PRIMARY KEY,
    NOMBRE VARCHAR (30),
    TELEFONO BIGINT,
    DIRECCION VARCHAR(40),
    TITULO VARCHAR(30),
    FECHA_REGISTRO DATETIME);
    
INSERT INTO PROFESOR (DOCUMENTO,NOMBRE,TELEFONO,DIRECCION,TITULO,FECHA_REGISTRO) VALUES (123123,"Chucho",321321,"Cll 73","Doctor",now());
select id_estudiante from estudiante where documento=3;
select * from estudiante;
delete from estudiante where id_estudiante=3;
update estudiante set tipo="tarjeta",documento=10,nombre="moran",apellido="checho",valorMatricula=120000 where id_estudiante=6;
select * from estudiante;

