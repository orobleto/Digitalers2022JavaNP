-- utilizar base de datos
use digitalers2022;

-- crear tabla
create table if not exists alumnos(
	tipo_documento char(3) not null default 'DNI',
	numero_documento varchar(15) not null,
	nombre varchar(100) not null,
	apellido varchar(100) not null,
	fecha_nacimiento date not null,
	fecha_actualizacion datetime not null,
	activo boolean default 1,
	correo varchar(100) null,
	observaciones text null,
	primary key (numero_documento,tipo_documento )
);

-- borrar tabla
-- drop table if exists alumnos;

create table if not exists cursos(
	id int auto_increment primary key, 
	descripcion varchar(100) not null,
	fecha_creacion timestamp default current_timestamp()
	-- primary key(id)
);


create table if not exists cursos_alumnos(
	id_curso int,
	tipo_documento_alumno char(3),
	numero_documento_alumno varchar(15),
	foreign key (id_curso) references cursos (id),
	foreign key(numero_documento_alumno,tipo_documento_alumno)
	references alumnos (numero_documento, tipo_documento)
);





