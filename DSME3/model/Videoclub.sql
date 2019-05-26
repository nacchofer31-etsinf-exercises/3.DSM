CREATE DATABASE Videoclub;


CREATE TABLE Persona

(
	ID_Persona int PRIMARY KEY
,
	nombre varchar(20) NOT NULL
,
	dni varchar(20) NOT NULL

);


CREATE TABLE Empleado

(
	ID_Empleado int PRIMARY KEY
,
	puesto int NOT NULL
,
	id_fk_Persona int NOT NULL

,
	CONSTRAINT FK_de_Empleado_a_Persona FOREIGN KEY (id_fk_Persona) REFERENCES Persona(ID_Persona)
);


CREATE TABLE Cliente

(
	ID_Cliente int PRIMARY KEY
,
	id_socio int NOT NULL
,
	id_fk_Persona int NOT NULL

,
	CONSTRAINT FK_de_Cliente_a_Persona FOREIGN KEY (id_fk_Persona) REFERENCES Persona(ID_Persona)
);


CREATE TABLE Alquiler

(
	ID_Alquiler int PRIMARY KEY
,
	id int NOT NULL

);


CREATE TABLE Alquila

(
	ID_Alquila int PRIMARY KEY
,
	id varchar(20) NOT NULL
,
	importe real NOT NULL
,
	concepto varchar(20) NOT NULL
,
	fecha varchar(20) NOT NULL
,
	ID_FK_origen_Se_alquila int NOT NULL
,
	ID_FK_destino_Se_alquila int NOT NULL

,
	CONSTRAINT FK_de_Alquila_a_origen_Se_alquila FOREIGN KEY (ID_FK_origen_Se_alquila) REFERENCES Alquiler(ID_Alquiler)
,
	CONSTRAINT FK_de_Alquila_a_destino_Se_alquila FOREIGN KEY (ID_FK_destino_Se_alquila) REFERENCES Cliente(ID_Cliente)
);


CREATE TABLE Grabacion

(
	ID_Grabacion int PRIMARY KEY
,
	nombre varchar(20) NOT NULL
,
	ID_FK_origen_almacena int NOT NULL
,
	ID_FK_destino_contiene int NOT NULL

,
	CONSTRAINT FK_de_destino_almacena_a_origen_almacena FOREIGN KEY (ID_FK_origen_almacena) REFERENCES Tienda(ID_Tienda)
,
	CONSTRAINT FK_de_origen_contiene_a_destino_contiene FOREIGN KEY (ID_FK_destino_contiene) REFERENCES Alquiler(ID_Alquiler)
);


CREATE TABLE DVD

(
	ID_DVD int PRIMARY KEY
,
	num_serie varchar(20) NOT NULL
,
	id_fk_Grabacion int NOT NULL

,
	CONSTRAINT FK_de_DVD_a_Grabacion FOREIGN KEY (id_fk_Grabacion) REFERENCES Grabacion(ID_Grabacion)
);


CREATE TABLE VHS

(
	ID_VHS int PRIMARY KEY
,
	fabricante varchar(20) NOT NULL
,
	id_fk_Grabacion int NOT NULL

,
	CONSTRAINT FK_de_VHS_a_Grabacion FOREIGN KEY (id_fk_Grabacion) REFERENCES Grabacion(ID_Grabacion)
);


CREATE TABLE Blu-Ray

(
	ID_Blu-Ray int PRIMARY KEY
,
	id varchar(20) NOT NULL
,
	id_fk_Grabacion int NOT NULL

,
	CONSTRAINT FK_de_Blu-Ray_a_Grabacion FOREIGN KEY (id_fk_Grabacion) REFERENCES Grabacion(ID_Grabacion)
);


CREATE TABLE Tienda

(
	ID_Tienda int PRIMARY KEY
,
	id int NOT NULL
,
	nombre varchar(20) NOT NULL

);


CREATE TABLE Pelicula

(
	ID_Pelicula int PRIMARY KEY
,
	id int NOT NULL
,
	nombre varchar(20) NOT NULL
,
	ID_FK_origen_grabacion int NOT NULL

,
	CONSTRAINT FK_de_destino_grabacion_a_origen_grabacion FOREIGN KEY (ID_FK_origen_grabacion) REFERENCES Grabacion(ID_Grabacion)
);

