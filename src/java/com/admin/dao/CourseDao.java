/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.dao;

import com.admin.model.Curso;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pc
 */
@Stateless
public class CourseDao implements CourseDaoLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addCurso(Curso curso) {
        em.persist(curso);
    }

    @Override
    public void deleteCurso(int codigoCurso) {
        em.remove(getCurso(codigoCurso));
    }

   
    @Override
    public List<Curso> getAllCurso() {
        return em.createNamedQuery("Curso.getAll").getResultList();
    }

    @Override
    public void editCurso(Curso curso) {
       em.merge(curso);
    }

    @Override
    public Curso getCurso(int codigoCurso) {
       return em.find(Curso.class, codigoCurso);
    }
}
