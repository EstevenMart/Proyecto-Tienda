/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author emart
 */
public class UsuarioVO {
    //atributos
    private String cedula_usuario, email_usuario, nombre_usuario,contrasena,usuario ;
    
    //metodos constructores

    public UsuarioVO() {
    }

    public UsuarioVO(String cedula_usuario, String email_usuario, String nombre_usuario, String contrasena, String usuario) {
        this.cedula_usuario = cedula_usuario;
        this.email_usuario = email_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }
    
    //Getters y Setters

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
