package com.admin.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries(@NamedQuery(name = "Curso.getAll", query = "SELECT c FROM Curso c"))
public class Curso implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int codigo_curso;
    @Column
    private String nombre_curso;
    @Column
    private int creditos;
    @Column
    private int semestre;
    @Column
    private int numero_estudiantes;

    public Curso(int codigo_curso, String nombre_curso, int creditos, int semestre, int numero_estudiantes) {
        this.codigo_curso = codigo_curso;
        this.nombre_curso = nombre_curso;
        this.creditos = creditos;
        this.semestre = semestre;
        this.numero_estudiantes = numero_estudiantes;
    }

    public Curso() {
    }

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(int codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumero_estudiantes() {
        return numero_estudiantes;
    }

    public void setNumero_estudiantes(int numero_estudiantes) {
        this.numero_estudiantes = numero_estudiantes;
    }
    
    
    
}
