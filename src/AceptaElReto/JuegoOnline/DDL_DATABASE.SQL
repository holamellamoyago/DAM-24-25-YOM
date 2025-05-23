
drop table if exists `PARTIDA_USER`;
drop table if exists `PARTIDA`;
drop table if exists `USER`;



create table USER(
    ID INT AUTO_INCREMENT,
    NOMBRE VARCHAR(30),
    CONTRASENHA VARCHAR(250),
    PARTIDAS_GANADAS INT DEFAULT 0,
    
    CONSTRAINT PK_USER PRIMARY KEY (ID)
);


create table PARTIDA(
    ID INT AUTO_INCREMENT,
    NOMBRE VARCHAR(30),
    TURNO_JUGADOR INT,
    CONTRASENHA VARCHAR(250),
    
    CONSTRAINT PK_PARTIDA PRIMARY KEY (ID),
    CONSTRAINT UQ_NOMBRE    UNIQUE(NOMBRE)
);

CREATE TABLE PARTIDA_USER(
    ID_USER INT,
    ID_PARTIDA INT ,
    DESCRIPCION VARCHAR(50),
    
    CONSTRAINT PK_PARTIDA_USER PRIMARY KEY (ID_USER, ID_PARTIDA),
    CONSTRAINT FK_PARTIDA_USER FOREIGN KEY (ID_USER) REFERENCES USER(ID),
    CONSTRAINT FK_PARTIDA_PARTIDA FOREIGN KEY (ID_PARTIDA) REFERENCES PARTIDA(ID)
    
    
);