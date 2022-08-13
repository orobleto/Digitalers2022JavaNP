-- union left join

select 
pro.ID ,
pro.Descripcion,
pro.Precio ,
pro.Cant ,
pro.FechaVencimiento ,
pro.Id_Categoria ,
cat.id ,
cat.Descripcion 
from productos as pro
left join categorias as cat on cat.id  = pro.Id_Categoria 
-- where cat.id is null