-- sub consulta como campo y condicion
select 
ID,
Descripcion,
Precio,
Cant,
FechaVencimiento,
Id_Categoria,
(select fechaactual from parametros where id = 1),
(select id from parametros where id = 1)-- si y solo si una columna 
from productos 
where year(FechaVencimiento) in (select fechaactual from parametros) 

-- sub consulta como origen de datos
select 
categoria,
anio_vencimiento
from
(
	select 
	Id_Categoria as categoria,
	year(FechaVencimiento)  anio_vencimiento, -- alias 
	month (FechaVencimiento) mes_vencimiento,
	AVG(precio) promedio,
	SUM(Cant) as 'cantidad de elementos',
	min(precio) as `minimo producto`,
	max(precio) as maximo,
	count(*) as cantidad,
	group_concat(Descripcion) as productos_involucrados
	from productos 
	where year(FechaVencimiento) != 2018 -- and or in like 
	group by Id_Categoria , year(FechaVencimiento) ,month (FechaVencimiento)
	having SUM(Cant) > 5
	order by cantidad
) as estadisticas_producto
where anio_vencimiento in (select fechaactual from parametros)

