-- union right join

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
right join categorias as cat on cat.id  = pro.Id_Categoria 
-- where pro.ID is null