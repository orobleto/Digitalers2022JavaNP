
/*create table if not exists productos_auditoria
(
	id int not null,
	precio_anterior double,
	precio_nuevo double,
	usuario varchar(100)
);*/

drop trigger if exists tg_productos_audit;
delimiter $$
create trigger tg_productos_audit
-- before after 
before 
-- insert, update , delete 
update 
on productos for each row 

begin 
	 if(new.precio < 5) then 
		insert into productos_auditoria (id,precio_anterior,precio_nuevo,usuario)
		values (new.id,old.precio,new.precio,user());
	 end if;	
end
