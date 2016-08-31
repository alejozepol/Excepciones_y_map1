/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasexcepciones.modelo;

/**
 *
 * @author SENA
 */
public abstract class Usuario {
    
    protected int id;
    protected String documento;
    protected String nombres;
    protected String apellidos;
    protected String correoElectronico;
    protected String clave;

    public Usuario() {
        this. id = 1234;
    }

    public Usuario(int id, String documento, String nombres, String apellidos, String correoElectronico, String clave) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public abstract String getDatosCompletos();
    
    public String getDatos(){
        return "Soy un usuario, y mi nombre es: " + nombres + " " + apellidos;
    }
    
    
}
