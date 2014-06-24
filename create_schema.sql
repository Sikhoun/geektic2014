drop table INTERET if exists cascade;
drop table GEEK if exists cascade;
drop table GEEKINTERET if exists cascade;

CREATE TABLE INTERET(
	id INT NOT NULL PRIMARY KEY,
 	Programmation VARCHAR(100)
);

CREATE TABLE GEEK (
	id INT NOT NULL PRIMARY KEY,
 	Nom VARCHAR(255),
	Prenom VARCHAR(255),
	Sexe VARCHAR(255),
	Age INT
);


CREATE TABLE GEEKINTERET (
	id_interet INTEGER NOT NULL,
 	id_geek INTEGER NOT NULL,
	PRIMARY KEY(id_interet , id_geek),
	FOREIGN KEY (id_interet) REFERENCES PUBLIC.INTERET (ID),
	FOREIGN KEY (id_geek) REFERENCES PUBLIC.GEEK (ID)
);


INSERT INTO GEEK values ('1','TOTO','JOSEPH','HOMME','25')
INSERT INTO GEEK values ('2','TOTO','ALBERT','HOMME','30')
INSERT INTO GEEK values ('3','TOTO','MAURICE','HOMME','25')
INSERT INTO GEEK values ('4','TOTO','ORIANE','FEMME','19')

