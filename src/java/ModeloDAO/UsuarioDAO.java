/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author emart
 */
public class UsuarioDAO {

    //1. Declarar Atributos y objetos
    private String email_usuario = "", nombre_usuario = "", contrasena = "", usuario = "";
    private int cedula_usuario = 0;

    public UsuarioVO iniciarSesion(String usuario, String contrasena) {
        UsuarioVO usu = null;
        Connection cn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            cn = con.obtenerConexion();
            String sql = "SELECT * FROM usuarios Where usuario = ? AND contrasena = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, contrasena);
            rs = pstm.executeQuery();

            while (rs.next()) {

                usu = new UsuarioVO();
                usu.setUsuario(rs.getString("usuario"));
                usu.setContrasena(rs.getString("contrasena"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (cn != null) {
                    cn.close();
                }

            } catch (Exception e2) {

                e2.printStackTrace();

            }

        }
        return usu;

    }
}
