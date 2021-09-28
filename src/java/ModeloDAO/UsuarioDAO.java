/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author emart
 */
public class UsuarioDAO extends Conexion implements Crud {
    
    //1. Declarar Atributos y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String 

    @Override
    public boolean agregarRegistro() {
        
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
