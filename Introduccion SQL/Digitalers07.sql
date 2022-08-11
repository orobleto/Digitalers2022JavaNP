-- funciones de agrupacion o agregado

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
-- join
where year(FechaVencimiento) != 2018 -- and or in like 
group by Id_Categoria , year(FechaVencimiento) ,month (FechaVencimiento)
having SUM(Cant) > 5
order by cantidad


# diferencia entre las formas de contar
select count(*),count(1), count(10),count(TipoDocumento),count(telefono) from clientes
