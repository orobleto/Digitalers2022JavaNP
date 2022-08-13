-- inner join implecito 
select 
pro.ID ,
pro.Descripcion,
pro.Precio ,
pro.Cant ,
pro.FechaVencimiento ,
pro.Id_Categoria ,
cat.id ,
cat.Descripcion 
from productos as pro, categorias as cat
where pro.Id_Categoria = cat.ID 