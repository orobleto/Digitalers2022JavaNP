# funciones matematicas
select ABS(-5), ROUND(5.3769,2), ceil (5.00001), floor(5.9999);

# funciones de cadena
select concat('Hola',' - ','Mundo',';'),ltrim('      hola'),
rtrim('hola               '), trim ('          h           '),
'    hola     '

# funciones de fecha
select now(), 
current_time() , 
current_timestamp(),
current_date(),
datediff('1983-03-15','2022-08-10'), -- dias
date_add('1983-03-15', interval 25 year),
year(now()),
month(now()),
day(now()),
hour(now()),
minute(now()),
monthname(now()); 