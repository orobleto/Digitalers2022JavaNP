DROP TABLE IF EXISTS categorias;

CREATE TABLE categorias (
  ID int(11) NOT NULL,
  Descripcion varchar(100) DEFAULT NULL,
  PRIMARY KEY (ID)
);
-- 1 Deportes 0
-- 2 basquet 1

INSERT INTO categorias VALUES (1,'Fármaco controlados');
INSERT INTO categorias VALUES (1,'Fármaco controlados');
INSERT INTO categorias VALUES (1,'Fármaco controlados');
INSERT INTO categorias VALUES (2,'Fármaco de venta sólo con receta');
INSERT INTO categorias VALUES (3,'Fármaco de venta con receta y sello Gobierno');
INSERT INTO categorias VALUES (4,'Listado de venta general');
INSERT INTO categorias VALUES (5,'Resfriado');
INSERT INTO categorias VALUES (6,'COVID');