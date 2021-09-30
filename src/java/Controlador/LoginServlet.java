/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.LoginDAO;
import ModeloVO.LoginVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emart
 */
@WebServlet(name = "UsuariosServlet", urlPatterns = {"/UsuariosServlet"})
public class LoginServlet extends HttpServlet {

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

        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        LoginVO logVO = new LoginVO(usuario, contrasena);
        LoginDAO logDAO = new LoginDAO(logVO);

        switch (opcion) {

            case 1:

                if (logDAO.iniciarSesion(usuario, contrasena)) {
                    HttpSession miSesion = request.getSession(true);

                    logVO = new LoginVO(usuario, contrasena);
                    miSesion.setAttribute("datos", logVO);
                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "Datos de inicio de sesion incorrectos");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }

                break;
        }
    }
}
