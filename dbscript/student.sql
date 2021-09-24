CREATE TABLE student(
firstname varchar(20),
lastname varchar(10),
yearlevel varchar (20),
studentid integer NOT NULL PRIMARY KEY
);

CREATE TABLE curso(
codigo_curso integer  NOT NULL PRIMARY KEY,
nombre_curso varchar(10),
creditos integer,
semestre integer,
numero_estudiantes integer
);

CREATE TABLE curso_student(
studentid integer,
codigo_curso integer,
 FOREIGN KEY(studentid) REFERENCES  student(studentid),
 FOREIGN KEY(codigo_curso) REFERENCES curso (codigo_curso)
);

