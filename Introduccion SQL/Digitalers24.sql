create view view_rendimiento_vendedores
as
(
	select 
	TipoDocumento ,
	Documento,
	year (fecha), 
	month(fecha),
	case month(fecha)
		when 1	then 'Ene'
		when 2	then 'Feb'
		when 3	then 'Mar'
		when 4	then 'Abr'
		when 5	then 'May'
		when 6	then 'Jun'
		when 7	then 'Jul'
		when 8	then 'Ago'
		when 9	then 'Sep'
		when 10	then 'Oct'
		when 11	then 'Nov'
		when 12	then 'Dic'	
	end as mes_letras,
	-- bajo rendimiento, supero espectativas , buen vendedor
	case 
		when (sum(monto) < 500) then 'Bajo rendimiento'
		when (sum(monto) >= 500 and sum(monto) < 1000) then 'Buen vendedor'
		else 'Supero espectativas'	
	end as rendimiento,
	sum(monto)
	from ventas  as vta
	group by TipoDocumento , Documento ,year (fecha), month(fecha)
	order by TipoDocumento , Documento, year (fecha), month(fecha)
)


select * from view_rendimiento_vendedores;
