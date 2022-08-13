-- ejercicio


select * 
from productos 
where Id_Categoria not in (select id from categorias);

select * 
from categorias
where id not in (select id_categoria  from productos);