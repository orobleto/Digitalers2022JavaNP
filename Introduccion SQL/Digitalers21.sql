/*
drop table if exists documentos;

create table if not exists documentos
(
	id bigint auto_increment primary key,
	abrev char(3) not null ,
	descripcion varchar(100) not null
);

insert into documentos (abrev,descripcion) 
values 
('DNI','Documento Nacional de Identidad'),
('LE','Libreta de Enrolamiento'),
('PAS','Pasaporte');
*/

select * from documentos;

delete from documentos;

-- ALTER TABLE documentos AUTO_INCREMENT = 1;

-- DDL Truncate 

truncate table documentos; -- simil a hacer un drop and create




