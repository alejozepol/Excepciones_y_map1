/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasexcepciones.util.excepciones;

/**
 *
 * @author SENA
 */
public class ExcepcionSistema extends Exception{
    
    private int codigo;
    private String titulo;
    private String mensaje;
    private String detalle;

    public ExcepcionSistema(int codigo, String titulo, String mensaje, String detalle) {
        super(mensaje);
        this.codigo = codigo;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
