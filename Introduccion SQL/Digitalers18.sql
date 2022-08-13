select 
vend.TipoDocumento ,
vend.Documento ,
vend.RazonSocial ,
ventas.anio,
ventas.mes,
ventas.total,
ventas.cantidad,
ventas.montoMaximo,
if (ventas.cantidad>1,(ventas.total*0.1),0) as comision
from
(
	select 
	vta.TipoDocumento , 
	vta.Documento ,
	year(vta.fecha) as anio,
	month(vta.fecha) as mes,
	sum(vta.Monto) as total,
	count (*) as cantidad,
	max(vta.Monto) as montoMaximo
	from ventas vta
	group by vta.TipoDocumento , vta.Documento , year(vta.fecha) , month(vta.fecha)
) as ventas 
inner join vendedores as vend on vend.TipoDocumento  = ventas.TipoDocumento and vend.Documento = ventas.Documento  

