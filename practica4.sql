use bookstore;

select usuario, nombre from empleado
inner join usuario on usuario.idempleado = empleado.idempleado;

select email as correo from empleado
inner join usuario on usuario.idempleado = empleado.idempleado && activo = 1;

select count(autor) from publicacion
where autor = 'Eric G. Coronel Castillo';

select sum(total) from venta
inner join empleado on empleado.idempleado = venta.idempleado && empleado.nombre = 'EMILIO'