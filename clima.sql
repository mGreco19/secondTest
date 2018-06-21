CREATE DATABASE Clima;

use Clima;
create table Pronostico (
  mes integer,
  dia integer,
  periodo varchar(20), /* Resumen | Mañana | Tarde | Noche */
  estado integer, /* 1=Soleado | 2=Nublado | 3=Lluvioso */
  descripcion varchar(40),
  minima integer, /* temperatura minima */
  maxima integer, /* temperatura maxima */
  llovera integer, /* probabilidad de lluvia (%) */
  Primary Key (mes,dia,periodo)  
);

insert into Pronostico values (06,01,"Resumen", 1,"Despejado todo el día",18,25,30);
insert into Pronostico values (06,01, "Mañana", 1, "Despejado",18,22,10);
insert into Pronostico values (06,01,"Tarde",1,"Despejado",22,25,10);

insert into Pronostico values (06,02, "Resumen",2, "Nublado con probabilidad de aguaceros",20,28,70);
insert into Pronostico values (06,02,"Mañana",2, "Parcialmente nublado",20,25,10);
insert into Pronostico values (06,02,"Tarde",3, "Lluvioso",24,25,90);

insert into Pronostico values (06,03,"Resumen",2,"Parcialmente nublado",19,26,30);
insert into Pronostico values (06,03,"Mañana", 1,"Despejado",19,23,10);
insert into Pronostico values (06,03,"Tarde", 2,"Nublado",23,26,10);
