-- utilizar base de datos
use digitalers2022;

alter table cursos add column activo int;

alter table cursos drop column fecha_creacion;

alter table cursos modify activo boolean default 1;