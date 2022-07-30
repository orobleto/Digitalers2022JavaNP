-- Volcando estructura de base de datos para sistemaadministrativo
DROP DATABASE IF EXISTS sistemaadministrativo;
CREATE DATABASE IF NOT EXISTS sistemaadministrativo ;
USE sistemaadministrativo;


DROP TABLE IF EXISTS categorias;

CREATE TABLE categorias (
  ID int(11) NOT NULL,
  Descripcion varchar(100) DEFAULT NULL,
  PRIMARY KEY (ID)
);
-- 1 Deportes 0
-- 2 basquet 1

INSERT INTO categorias VALUES (1,'Fármaco controlados');
INSERT INTO categorias VALUES (2,'Fármaco de venta sólo con receta');
INSERT INTO categorias VALUES (3,'Fármaco de venta con receta y sello Gobierno');
INSERT INTO categorias VALUES (4,'Listado de venta general');
INSERT INTO categorias VALUES (5,'Resfriado');
INSERT INTO categorias VALUES (6,'COVID');


--
-- Table structure for table clientes
--

DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes (
  TipoDocumento char(3) NOT NULL DEFAULT 'DNI',
  Documento varchar(15) NOT NULL,
  RazonSocial varchar(100) NOT NULL,
  Correo varchar(255) DEFAULT NULL,
  FechaNacimiento date NOT NULL,
  Telefono varchar(100) DEFAULT NULL,
  PRIMARY KEY (TipoDocumento,Documento)
) ;

