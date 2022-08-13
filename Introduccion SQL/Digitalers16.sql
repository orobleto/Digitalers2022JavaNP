-- self join
use sistemaadministrativo;

select 
vend.TipoDocumento,
vend.documento,
vend.razonsocial,
sup.tipodocumento,
sup.documento,
sup.razonsocial
from vendedores as vend
inner join vendedores as sup 
on vend.TipoDocumento_Sup = sup.TipoDocumento and vend.Documento_Sup = sup.Documento 
