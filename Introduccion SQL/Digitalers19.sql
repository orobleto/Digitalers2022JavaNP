use sistemaadministrativo;

-- DDL CREATE DROP ALTER

-- DML INSERT SELECT UPDATE DELETE 

-- ACTUALIZACION 
update productos
set cant = cant - 3, FechaVencimiento = date_add(FechaVencimiento, interval 5 day),
Precio = round ((Precio * 1.15),2)
where FechaVencimiento  < '2020-01-01' and Id_Categoria in (4,2,3)


select 
date_add(FechaVencimiento, interval 5 day) 
from productos 
where FechaVencimiento  < '2020-01-01' and Id_Categoria in (4,2,3)

-- select  cast(current_date() - 5 as date) 