/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import controller.ketnoi;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.*;
/**
 *
 * @author admin
 */
@WebServlet(name = "displayservlet", urlPatterns = {"/displayservlet"})
public class displayservlet extends HttpServlet {
    ketnoi k = new ketnoi();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet displayservlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet displayservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    private void getAll(HttpServletRequest request) throws SQLException {
        String sql = "select * from hocvien";
        PreparedStatement stm = k.con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        request.setAttribute("rs", rs);
    }
    
    private void add (String mahv, String hoten, String ngaysinh, String diem) throws SQLException {
        String sql = "insert into hocvien (mahv, hoten, ngaysinh, diem) values (?, ?, ?, ?)";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setInt(1, Integer.parseInt(mahv));
            stm.setString(2, hoten);
            stm.setDate(3, java.sql.Date.valueOf(ngaysinh));
            stm.setInt(4, Integer.parseInt(diem));
            stm.executeUpdate();
        }
    }

    private void delete (String mahv) throws SQLException {
        String sql = "delete from hocvien where mahv = ?";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setInt(1, Integer.parseInt(mahv));
            stm.executeUpdate();
        }
    }

    private void search (String fr, String to, HttpServletRequest request) throws SQLException {
        String sql = "select * from hocvien where diem between ? and ?";
        PreparedStatement stm = k.con.prepareStatement(sql);
        stm.setInt(1, Integer.parseInt(fr));
        stm.setInt(2, Integer.parseInt(to));
        ResultSet rs = stm.executeQuery();
        request.setAttribute("rs", rs);
    }

    /**
     *
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
