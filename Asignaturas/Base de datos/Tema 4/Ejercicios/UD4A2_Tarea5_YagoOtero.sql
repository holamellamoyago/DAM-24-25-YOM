IF DB_ID('DB_Ejemplo6') IS NOT NULL
BEGIN
    DROP DATABASE DB_Ejemplo6
END
CREATE DATABASE DB_Ejemplo6
ON PRIMARY
(    NAME='DB_Ejemplo6_dat',
    filename='C:\basedatos\DB_Ejemplo6\DB_Ejemplo6dat.mdf',
    SIZE=10240KB,
    MAXSIZE=31457280KB,
    FILEGROWTH=15%
),
(    NAME='DB_Ejemplo61_dat',
    filename='C:\basedatos\DB_Ejemplo6\DB_Ejemplo6dat1.ndf',
    SIZE=5120KB,
    MAXSIZE=25600KB,
    FILEGROWTH=5120KB
),
FILEGROUP Grupo1DB_Ejemplo6
(    NAME='DB_Ejemplo6_dat2',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat2.ndf',
    SIZE=20480KB,
    MAXSIZE=51200KB,
    FILEGROWTH=5120KB
),
(    NAME='DB_Ejemplo6_dat3',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat3.ndf',
    SIZE=10240KB,
    MAXSIZE=51200KB,
    FILEGROWTH=192KB
),
FILEGROUP Grupo2DB_Ejemplo6
(    NAME='DB_Ejemplo6_dat4',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat4.ndf',
    SIZE=10240KB,
    MAXSIZE=51200KB,
    FILEGROWTH=18%
),
(    NAME='DB_Ejemplo6_dat5',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat5.ndf',
    SIZE=10240KB,
    FILEGROWTH=128KB
),
FILEGROUP Grupo3DB_Ejemplo6
(    NAME='DB_Ejemplo6_dat6',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat6.ndf',
    SIZE=10240KB,
    MAXSIZE=51200KB,
    FILEGROWTH=25%
),
(    NAME='DB_Ejemplo6_dat7',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat7.ndf',
    SIZE=20480KB,
    FILEGROWTH=192KB
),
(    NAME='DB_Ejemplo6_dat8',
    filename='C:\basedatos\DB_Ejemplo6\DB_EjemploDat8.ndf',
    SIZE=20480KB,
    FILEGROWTH=1024KB
);
