DROP TABLE IF EXISTS categorias;

CREATE TABLE categorias (
  ID int(11) NOT NULL,
  Descripcion varchar(100) DEFAULT NULL,
  PRIMARY KEY (ID)
);
-- 1 Deportes 0
-- 2 basquet 1

INSERT INTO categorias VALUES (1,'F�rmaco controlados');
INSERT INTO categorias VALUES (1,'F�rmaco controlados');
INSERT INTO categorias VALUES (1,'F�rmaco controlados');
INSERT INTO categorias VALUES (2,'F�rmaco de venta s�lo con receta');
INSERT INTO categorias VALUES (3,'F�rmaco de venta con receta y sello Gobierno');
INSERT INTO categorias VALUES (4,'Listado de venta general');
INSERT INTO categorias VALUES (5,'Resfriado');
INSERT INTO categorias VALUES (6,'COVID');