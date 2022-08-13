-- sub consultas correlacionadas
 -- 

select 
pro.ID,
pro.Descripcion,
pro.Precio,
pro.Cant,
pro.FechaVencimiento,
pro.Id_Categoria,
(select cat.descripcion from categorias as cat where cat.Id = pro.Id_Categoria order by cat.id limit 1) as descripcion_categoria
from productos as pro