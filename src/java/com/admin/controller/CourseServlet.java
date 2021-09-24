/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.controller;

import com.admin.dao.CourseDaoLocal;
import com.admin.model.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name = "CourseServlet", urlPatterns = {"/CourseServlet"})
public class CourseServlet extends HttpServlet {

    @EJB
    private CourseDaoLocal courseDao;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        String codigoStr = request.getParameter("codigo");
        int codigo_curso = 0;
        if (codigoStr != null && !codigoStr.equals("")) {
            codigo_curso = Integer.valueOf(codigoStr);
        }
        
        String nombre_curso = request.getParameter("nombre");
        
        String creditosStr = request.getParameter("creditos");
        int creditos = 0;
        if (creditosStr != null && !creditosStr.equals("")) {
            creditos = Integer.valueOf(creditosStr);
        }
        
        String semestreStr = request.getParameter("semestre");
        int semestre = 0;
        if (semestreStr != null && !semestreStr.equals("")) {
            semestre = Integer.valueOf(semestreStr);
        }
        
        String estudiantesStr = request.getParameter("estudiantes");
        int numero_estudiantes = 0;
        if (estudiantesStr != null && !estudiantesStr.equals("")) {
            numero_estudiantes = Integer.valueOf(estudiantesStr);
        }
        
        Curso curso = new Curso(codigo_curso, nombre_curso, creditos, semestre, numero_estudiantes);

        if ("Add".equalsIgnoreCase(action)) {
            courseDao.addCurso(curso);
        } else if ("Edit".equalsIgnoreCase(action)) {
            courseDao.editCurso(curso);
        } else if ("Delete".equalsIgnoreCase(action)) {
            courseDao.deleteCurso(codigo_curso);
        } else if ("Search".equalsIgnoreCase(action)) {
            courseDao.getCurso(codigo_curso);
        }
        request.setAttribute("curso", curso);
        request.setAttribute("AllCourse", courseDao.getAllCurso());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
