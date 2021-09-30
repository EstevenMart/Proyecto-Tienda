/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.LoginVO;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author emart
 */
public class LoginDAO extends Conexion {

   //1. Declarar Atributos y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String usuario = "", contrasena = "";

    //2. Conectarse y traemos los datos de los atributos de la clase VO
    public LoginDAO(LoginVO usuVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            usuario = usuVO.getUsuario();
            contrasena = usuVO.getContrasena();

        } catch (Exception e) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //4. Metodos propios del modulo
    public boolean iniciarSesion(String usuario, String contrasena) {

        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario where usuario=? and contrasena=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(2, contrasena);
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                operacion = true;
            }
        } catch (SQLException e) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    
    
    
}
