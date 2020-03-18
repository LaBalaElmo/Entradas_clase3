use cuarentena;
INSERT INTO Persona 
VALUES (8301163, 'Paul', 'Landaeta Flores', '1991-03-25'),
(5142356, 'Clara', 'Mamani', '1900-06-10'),
(8952145, 'Jose', 'Choque', '2015-09-30'),
(7824569, 'Leo', 'Choquevolketa', '2000-01-31'),
(2587469, 'Carmen', 'Gimenez', '1985-05-16');

       
insert into Consultorio 
 values   (3, 1,301),
 (1, 1,102),
 (2, 1,101),
 (4, 1,304),
 (6, 1,306);

insert into Paciente
values (0,8301163,'2020-03-17'),
(0,5142356,'2020-03-15'),
(0,8952145,'2020-03-10'),
(0,7824569,'2020-03-01'),
(0,2587469,'2020-03-04');
          
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
values  (1821,8301663,5,1),
		(2541,8301663,3,2),
		(8744,8952145,2,3),
		(5963,2587469,6,4),
        (5214,5142356,5,88);
        


INSERT INTO Consulta
VALUES  (1,1821,'2020-02-02'),
		(2,2541,'2020-02-06'),
        (2,8744,'2020-02-15'),
        (1,5963,'2020-02-21'),
        (5,8744,'2020-02-24');



select * from consulta;
select *  from especialidad;