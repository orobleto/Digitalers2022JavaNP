-- insertar masivamente
insert into documentos (abrev,descripcion)

select distinct
TipoDocumento,
concat(TipoDocumento , ' - ', ' ...')
from clientes;

-- select * from documentos;

-- truncate table documentos;