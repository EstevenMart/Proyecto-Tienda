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
    private String email_usuario, nombre_usuario;
    private int cedula_usuario;
    
    //metodos constructores

    public UsuarioVO() {
    }

    public UsuarioVO(String email_usuario, String nombre_usuario, int cedula_usuario) {
        this.email_usuario = email_usuario;
        this.nombre_usuario = nombre_usuario;
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

    public int getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(int cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }
    
    

}