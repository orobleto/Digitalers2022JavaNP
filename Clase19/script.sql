create database if not exists digitalers_base_prueba;

use digitalers_base_prueba;

create table if not exists prueba
(
	id int auto_increment primary key,
	descripcion varchar(100) not null,
	fecha datetime not null,
	activo boolean,
	valor double
);