INSERT INTO clientes VALUES ('CI','13598567','Pérez, Giancarlo V.','ut.pharetra@acfermentum.co.uk','1998-01-23','(595) 947-5835');
INSERT INTO clientes VALUES ('CI','15033655','Parra, Geremy P.','orci.Phasellus@Donectempuslorem.net','1983-06-23','(828) 298-7031');
INSERT INTO clientes VALUES ('CI','15270704','Orellana, Kelly K.','Quisque.nonummy.ipsum@milacinia.net','1977-12-07','(586) 952-6506');
INSERT INTO clientes VALUES ('CI','15609234','Morales, Anthuan E.','Curabitur@Maurisut.net','1993-03-10','(457) 861-5675');
INSERT INTO clientes VALUES ('CI','20595018','Valdés, Elian Q.','Nunc.ut@Proin.org','1989-09-28','(189) 578-6959');
INSERT INTO clientes VALUES ('CI','22776644','Vega, Philippe I.','ornare@nibh.com','1979-07-17','(750) 415-3781');
INSERT INTO clientes VALUES ('CI','23740575','Peña, Darío Q.','Maecenas.malesuada.fringilla@atauctor.ca','1973-09-07','(880) 634-8407');
INSERT INTO clientes VALUES ('CI','27269355','Rojas, Abel H.','lectus@dapibusligula.org','1996-10-10','(630) 929-4555');
INSERT INTO clientes VALUES ('CI','28342938','Araya, Eydan L.','Nulla.tempor.augue@feugiatLoremipsum.org','1985-10-10','(709) 185-5262');
INSERT INTO clientes VALUES ('CI','29044346','Rojas, Silvio M.','Cum.sociis@magnisdis.edu','1988-06-26','(301) 359-7717');
INSERT INTO clientes VALUES ('CI','30309279','Navarrete, Josías G.','tellus.Phasellus.elit@vel.edu','1998-12-02','(925) 611-9902');
INSERT INTO clientes VALUES ('CI','30465798','Espinoza, Danitza B.','dui@ipsumSuspendissesagittis.edu','1991-03-30','(304) 745-5465');
INSERT INTO clientes VALUES ('CI','31957842','Orellana, Jael A.','enim.Nunc.ut@diamatpretium.org','1970-12-10','(500) 248-6039');
INSERT INTO clientes VALUES ('CI','32079374','Álvarez, Ayron V.','ac@Phasellusdapibusquam.org','2003-06-20','(182) 744-8832');
INSERT INTO clientes VALUES ('CI','32353800','Cárdenas, Natanael P.','gravida.Aliquam.tincidunt@velconvallis.com','1979-08-12','(833) 660-0746');
INSERT INTO clientes VALUES ('CI','34198626','Molina, Polette U.','imperdiet.ullamcorper.Duis@dolorQuisque.edu','1974-09-02','(900) 196-7946');
INSERT INTO clientes VALUES ('CI','37717928','Poblete, Rodolfo S.','non.dapibus@Nam.org','2001-06-01','(256) 811-9310');
INSERT INTO clientes VALUES ('CI','38660047','Vargas, Marión N.','non.leo.Vivamus@Quisque.net','1993-05-31','(816) 893-0431');
INSERT INTO clientes VALUES ('CI','41077631','Álvarez, Tonka V.','venenatis.a.magna@orci.net','1982-02-22','(639) 197-3176');
INSERT INTO clientes VALUES ('CI','41300977','Maldonado, Eddie U.','in.tempus@enim.ca','1994-11-05','(708) 818-7077');
INSERT INTO clientes VALUES ('CI','41893257','Valenzuela, Alina K.','auctor.velit.Aliquam@ac.org','1978-09-26','(167) 578-0050');
INSERT INTO clientes VALUES ('CI','42905696','Araya, Cecilia U.','in.faucibus.orci@PraesentluctusCurabitur.co.uk','1970-10-08','(993) 721-0399');
INSERT INTO clientes VALUES ('CI','43469721','Martínez, Micaela A.','fames.ac.turpis@Duisvolutpatnunc.ca','1996-06-03','(840) 896-8713');
INSERT INTO clientes VALUES ('CI','45337465','Parra, Solange Q.','quis@risusNunc.ca','1973-09-23','(310) 424-2597');
INSERT INTO clientes VALUES ('CI','46182844','Cortés, Cindy T.','primis@consectetueradipiscingelit.org','1987-03-18','(597) 340-4573');
INSERT INTO clientes VALUES ('CI','50481978','Alarcón, Anastacia Z.','arcu.Vestibulum@diam.edu','1992-05-18','(110) 214-5657');
INSERT INTO clientes VALUES ('CI','50703813','Aravena, Santos H.','Nunc@elitCurabitur.edu','1998-02-20','(450) 677-4399');
INSERT INTO clientes VALUES ('CI','6328777','Saavedra, Susan M.','aliquam.arcu@enimMaurisquis.org','1972-08-02','(843) 972-1860');
INSERT INTO clientes VALUES ('CI','7065603','Miranda, Britany G.','Cum.sociis@blanditcongue.net','1981-10-17','(787) 428-4023');
INSERT INTO clientes VALUES ('CI','8800139','Vásquez, Sophía Z.','Curabitur@musProinvel.edu','1994-01-12','(739) 592-9308');
INSERT INTO clientes VALUES ('DNI','13950064','Pérez, Andriu W.','arcu.ac@Vestibulumaccumsanneque.edu','1997-06-02','(945) 600-3199');
INSERT INTO clientes VALUES ('DNI','16834729','Ortiz, Maritza D.','Pellentesque@scelerisque.com','1978-10-18','(574) 158-3470');
INSERT INTO clientes VALUES ('DNI','18291726','Morales, Alexia Y.','Ut.semper@eu.org','1978-05-02','(975) 414-3499');
INSERT INTO clientes VALUES ('DNI','18768094','Godoy, Nataniel J.','nisl.Nulla.eu@luctusipsum.com','1978-02-21','(546) 686-2645');
INSERT INTO clientes VALUES ('DNI','18820180','Pino, Angeles Q.','dis.parturient@Cumsociisnatoque.edu','1979-05-28','(613) 690-3989');
INSERT INTO clientes VALUES ('DNI','20148922','Miranda, Adán U.','Duis.volutpat.nunc@liberoat.co.uk','1999-08-18','(521) 938-8004');
INSERT INTO clientes VALUES ('DNI','21122462','Vásquez, Guisela G.','tempor.diam.dictum@eutellus.co.uk','1982-02-24','(735) 815-3306');
INSERT INTO clientes VALUES ('DNI','21908901','Castillo, Camilo D.','accumsan.convallis.ante@nuncinterdumfeugiat.co.uk','1990-01-12','(138) 659-3698');
INSERT INTO clientes VALUES ('DNI','22329021','Vargas, Carmen B.','lorem.ipsum.sodales@purusMaecenaslibero.com','1981-10-13','(777) 419-7571');
INSERT INTO clientes VALUES ('DNI','22983702','Vidal, Mijael P.','euismod@magnaSedeu.com','2001-10-21','(504) 711-6069');
INSERT INTO clientes VALUES ('DNI','24924136','Ortega, Amaya E.','mi.lorem.vehicula@imperdiet.com','2002-04-30','(460) 636-7853');
INSERT INTO clientes VALUES ('DNI','25495120','Palma, Dorian W.','Nunc@nislarcuiaculis.net','1993-07-21','(810) 634-4106');
INSERT INTO clientes VALUES ('DNI','27002262','Vergara, Cristofher V.','dolor.quam.elementum@scelerisquelorem.edu','1990-01-26','(791) 519-8122');
INSERT INTO clientes VALUES ('DNI','28057098','Sepúlveda, Luccas P.','eu@Vivamus.co.uk','1976-07-08','(662) 245-2728');
INSERT INTO clientes VALUES ('DNI','29647258','Pérez, Darío G.','odio.vel@neque.com','1999-05-03','(315) 861-8137');
INSERT INTO clientes VALUES ('DNI','29967529','Alarcón, Dante T.','ut@egestas.edu','1973-01-29','(724) 950-4926');
INSERT INTO clientes VALUES ('DNI','30479732','Espinoza, Fabiana F.','metus.vitae.velit@quamdignissim.org','1989-08-21','(702) 574-0485');
INSERT INTO clientes VALUES ('DNI','31088514','Pérez, Víctor I.','ut.nisi@Nuncmauris.edu','1992-10-12','(817) 817-7043');
INSERT INTO clientes VALUES ('DNI','31842603','Navarro, Ashley G.','lacus@anequeNullam.edu','1981-01-19','(888) 922-5402');
INSERT INTO clientes VALUES ('DNI','39737938','Fuentes, Alonzo P.','molestie@neque.co.uk','1983-12-01',NULL);
INSERT INTO clientes VALUES ('DNI','40662639','Navarrete, Dennis C.','sem.ut@ipsumDonecsollicitudin.ca','1999-04-21','(135) 725-1100');
INSERT INTO clientes VALUES ('DNI','41164764','Vergara, Cain J.','nisi.sem@Maecenasmalesuada.edu','1976-08-27','(128) 628-4803');
INSERT INTO clientes VALUES ('DNI','41281280','Salazar, Zahir W.','Vivamus.euismod.urna@egestas.ca','1986-05-30','(738) 709-5141');
INSERT INTO clientes VALUES ('DNI','43593797','Navarro, Viviana I.','ipsum.Curabitur.consequat@venenatis.com','1998-03-16','(131) 680-6470');
INSERT INTO clientes VALUES ('DNI','44063211','Salazar, Danko X.','eu.eleifend@vitaealiquam.ca','2002-06-01','(679) 882-0519');
INSERT INTO clientes VALUES ('DNI','46041235','Espinoza, Fredy A.','elit.pede.malesuada@dictummiac.edu','1991-07-24','(899) 927-4728');
INSERT INTO clientes VALUES ('DNI','49677520','Bustamante, Michelle G.','Nunc.ullamcorper.velit@diameu.co.uk','1999-09-14','(301) 780-9569');
INSERT INTO clientes VALUES ('DNI','7833583','Valdés, Arnaldo N.','risus@pedePraesent.net','1972-10-29','(344) 106-5126');
INSERT INTO clientes VALUES ('DNI','9127130','Carvajal, Deivi J.','enim@enim.org','1979-06-24','(101) 703-4647');
INSERT INTO clientes VALUES ('DNI','9347361','Parra, Marc L.','adipiscing.elit@cubiliaCuraeDonec.org','1985-08-02','(283) 689-3278');
INSERT INTO clientes VALUES ('LE','10166610','Rivera, Alejandra Y.','pellentesque.massa@montes.ca','2001-04-29','(282) 294-4888');
INSERT INTO clientes VALUES ('LE','13901779','Ortega, Pablo C.','Cras.eget.nisi@nonegestas.edu','2003-08-21','(963) 569-7422');
INSERT INTO clientes VALUES ('LE','15264896','Martínez, Alexandro I.','nunc@velvenenatisvel.com','1982-09-04','(671) 335-4202');
INSERT INTO clientes VALUES ('LE','15748056','Reyes, Rosario Z.','amet.dapibus@orciUt.com','1980-01-18','(742) 681-5595');
INSERT INTO clientes VALUES ('LE','18905506','Alarcón, Nayarett V.','non.sapien.molestie@senectusetnetus.edu','2002-06-18','(982) 633-4805');
INSERT INTO clientes VALUES ('LE','25371251','Vera, Belén H.','Duis@Proin.net','1971-09-12','(859) 840-0534');
INSERT INTO clientes VALUES ('LE','26305204','Alarcón, Humberto X.','Donec@ut.ca','1971-10-20','(156) 762-2233');
INSERT INTO clientes VALUES ('LE','31409354','Jiménez, Evolet Z.','dolor.dolor.tempus@sagittissemperNam.net','1979-08-07','(808) 184-2114');
INSERT INTO clientes VALUES ('LE','36958970','Vega, Hernán X.','erat@augueeutempor.ca','1980-08-03','(245) 346-1167');
INSERT INTO clientes VALUES ('LE','38160623','Fernández, Jack P.','consectetuer@Cumsociisnatoque.net','1982-11-08','(503) 675-1395');
INSERT INTO clientes VALUES ('LE','39932623','González, Mariapaz G.','et.magnis.dis@amet.org','2000-09-14','(840) 182-6761');
INSERT INTO clientes VALUES ('LE','40282699','Ortega, Jostin N.','eu.tellus@at.net','1999-04-23','(777) 983-2614');
INSERT INTO clientes VALUES ('LE','41232143','Gallardo, María K.','semper@ornareelit.net','1970-10-21','(207) 189-3491');
INSERT INTO clientes VALUES ('LE','45499481','Muñoz, Federico Z.','aliquet@vitaediam.com','1972-08-06','(776) 975-5842');
INSERT INTO clientes VALUES ('LE','46845541','Sanhueza, Génesis H.','amet.lorem.semper@fringillacursus.ca','1972-06-11','(529) 637-9636');
INSERT INTO clientes VALUES ('LE','48123379','Ruiz, Ashly L.','sociosqu.ad@aliquameros.com','1978-04-16',NULL);
INSERT INTO clientes VALUES ('LE','49430198','Peña, Cristián Z.','fermentum.vel@auctornuncnulla.co.uk','1989-04-27','(436) 182-2421');
INSERT INTO clientes VALUES ('LE','50957888','Molina, Aitor B.','urna.Nunc@sapien.com','1984-04-16','(287) 774-9034');
INSERT INTO clientes VALUES ('LE','6134521','Vargas, Pía J.','dolor.sit@venenatisamagna.com','1975-07-27','(182) 252-4508');
INSERT INTO clientes VALUES ('LE','9563868','Sepúlveda, Danitza X.','malesuada@veliteget.org','1974-12-15','(791) 571-7313');
INSERT INTO clientes VALUES ('SOC','12367704','Espinoza, Dannae Z.','eleifend.vitae.erat@aliquetmetus.ca','1976-09-05','(762) 797-7626');
INSERT INTO clientes VALUES ('SOC','12377536','Farías, Antuan B.','egestas.Fusce@consectetueradipiscingelit.co.uk','2000-11-23','(713) 740-7041');
INSERT INTO clientes VALUES ('SOC','14399846','Castillo, Yanela J.','pretium.neque@Crasinterdum.co.uk','1989-10-17','(481) 303-1293');
INSERT INTO clientes VALUES ('SOC','16928728','Sandoval, Margarita U.','leo.Cras.vehicula@Sedeueros.co.uk','1988-03-01','(323) 146-9111');
INSERT INTO clientes VALUES ('SOC','21195555','López, Yeferson K.','nec.mollis@arcuSed.edu','2001-11-18','(320) 635-4886');
INSERT INTO clientes VALUES ('SOC','21433950','Farías, Giuseppe O.','arcu@idantedictum.org','1971-03-28','(447) 711-6480');
INSERT INTO clientes VALUES ('SOC','21498000','Bustamante, Florencia Z.','penatibus@Namligulaelit.co.uk','1998-04-21','(815) 659-0821');
INSERT INTO clientes VALUES ('SOC','25573065','Saavedra, Yahir A.','metus.facilisis@gravidasitamet.edu','1976-11-02','(831) 204-3852');
INSERT INTO clientes VALUES ('SOC','29454233','González, Moisés B.','arcu.Morbi@interdumCurabitur.net','1991-04-11','(896) 112-6746');
INSERT INTO clientes VALUES ('SOC','29520153','Valdés, Kasandra F.','Nunc.commodo.auctor@risus.net','1984-06-15','(543) 718-9652');
INSERT INTO clientes VALUES ('SOC','31812637','Leiva, Damian K.','id.ante.dictum@scelerisque.ca','1989-11-21','(261) 856-7749');
INSERT INTO clientes VALUES ('SOC','32220502','Valenzuela, Ander O.','massa.Vestibulum@sem.co.uk','1981-01-09','(100) 418-1074');
INSERT INTO clientes VALUES ('SOC','34343594','Romero, Giarella D.','est@molestieorcitincidunt.ca','1991-03-16','(339) 251-4901');
INSERT INTO clientes VALUES ('SOC','36299545','Navarro, Constanza W.','sed.orci@inlobortis.net','1997-11-09','(477) 630-5451');
INSERT INTO clientes VALUES ('SOC','36391682','Jara, Franco L.','egestas@gravidanonsollicitudin.edu','1976-02-08','(563) 837-9424');
INSERT INTO clientes VALUES ('SOC','37758768','Poblete, Marcia U.','enim.condimentum@arcu.net','1996-05-21','(773) 907-0341');
INSERT INTO clientes VALUES ('SOC','38696517','García, Ezequiel S.','ac.eleifend@pharetra.org','1976-07-01','(502) 442-8351');
INSERT INTO clientes VALUES ('SOC','40817502','Maldonado, Karen N.','sit.amet@est.co.uk','1982-06-21','(641) 861-0985');
INSERT INTO clientes VALUES ('SOC','45660228','Herrera, Colomba S.','lectus.rutrum.urna@vel.com','1987-10-14','(172) 566-2009');
INSERT INTO clientes VALUES ('SOC','7061412','Olivares, Maira U.','aliquam@arcuVestibulum.net','1983-12-08','(238) 886-8480');



