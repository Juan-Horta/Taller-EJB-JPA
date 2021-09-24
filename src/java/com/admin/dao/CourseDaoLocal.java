/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.dao;

import com.admin.model.Curso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pc
 */
@Local
public interface CourseDaoLocal {
    
    void addCurso(Curso curso);

    void editCurso(Curso curso);

    void deleteCurso(int codigoCurso);

    Curso getCurso(int codigoCurso);

    List<Curso> getAllCurso();
}
