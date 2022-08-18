
create table if not exists proveedores(
	tipo_documento char(3) not null,
	numero_documento varchar(15) not null,
	razon_social varchar(100),
	fecha_creacion datetime,
	correo varchar(100) not null,
	constraint pk_proveedores primary key (numero_documento,tipo_documento),
	constraint ux_proveedores_correo unique(correo),
	constraint ch_proveedores_td check (tipo_documento in ('DNI','LE','PAS')),
	constraint ch_proveedores_fecha check(fecha_creacion > '1900-01-01' and fecha_creacion < '2030-01-01')
);


