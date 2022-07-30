use digitalers2022;


-- DML Data Manipulation Lenguage
-- DML Insert CRUD representa la C y en el ABMC representa la A
-- FECHAS YYYY-MM-DD
-- FECHAS CON TIEMPO -- YYYY-MM-DD HH:MM:SS.SSS
insert into alumnos 
(tipo_documento,numero_documento,nombre,apellido,fecha_nacimiento,fecha_actualizacion,activo,correo,observaciones)
values 
('DNI','02','Alumno', '02','1983-03-16','2022-07-29 20:56:45',1,'alumno02@educacionit.com','Aca van las observaciones');

insert into alumnos 
(tipo_documento,numero_documento,nombre,apellido,fecha_nacimiento,fecha_actualizacion,activo,correo,observaciones)
values 
('DNI','03','Alumno', '03','2000-03-16','2022-07-29 20:56:45',1,'alumno03@educacionit.com',null);

insert into alumnos 
(tipo_documento,numero_documento,nombre,apellido,fecha_nacimiento,fecha_actualizacion,activo,correo)
values 
('DNI','04','Alumno', '04','1985-06-16','2022-07-29 20:56:45',1,'alumno04@educacionit.com');

insert into alumnos 
(numero_documento,nombre,apellido,fecha_nacimiento,fecha_actualizacion,correo)
values 
('05','Alumno', '05','1983-06-16','2022-07-29 20:56:45','alumno05@educacionit.com');





-- insertar con campos implicitos, es obligatorio que esten como argumento todos los campos
-- en algunos motores de base de datos esta permitido insertar un autoincrementable 

insert into cursos values (1,'Java','2022-07-29 20:56:45');


insert into cursos (descripcion) values ('Python');

-- insertar masivamente

insert into cursos values 
(3,'HTML','2022-07-29 20:56:45'),
(4,'CSS','2022-07-29 20:56:45'),
(5,'JavaScript','2022-07-29 20:56:45');

insert into cursos (descripcion) values
('SQL Server'),
('Java Web Api'),
('GIT'),
('Spring');

-- DCL
-- insertar cursos alumnos

insert into cursos_alumnos (id_curso,tipo_documento_alumno,numero_documento_alumno)
values (1,'DNI','01');


insert into cursos_alumnos (id_curso,tipo_documento_alumno,numero_documento_alumno)
values (2,'DNI','03');





 




 