DROP TABLE IF EXISTS frutas;

CREATE TABLE frutas (
  Descripcion varchar(100) DEFAULT NULL
);


INSERT INTO frutas VALUES ('Mazana');
INSERT INTO frutas VALUES ('Pera');
INSERT INTO frutas VALUES ('Kiwi');


DROP TABLE IF EXISTS parametros;

CREATE TABLE parametros (
  Id int(11) NOT NULL AUTO_INCREMENT,
  FechaActual int(11) DEFAULT NULL,
  PRIMARY KEY (Id)
);

INSERT INTO parametros VALUES (1,2020);


DROP TABLE IF EXISTS productos;

CREATE TABLE productos (
  ID int(11) NOT NULL,
  Descripcion varchar(255) NOT NULL,
  Precio double(19,4) NOT NULL,
  Cant int(11) DEFAULT NULL,
  FechaVencimiento timestamp NOT NULL DEFAULT current_timestamp(),
  Id_Categoria int(11) NOT NULL,
  PRIMARY KEY (ID)
) ;


INSERT INTO productos VALUES (1,'Acetaminofen',14.5700,40,'2018-08-15 15:09:22',4);
INSERT INTO productos VALUES (2,'Acetilcisteína',4.2900,4,'2020-05-25 03:08:51',3);
INSERT INTO productos VALUES (3,'Acetilsalicicato de Lisina',21.3800,50,'2019-03-15 13:54:19',5);
INSERT INTO productos VALUES (4,'Adrenalina',15.8700,27,'2018-09-01 02:44:19',4);
INSERT INTO productos VALUES (5,'Amiodarona',19.7500,43,'2019-02-18 19:48:02',3);
INSERT INTO productos VALUES (6,'ATP (Adenosina Triposfato)',18.6200,34,'2018-10-28 00:04:48',5);
INSERT INTO productos VALUES (7,'Atropina',18.7900,33,'2019-08-17 08:46:28',5);
INSERT INTO productos VALUES (8,'Bicarbonato Sódico',16.5800,73,'2019-11-24 12:16:32',1);
INSERT INTO productos VALUES (9,'Butilbromuro de Hioscina',5.0700,11,'2019-03-07 09:38:09',2);
INSERT INTO productos VALUES (10,'Cloruro Potásico',9.2400,30,'2018-08-18 08:52:48',5);
INSERT INTO productos VALUES (11,'Dexclorferinamina',14.2300,33,'2019-01-03 12:41:19',4);
INSERT INTO productos VALUES (12,'Diazepam',3.4800,13,'2019-11-20 13:47:03',1);
INSERT INTO productos VALUES (13,'Dobutamina',3.5800,26,'2019-01-12 02:31:37',4);
INSERT INTO productos VALUES (14,'Dopamina',9.4300,24,'2018-10-12 18:14:14',5);
INSERT INTO productos VALUES (15,'Enalaprilato',16.3800,51,'2018-08-28 07:32:47',5);
INSERT INTO productos VALUES (16,'Esmolol (Clorhidrato)',7.0300,18,'2019-03-16 01:43:48',5);
INSERT INTO productos VALUES (17,'Etomidato',0.3800,6,'2018-10-06 00:43:38',3);
INSERT INTO productos VALUES (18,'Fentanilo',11.5400,38,'2019-04-06 15:36:37',4);
INSERT INTO productos VALUES (19,'Flecainida (Acetato de)',17.6100,59,'2018-08-27 03:06:34',4);
INSERT INTO productos VALUES (20,'Furosemida',22.4400,69,'2018-09-12 08:53:23',5);
INSERT INTO productos VALUES (21,'Glucagón',6.3300,30,'2019-01-29 19:33:39',4);
INSERT INTO productos VALUES (22,'Glucosa',15.1000,29,'2018-09-19 05:55:43',4);
INSERT INTO productos VALUES (23,'Haloperidol',25.3600,31,'2018-10-27 13:35:24',4);
INSERT INTO productos VALUES (24,'Insulina Rápida',15.9000,36,'2018-10-01 13:21:45',5);
INSERT INTO productos VALUES (25,'Isoprotenerol',13.5100,47,'2018-08-25 01:50:36',5);
INSERT INTO productos VALUES (26,'Ketorolaco',4.5800,23,'2019-02-17 02:32:31',4);
INSERT INTO productos VALUES (27,'Lidocaina',5.5800,7,'2020-03-07 12:29:47',4);
INSERT INTO productos VALUES (28,'Metamizol Magnésico',6.0800,7,'2019-04-27 17:40:58',5);
INSERT INTO productos VALUES (29,'Metilprednisolona',22.1300,48,'2019-09-25 21:03:05',4);
INSERT INTO productos VALUES (30,'Metoclopramida',5.4700,15,'2019-11-24 06:53:15',5);
INSERT INTO productos VALUES (31,'Mivacurio (Cloruro de)',2.3000,30,'2019-01-22 14:03:33',2);
INSERT INTO productos VALUES (32,'Morfina',8.6200,32,'2020-01-10 04:07:14',3);
INSERT INTO productos VALUES (33,'Naloxona',15.3000,42,'2019-02-22 22:11:02',4);
INSERT INTO productos VALUES (34,'Nimodipino',1.2600,5,'2019-10-01 00:51:40',3);
INSERT INTO productos VALUES (35,'Nitroglicerina',7.1900,34,'2019-06-15 15:31:53',5);
INSERT INTO productos VALUES (36,'Nitropusiato Sódico',17.7900,60,'2019-11-06 03:54:19',5);
INSERT INTO productos VALUES (37,'Noradrenalina',17.0600,60,'2018-11-04 05:05:57',4);
INSERT INTO productos VALUES (38,'Omeprazol',7.7900,2,'2018-08-21 11:11:40',2);
INSERT INTO productos VALUES (39,'Propafenona',14.8400,23,'2019-04-10 04:26:37',4);
INSERT INTO productos VALUES (40,'Propofol',7.3000,1,'2019-02-11 04:37:15',5);
INSERT INTO productos VALUES (41,'Rocuronio (Bromuro de)',19.0100,49,'2019-10-10 23:13:33',5);
INSERT INTO productos VALUES (42,'Somatostatina',5.3100,4,'2019-04-29 10:55:26',1);
INSERT INTO productos VALUES (43,'Succinilcolina',0.9200,30,'2019-01-02 15:01:45',4);
INSERT INTO productos VALUES (44,'Sulfato de Magnesio',14.9600,41,'2019-02-09 02:10:21',5);
INSERT INTO productos VALUES (45,'Tiapride',10.6700,10,'2019-02-19 08:53:33',3);
INSERT INTO productos VALUES (46,'Tramadol (Clorhidrato)',6.6200,30,'2020-06-28 15:22:38',3);
INSERT INTO productos VALUES (47,'Valproato Sódico',4.1200,29,'2019-10-05 04:52:21',3);
INSERT INTO productos VALUES (48,'Verapamilo',4.9400,20,'2018-12-05 18:00:44',1);
INSERT INTO productos VALUES (49,'Verapamilo Sodico',4.9400,20,'2018-12-06 18:00:44',1);
INSERT INTO productos VALUES (50,'Verapamilo',15.5700,90,'2018-08-15 03:00:00',8);


