-- 
alter view view_comision
as
(
	select 
	vend.TipoDocumento as tipodoc_vendedor,
	vend.Documento as numdoc_vendedor,
	vend.RazonSocial as rs_vendedor,
	coalesce(ventas.Monto,0) as monto,-- varios parametros (valor1,valor2,valor3,'0')
	ifnull(round (ventas.Monto *0.075,2),0) as comision_vendedor,
	sup.TipoDocumento as tipodoc_supervisor,
	sup.Documento as numdoc_supervisor,
	sup.RazonSocial as rs_supervisor,
	ifnull(round (ventas.Monto *0.005,2),0) as comision_supervisor
	from vendedores as vend
	inner join vendedores as sup on vend.TipoDocumento_Sup = sup.TipoDocumento and vend.Documento_Sup = sup.Documento 
	left join 
	(
		select 
		TipoDocumento ,
		Documento,
		sum(monto) as monto
		from ventas  as vta
		group by TipoDocumento , Documento 
	) as ventas on ventas.TipoDocumento = vend.TipoDocumento and ventas.Documento = vend.Documento 
);

