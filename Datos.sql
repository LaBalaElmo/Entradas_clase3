use cuarentena;
INSERT INTO Persona 
VALUES (8301163, 'Paul', 'Landaeta Flores', '1991-03-25');

INSERT INTO Persona 
VALUES (8301663, 'Laura', 'Lance', '1990-03-30');

       
insert into Consultorio 
 values   (3, 1,301),
 (1, 1,102),
 (2, 1,101),
 (4, 1,304),
 (6, 1,306);

insert into Paciente
values (0,8301163,'2020-03-17');

insert into Consultorio 
 values   (0, 1,303),
		  (4, 1,304);
          
INSERT INTO Especialidad

VALUES 	(1,'oftalmologia'),
		(2,'pediatria'),
		(3,'traumatologia'),
		(4,'cardiologia'),
		(5,'cirujano'),
		(45,'pediatria'),
		(87,'endocrinologia'),
		(88,'Oncologia'),
		(89,'Neurosquiatria');
       
INSERT INTO Doctor
values (1821,8301663,5,1),
		(2541,8301663,3,2),
		(8744,8301663,2,3),
		(5963,8301663,6,4);
        


INSERT INTO Consulta
VALUES  (1,1821,'2020-02-02'),
		(2,2541,'2020-02-06'),
        (2,8744,'2020-02-15'),
        (1,5963,'2020-02-21');



select * from consulta;
select *  from especialidad;