DROP TABLE IF EXISTS vendedores;

CREATE TABLE vendedores (
  TipoDocumento char(3) NOT NULL DEFAULT 'DNI',
  Documento varchar(15) NOT NULL,
  RazonSocial varchar(100) NOT NULL,
  TipoDocumento_Sup char(3) NOT NULL,
  Documento_Sup varchar(15) NOT NULL,
  PRIMARY KEY (TipoDocumento,Documento)
) ;

INSERT INTO vendedores VALUES ('DNI','11772259','Jhonatan Aravena','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','17019242','Derek E. Aguilera','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','17218533','Cristiano Jiménez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','17379257','Jovany F. Álvarez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','17565679','Stefano38 Palma','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','19093998','Lenin Muñoz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','19284337','Catherine P. Fernández','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','19479442','Natalia L. Valenzuela','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','20573164','Mariela Tapia','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','21939776','Nataniel Farías','DNI','19479442');
INSERT INTO vendedores VALUES ('DNI','23279775','Nahiara Guerrero','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','23494718','Andrea H. Cárdenas','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','27356222','Gabriel Bustos','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','27645794','Deivi E. Navarrete','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','29324524','Deivi Vera','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','29551197','Tatiana I. Núñez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','29578278','Marian Díaz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','32391934','Maciel T. Garrido','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','33475274','Didier P. Bustos','DNI','19479442');
INSERT INTO vendedores VALUES ('DNI','34582306','Miguelangel P. Salinas','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','36089219','Oscar T. Díaz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','38972502','Maicol B. Hernández','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','41132219','Jesús J. Aravena','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','42877765','Arlette J. Zúñiga','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','43391794','Nabih Vidal','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','46246452','Lilian San Martín','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','46369897','Yolanda Vidal','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','48782025','Alina Z. Ruiz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','49525165','Santos Alvarado','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','5058220','Fiorella A. Leiva','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','5133430','Maríajosé Palma','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','6092528','Jonathan M. Castillo','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','8623665','Amir G. Gómez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','9431105','Norman Q. Olivares','DNI','19479442');
INSERT INTO vendedores VALUES ('DNI','10270221','Sol Y. Escobar','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','11210142','Leo P. Núñez','DNI','10270221');
INSERT INTO vendedores VALUES ('DNI','12022113','Madelyn Donoso','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','14590794','Pascale Figueroa','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','14606635','Paulette Gómez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','14845561','Franco V. Parra','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','16997612','Julia Flores','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','21360720','Escarleth S. Rojas','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','23149262','Basthian C. Rivera','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','23438758','Pierre Alvarado','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','25515032','Vincent Parra','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','28084864','Ronald X. Castro','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','28236872','Cristobal D. García','DNI','10270221');
INSERT INTO vendedores VALUES ('DNI','30751429','Alain Sánchez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','31391929','Lucero Díaz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','31841010','Brithany I. Rojas','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','32107811','Miley Ortiz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','32201248','Tiziano Alarcón','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','33788333','Jennifer R. Salazar','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','35367442','Eithan Sáez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','35383196','Adriano Venegas','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','40387810','Branko Fuentes','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','40442293','Ander V. Alvarado','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','42366394','Clemente Muñoz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','42910034','Jesus Orellana','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','44889380','Giuseppe Y. Ortega','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','45000133','Abner C. Reyes','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','47283409','Fernanda S. Farías','DNI','10270221');
INSERT INTO vendedores VALUES ('DNI','5456077','Martina Y. Moreno','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','5999195','Víctor Navarrete','DNI','10270221');
INSERT INTO vendedores VALUES ('DNI','7268261','Joshua P. Fernández','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','7683587','Zaira D. Vergara','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','9583197','Isabela Moreno','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','9791487','Rouse Díaz','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','9983864','Skarleth Silva','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','11894632','Caroline M. Escobar','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','12509674','Madelaine T. Gallardo','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','13637065','Dafnne N. Álvarez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','13926096','Jordano Pizarro','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','14345494','Franco Álvarez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','15085424','Josue Q. Toro','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','15425136','Simón Navarro','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','15623396','Jeyson D. Álvarez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','15972799','Yhan Donoso','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','16416950','Crescente M. Jiménez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','18596892','Liam Vidal','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','19490622','Gamaliel Z. Jara','DNI','7268261');
INSERT INTO vendedores VALUES ('DNI','27989243','Armando W. Medina','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','35029490','Arístides Castro','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','35033665','Isis Q. Molina','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','35170656','Anakin Álvarez','DNI','35033665');
INSERT INTO vendedores VALUES ('DNI','35435981','Leo B. Maldonado','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','36296339','Oliver C. Álvarez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','37105383','Úrsula Palma','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','39633109','Elena E. Jiménez','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','40794120','Jairo Farías','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','42816147','Trinidad Araya','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','43096464','Antonio P. Vega','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','44309648','Cynthia B. Maldonado','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','47136955','Avril K. Bustos','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','47385140','Vannia F. Sanhueza','DNI','35033665');
INSERT INTO vendedores VALUES ('DNI','48088609','Isabel Romero','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','5025888','Oliver A. Romero','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','6117939','Anyelina E. Leiva','DNI','42910034');
INSERT INTO vendedores VALUES ('DNI','8000339','Alen Núñez','DNI','5025888');
INSERT INTO vendedores VALUES ('DNI','9333160','Rocío Gómez','DNI','42910034');


