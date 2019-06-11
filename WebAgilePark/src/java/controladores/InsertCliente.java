/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelos.InsertarEm;


/**
 *
 * @author ASUS
 */






public class InsertCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        
        
        String Nom_E = request.getParameter("nom-e");
        String Ape_E = request.getParameter("ape-e");
        String TipoDoc_E = request.getParameter("tipodoc-e");
        String Doc_E = request.getParameter("doc-e");
        String Depa_E = request.getParameter("depa-e");
        String Placa_E = request.getParameter("placa-e");
        
        
        InsertarEm co = new InsertarEm();
        
        if(co.Insercion( Nom_E, Ape_E, TipoDoc_E, Doc_E, Depa_E, Placa_E)){
            response.sendRedirect("regisEmpresa.jsp");
            JOptionPane.showMessageDialog(null,"registro exitoso");
        }else {
            response.sendRedirect("regisEmpresa.jsp");
            JOptionPane.showMessageDialog(null, "registro fallido");
            PrintWriter o;
        }
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
