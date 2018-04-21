CREATE DATABASE cine_ingeneo;

use cine_ingeneo;


CREATE TABLE ciudades
(
id_ciudad INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nom_ciudad VARCHAR(40) NOT NULL
);

INSERT INTO ciudades ( nom_ciudad) VALUES ('Cartagena');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Medellin');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Monteria');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Bogota');
INSERT INTO ciudades ( nom_ciudad) VALUES ('Santa Marta');

CREATE TABLE sucursales
(
id_sucursal INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nom_sucursa  VARCHAR(50) NOT NULL,
dir_sucursal VARCHAR(50) NOT NULL,
admin_sucursal VARCHAR(50) NOT NULL,
id_ciudad INT UNSIGNED,
FOREIGN KEY (id_ciudad) REFERENCES ciudades(id_ciudad)
);

INSERT INTO sucursales (
nom_sucursa,
dir_sucursal,
admin_sucursal,
id_ciudad)
 VALUES ('Cinema Medellin','Poblado CR85 -24','Pedro Hincapie',2);

 CREATE TABLE tipos_salas
(
id_tipo_sala INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
tipo_sala VARCHAR(50) NOT NULL
);

INSERT INTO tipos_salas (tipo_sala) VALUES ('2D');
INSERT INTO tipos_salas (tipo_sala) VALUES ('3D');
INSERT INTO tipos_salas (tipo_sala) VALUES ('Dynamix');

CREATE TABLE config_cinema
(
id_config INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
clave VARCHAR(50) NOT NULL,
valor VARCHAR(50) NOT NULL
);

INSERT INTO config_cinema (clave, valor) VALUES ('MAX_FILA', '27');
INSERT INTO config_cinema (clave, valor) VALUES ('MIN_FILA', '3');
INSERT INTO config_cinema (clave, valor) VALUES ('MAX_SILLA_FILA', '10');
INSERT INTO config_cinema (clave, valor) VALUES ('MIN_SILLA_FILA', '3');


CREATE TABLE salas_sucursal
(
id_sala INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
id_sucursal INT UNSIGNED,
id_tipo_sala  INT UNSIGNED,
num_fila INT UNSIGNED,
num_silla_fila INT UNSIGNED,
FOREIGN KEY (id_sucursal) REFERENCES sucursales(id_sucursal),
FOREIGN KEY (id_tipo_sala) REFERENCES tipos_salas(id_tipo_sala)
);

INSERT INTO salas_sucursal (
	id_sucursal,
	id_tipo_sala,
	num_fila,
	num_silla_fila) 
VALUES (1,3, 10,3);



CREATE TABLE disp_salas
(
id_sala INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
ubicacion  VARCHAR(25) NOT NULL,
estado VARCHAR(1) NOT NULL,
fecha VARCHAR(25) NULL,
dia_cerrado VARCHAR(1) NULL,
FOREIGN KEY (id_sala) REFERENCES salas_sucursal(id_sala)
);