DROP TABLE IF EXISTS ventas;

CREATE TABLE ventas (
  TipoDocumento char(3) NOT NULL,
  Documento varchar(15) NOT NULL,
  Fecha timestamp NOT NULL DEFAULT current_timestamp(),
  Monto double NOT NULL,
  KEY TipoDocumento (TipoDocumento,Documento),
  CONSTRAINT ventas_ibfk_1 FOREIGN KEY (TipoDocumento, Documento) REFERENCES vendedores (TipoDocumento, Documento)
) ;


INSERT INTO ventas VALUES ('DNI','23279775','2017-08-30 22:03:17',909.95);
INSERT INTO ventas VALUES ('DNI','23494718','2018-11-04 20:07:41',771.35);
INSERT INTO ventas VALUES ('DNI','27356222','2017-08-14 17:09:17',961.72);
INSERT INTO ventas VALUES ('DNI','10270221','2016-01-17 11:19:55',320.38);
INSERT INTO ventas VALUES ('DNI','11210142','2018-09-14 11:43:49',891.39);
INSERT INTO ventas VALUES ('DNI','12022113','2017-05-30 23:54:05',901.11);
INSERT INTO ventas VALUES ('DNI','14590794','2017-05-17 02:09:37',122.97);
INSERT INTO ventas VALUES ('DNI','14606635','2016-04-24 11:12:58',853.3);
INSERT INTO ventas VALUES ('DNI','14845561','2016-04-09 01:00:27',257.05);
INSERT INTO ventas VALUES ('DNI','16997612','2017-08-22 05:43:00',361.54);
INSERT INTO ventas VALUES ('DNI','11894632','2017-11-09 11:17:58',738.96);
INSERT INTO ventas VALUES ('DNI','12509674','2016-05-28 17:12:34',989.08);
INSERT INTO ventas VALUES ('DNI','13637065','2016-10-17 16:01:21',448.53);
INSERT INTO ventas VALUES ('DNI','13926096','2017-01-26 03:33:43',685.15);
INSERT INTO ventas VALUES ('DNI','14345494','2018-10-26 17:12:38',831.65);
INSERT INTO ventas VALUES ('DNI','15085424','2017-03-27 07:12:23',475);
INSERT INTO ventas VALUES ('DNI','15425136','2016-10-20 01:06:25',369.54);
INSERT INTO ventas VALUES ('DNI','15623396','2016-02-20 21:03:15',572.22);
INSERT INTO ventas VALUES ('DNI','15972799','2017-11-24 00:18:26',717.41);
INSERT INTO ventas VALUES ('DNI','23279775','2018-11-06 10:04:40',997.3);
INSERT INTO ventas VALUES ('DNI','23494718','2018-05-24 08:15:20',110.97);
INSERT INTO ventas VALUES ('DNI','27356222','2018-07-31 10:07:56',459.95);
INSERT INTO ventas VALUES ('DNI','10270221','2016-06-07 22:45:02',624.65);
INSERT INTO ventas VALUES ('DNI','11210142','2016-11-23 20:15:26',830.8);
INSERT INTO ventas VALUES ('DNI','12022113','2016-09-17 14:29:40',395.33);
INSERT INTO ventas VALUES ('DNI','14590794','2016-01-18 03:56:15',896.73);
INSERT INTO ventas VALUES ('DNI','14606635','2017-02-24 17:28:23',505.68);
INSERT INTO ventas VALUES ('DNI','14845561','2017-10-28 17:00:35',128.72);
INSERT INTO ventas VALUES ('DNI','16997612','2016-07-20 12:10:40',805.75);
INSERT INTO ventas VALUES ('DNI','11894632','2016-04-10 00:49:23',802.6);
INSERT INTO ventas VALUES ('DNI','12509674','2016-04-05 12:42:32',481.12);
INSERT INTO ventas VALUES ('DNI','13637065','2017-08-29 13:11:11',188.15);
INSERT INTO ventas VALUES ('DNI','13926096','2017-02-15 02:39:54',195.35);
INSERT INTO ventas VALUES ('DNI','14345494','2016-05-02 17:47:55',502.36);
INSERT INTO ventas VALUES ('DNI','15085424','2018-05-28 13:10:48',730.59);
INSERT INTO ventas VALUES ('DNI','15425136','2017-08-09 15:28:46',464.93);
INSERT INTO ventas VALUES ('DNI','15623396','2016-04-19 21:46:39',134.4);
INSERT INTO ventas VALUES ('DNI','15972799','2018-02-02 12:16:54',242.29);
INSERT INTO ventas VALUES ('DNI','23279775','2017-01-18 11:24:54',47.25);
INSERT INTO ventas VALUES ('DNI','23494718','2016-05-03 01:21:05',207.44);
INSERT INTO ventas VALUES ('DNI','27356222','2016-01-02 12:10:41',515.05);
INSERT INTO ventas VALUES ('DNI','10270221','2017-07-04 09:40:45',714.32);
INSERT INTO ventas VALUES ('DNI','11210142','2018-02-20 18:16:23',919.81);
INSERT INTO ventas VALUES ('DNI','12022113','2017-05-19 07:52:04',126.52);
INSERT INTO ventas VALUES ('DNI','14590794','2016-07-07 12:58:13',678.38);
INSERT INTO ventas VALUES ('DNI','14606635','2018-12-04 16:18:09',480.34);
INSERT INTO ventas VALUES ('DNI','14845561','2017-07-28 23:20:48',963.65);
INSERT INTO ventas VALUES ('DNI','16997612','2018-06-05 21:03:59',847.04);
INSERT INTO ventas VALUES ('DNI','11894632','2018-05-24 02:13:11',944.46);
INSERT INTO ventas VALUES ('DNI','12509674','2018-07-16 17:52:24',16.61);
INSERT INTO ventas VALUES ('DNI','13637065','2018-11-23 09:30:26',699.24);
INSERT INTO ventas VALUES ('DNI','13926096','2016-08-03 12:26:15',198.7);
INSERT INTO ventas VALUES ('DNI','14345494','2017-02-23 06:22:53',913.58);
INSERT INTO ventas VALUES ('DNI','15085424','2018-08-26 03:08:52',77.72);
INSERT INTO ventas VALUES ('DNI','15425136','2017-09-16 13:30:29',16.3);
INSERT INTO ventas VALUES ('DNI','15623396','2017-02-15 11:22:25',339.84);
INSERT INTO ventas VALUES ('DNI','15972799','2016-03-22 01:04:35',168.93);
INSERT INTO ventas VALUES ('DNI','23279775','2017-03-09 06:59:13',983.55);
INSERT INTO ventas VALUES ('DNI','23494718','2018-01-03 01:42:07',969.06);
INSERT INTO ventas VALUES ('DNI','27356222','2016-04-28 01:49:46',609.55);
INSERT INTO ventas VALUES ('DNI','10270221','2016-02-08 01:24:10',187.38);
INSERT INTO ventas VALUES ('DNI','11210142','2018-09-17 19:41:46',904.84);
INSERT INTO ventas VALUES ('DNI','12022113','2016-07-11 23:50:27',81.83);
INSERT INTO ventas VALUES ('DNI','14590794','2018-02-10 09:17:23',464.22);
INSERT INTO ventas VALUES ('DNI','14606635','2018-05-01 21:58:43',918.7);
INSERT INTO ventas VALUES ('DNI','14845561','2016-05-17 19:47:39',195.48);
INSERT INTO ventas VALUES ('DNI','16997612','2017-05-15 07:09:02',111.45);
INSERT INTO ventas VALUES ('DNI','11894632','2017-01-02 18:56:45',307.52);
INSERT INTO ventas VALUES ('DNI','12509674','2017-03-04 20:05:13',224.3);
INSERT INTO ventas VALUES ('DNI','13637065','2016-12-17 12:58:03',426.78);
INSERT INTO ventas VALUES ('DNI','13926096','2018-12-07 04:38:45',619.15);
INSERT INTO ventas VALUES ('DNI','14345494','2017-12-03 22:22:31',106.95);
INSERT INTO ventas VALUES ('DNI','15085424','2018-09-16 00:17:39',196.55);
INSERT INTO ventas VALUES ('DNI','15425136','2017-02-11 10:04:12',568.88);
INSERT INTO ventas VALUES ('DNI','15623396','2016-01-05 12:50:36',429.44);
INSERT INTO ventas VALUES ('DNI','15972799','2017-08-03 13:56:35',808.6);
INSERT INTO ventas VALUES ('DNI','23279775','2018-04-17 15:56:15',513.44);
INSERT INTO ventas VALUES ('DNI','23494718','2018-12-10 02:19:22',432.34);
INSERT INTO ventas VALUES ('DNI','27356222','2016-06-21 04:32:11',570.83);
INSERT INTO ventas VALUES ('DNI','10270221','2017-03-02 06:27:52',655.42);
INSERT INTO ventas VALUES ('DNI','11210142','2016-01-19 06:20:54',290.63);
INSERT INTO ventas VALUES ('DNI','12022113','2016-12-28 01:35:11',530.44);
INSERT INTO ventas VALUES ('DNI','14590794','2017-02-23 17:59:44',202.96);
INSERT INTO ventas VALUES ('DNI','14606635','2017-03-06 03:49:23',746.48);
INSERT INTO ventas VALUES ('DNI','14845561','2017-08-23 17:11:17',311.4);
INSERT INTO ventas VALUES ('DNI','16997612','2018-04-27 12:25:11',758.71);
INSERT INTO ventas VALUES ('DNI','11894632','2018-10-12 22:43:15',376.99);
INSERT INTO ventas VALUES ('DNI','12509674','2016-03-30 01:14:49',627.73);
INSERT INTO ventas VALUES ('DNI','13637065','2016-06-19 15:26:58',917.86);
INSERT INTO ventas VALUES ('DNI','13926096','2017-10-24 08:40:41',462.72);
INSERT INTO ventas VALUES ('DNI','14345494','2016-05-03 00:05:34',887.24);
INSERT INTO ventas VALUES ('DNI','15085424','2017-01-26 12:06:00',676.67);
INSERT INTO ventas VALUES ('DNI','15425136','2018-12-07 06:18:02',700.37);
INSERT INTO ventas VALUES ('DNI','15623396','2016-11-03 22:37:04',517.41);
INSERT INTO ventas VALUES ('DNI','15972799','2018-08-21 16:54:13',750.71);
INSERT INTO ventas VALUES ('DNI','23279775','2018-07-16 16:58:57',502.25);
INSERT INTO ventas VALUES ('DNI','23494718','2017-12-20 21:36:57',808.1);
INSERT INTO ventas VALUES ('DNI','27356222','2016-04-26 03:39:01',175.84);
INSERT INTO ventas VALUES ('DNI','10270221','2018-08-23 10:52:01',285.88);
INSERT INTO ventas VALUES ('DNI','11210142','2016-02-09 19:50:01',812.97);
INSERT INTO ventas VALUES ('DNI','12022113','2019-02-04 14:44:35',215.67);
INSERT INTO ventas VALUES ('DNI','14590794','2020-08-20 05:10:45',435.37);
INSERT INTO ventas VALUES ('DNI','14606635','2020-03-02 02:56:34',661.65);
INSERT INTO ventas VALUES ('DNI','14845561','2019-05-12 15:09:39',708.76);
INSERT INTO ventas VALUES ('DNI','16997612','2020-12-28 12:10:17',188.66);
INSERT INTO ventas VALUES ('DNI','11894632','2020-05-28 07:23:16',825.01);
INSERT INTO ventas VALUES ('DNI','12509674','2020-07-24 10:00:59',105.38);
INSERT INTO ventas VALUES ('DNI','13637065','2019-04-05 13:43:18',600.15);
INSERT INTO ventas VALUES ('DNI','13926096','2020-07-05 08:10:22',334.62);
INSERT INTO ventas VALUES ('DNI','14345494','2020-04-16 04:37:35',415.8);
INSERT INTO ventas VALUES ('DNI','15085424','2019-07-07 09:57:06',595.35);
INSERT INTO ventas VALUES ('DNI','15425136','2020-08-07 05:03:12',610.96);
INSERT INTO ventas VALUES ('DNI','15623396','2020-09-09 02:35:10',356.51);
INSERT INTO ventas VALUES ('DNI','15972799','2020-11-25 04:45:48',790.8);
INSERT INTO ventas VALUES ('DNI','23279775','2019-12-28 11:59:48',9.59);
INSERT INTO ventas VALUES ('DNI','23494718','2020-10-09 20:42:49',759.42);
INSERT INTO ventas VALUES ('DNI','27356222','2019-04-26 06:18:33',2.32);
INSERT INTO ventas VALUES ('DNI','10270221','2019-11-27 08:57:14',377.92);
INSERT INTO ventas VALUES ('DNI','11210142','2019-10-23 05:10:32',883.74);
INSERT INTO ventas VALUES ('DNI','12022113','2020-03-29 10:13:51',340.63);
INSERT INTO ventas VALUES ('DNI','14590794','2020-07-02 15:45:50',337.88);
INSERT INTO ventas VALUES ('DNI','14606635','2020-03-02 06:23:34',176.17);
INSERT INTO ventas VALUES ('DNI','14845561','2020-01-09 17:40:04',553.36);
INSERT INTO ventas VALUES ('DNI','16997612','2020-02-16 03:05:07',925.43);
INSERT INTO ventas VALUES ('DNI','11894632','2019-10-19 05:29:50',354.73);
INSERT INTO ventas VALUES ('DNI','12509674','2019-10-31 13:47:36',938.79);
INSERT INTO ventas VALUES ('DNI','13637065','2019-12-18 02:31:04',94.4);
INSERT INTO ventas VALUES ('DNI','13926096','2019-08-10 16:52:33',782.25);
INSERT INTO ventas VALUES ('DNI','14345494','2019-08-26 10:18:25',205.06);
INSERT INTO ventas VALUES ('DNI','15085424','2020-04-01 07:12:47',781.53);
INSERT INTO ventas VALUES ('DNI','15425136','2020-09-03 16:11:48',947.83);
INSERT INTO ventas VALUES ('DNI','15623396','2019-07-26 03:49:00',671.75);
INSERT INTO ventas VALUES ('DNI','15972799','2019-03-27 13:35:33',939.78);
INSERT INTO ventas VALUES ('DNI','23279775','2019-01-02 08:22:23',809.35);
INSERT INTO ventas VALUES ('DNI','23494718','2019-09-07 14:23:00',690.28);
INSERT INTO ventas VALUES ('DNI','27356222','2019-12-28 09:07:56',122.9);
INSERT INTO ventas VALUES ('DNI','10270221','2019-08-06 06:36:41',572.06);
INSERT INTO ventas VALUES ('DNI','11210142','2019-01-21 00:42:15',182.99);
INSERT INTO ventas VALUES ('DNI','12022113','2019-01-19 09:24:36',123.28);
INSERT INTO ventas VALUES ('DNI','14590794','2019-07-29 23:07:50',349);
INSERT INTO ventas VALUES ('DNI','14606635','2019-10-28 17:29:49',640.62);
INSERT INTO ventas VALUES ('DNI','14845561','2019-09-30 14:18:25',642.93);
INSERT INTO ventas VALUES ('DNI','16997612','2020-09-16 16:26:28',613.3);
INSERT INTO ventas VALUES ('DNI','11894632','2020-01-04 08:00:14',584.63);
INSERT INTO ventas VALUES ('DNI','12509674','2020-06-05 23:44:18',209.17);
INSERT INTO ventas VALUES ('DNI','13637065','2019-08-04 16:23:50',310.81);
INSERT INTO ventas VALUES ('DNI','13926096','2020-12-08 11:32:23',861.39);
INSERT INTO ventas VALUES ('DNI','14345494','2019-10-08 20:52:34',740.43);
INSERT INTO ventas VALUES ('DNI','15085424','2019-12-24 04:15:43',10.15);
INSERT INTO ventas VALUES ('DNI','15425136','2020-07-25 09:49:27',115.72);
INSERT INTO ventas VALUES ('DNI','15623396','2020-04-24 06:02:49',130.2);
INSERT INTO ventas VALUES ('DNI','15972799','2019-11-17 20:46:37',394.84);
INSERT INTO ventas VALUES ('DNI','23279775','2019-07-05 23:50:11',561);
INSERT INTO ventas VALUES ('DNI','23494718','2020-08-22 12:42:29',370.36);
INSERT INTO ventas VALUES ('DNI','27356222','2019-11-30 19:10:03',626.16);
INSERT INTO ventas VALUES ('DNI','10270221','2019-08-08 03:38:57',623.26);
INSERT INTO ventas VALUES ('DNI','11210142','2020-06-15 02:05:32',150.29);
INSERT INTO ventas VALUES ('DNI','12022113','2019-01-14 03:05:52',71.76);
INSERT INTO ventas VALUES ('DNI','14590794','2019-08-06 17:28:21',690.07);
INSERT INTO ventas VALUES ('DNI','14606635','2020-03-21 11:50:08',610.1);
INSERT INTO ventas VALUES ('DNI','14845561','2019-02-10 18:05:12',802.92);
INSERT INTO ventas VALUES ('DNI','16997612','2019-12-21 16:00:37',279.43);
INSERT INTO ventas VALUES ('DNI','11894632','2019-02-23 22:14:57',331.06);
INSERT INTO ventas VALUES ('DNI','12509674','2019-01-31 01:11:44',605.45);
INSERT INTO ventas VALUES ('DNI','13637065','2020-09-15 23:37:06',397.33);
INSERT INTO ventas VALUES ('DNI','13926096','2020-09-20 07:15:22',11.34);
INSERT INTO ventas VALUES ('DNI','14345494','2020-10-12 05:25:25',648.69);
INSERT INTO ventas VALUES ('DNI','15085424','2020-05-16 20:02:39',251.27);
INSERT INTO ventas VALUES ('DNI','15425136','2019-07-25 02:20:40',119.52);
INSERT INTO ventas VALUES ('DNI','15623396','2019-07-10 08:57:52',576.77);
INSERT INTO ventas VALUES ('DNI','15972799','2020-05-08 23:56:14',697.32);
INSERT INTO ventas VALUES ('DNI','23279775','2020-10-20 18:26:13',166.32);
INSERT INTO ventas VALUES ('DNI','23494718','2019-01-21 18:51:44',177.16);
INSERT INTO ventas VALUES ('DNI','27356222','2020-10-09 01:38:37',578.66);
INSERT INTO ventas VALUES ('DNI','10270221','2020-04-23 05:52:50',77.11);
INSERT INTO ventas VALUES ('DNI','11210142','2019-09-15 22:10:12',792.18);
INSERT INTO ventas VALUES ('DNI','12022113','2020-02-01 23:45:01',189.09);
INSERT INTO ventas VALUES ('DNI','14590794','2019-04-30 03:35:08',175.12);
INSERT INTO ventas VALUES ('DNI','14606635','2019-09-26 11:13:31',423.67);
INSERT INTO ventas VALUES ('DNI','14845561','2020-10-03 22:33:49',118.37);
INSERT INTO ventas VALUES ('DNI','16997612','2019-09-25 18:08:49',175.03);
INSERT INTO ventas VALUES ('DNI','11894632','2019-11-01 21:52:22',351.81);
INSERT INTO ventas VALUES ('DNI','12509674','2019-04-19 02:39:42',175.42);
INSERT INTO ventas VALUES ('DNI','13637065','2019-05-27 23:16:24',407.13);
INSERT INTO ventas VALUES ('DNI','13926096','2020-10-05 03:58:07',331.89);
INSERT INTO ventas VALUES ('DNI','14345494','2020-07-28 13:07:36',227.31);
INSERT INTO ventas VALUES ('DNI','15085424','2019-07-31 09:28:34',839.28);
INSERT INTO ventas VALUES ('DNI','15425136','2020-06-11 16:06:00',636.74);
INSERT INTO ventas VALUES ('DNI','15623396','2020-09-08 11:11:43',5.63);
INSERT INTO ventas VALUES ('DNI','15972799','2019-11-08 17:17:46',839.44);
INSERT INTO ventas VALUES ('DNI','23279775','2019-01-11 04:37:48',509.59);
INSERT INTO ventas VALUES ('DNI','23494718','2020-07-08 23:40:24',758.83);
INSERT INTO ventas VALUES ('DNI','27356222','2020-10-03 16:00:09',682.04);
INSERT INTO ventas VALUES ('DNI','10270221','2020-01-28 10:30:22',17.59);
INSERT INTO ventas VALUES ('DNI','11210142','2020-05-27 04:32:43',229.95);
INSERT INTO ventas VALUES ('DNI','12022113','2020-10-30 00:45:29',287.03);
INSERT INTO ventas VALUES ('DNI','14590794','2020-01-18 04:48:05',693.28);
INSERT INTO ventas VALUES ('DNI','14606635','2020-02-01 11:19:15',19.86);
INSERT INTO ventas VALUES ('DNI','14845561','2019-07-10 06:25:10',621.6);
INSERT INTO ventas VALUES ('DNI','16997612','2019-11-25 17:21:13',147.92);


DROP TABLE IF EXISTS verduras;

CREATE TABLE verduras (
  Descripcion varchar(100) DEFAULT NULL
);

INSERT INTO verduras VALUES ('Papa');
INSERT INTO verduras VALUES ('Zanahoria');
INSERT INTO verduras VALUES ('Zapallo');

