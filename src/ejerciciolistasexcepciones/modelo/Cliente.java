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
public class Cliente extends Usuario{

    private Boolean VIP;

    public Cliente(Boolean VIP) {
        this.VIP = VIP;
    }

    public Cliente(int id, String documento, String nombres, String apellidos, String correoElectronico, String clave, Boolean VIP) {
        super(id, documento, nombres, apellidos, correoElectronico, clave);
        this.VIP = VIP;
    }

    public Boolean getVIP() {
        return VIP;
    }

    public void setVIP(Boolean VIP) {
        this.VIP = VIP;
    }
    
    @Override
    public String getDatosCompletos() {
        return "Soy un Cliente, mi nombre es: " + nombres + " " + apellidos + 
                " Soy VIP ?" + ((VIP) ? " Si": ((!VIP) ? " - ": " $ "));
        
    }
    
}
