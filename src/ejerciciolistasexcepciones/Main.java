/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasexcepciones;

import ejerciciolistasexcepciones.controladores.Sistema;
import ejerciciolistasexcepciones.modelo.Cliente;
import ejerciciolistasexcepciones.modelo.Empleado;
import ejerciciolistasexcepciones.modelo.EmpleadoContratista;
import ejerciciolistasexcepciones.modelo.EmpleadoPlanta;
import ejerciciolistasexcepciones.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SENA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema s = new Sistema();
        try{
            s.correrPrograma();
        } catch(ClassCastException cce){
            
        }
    }
    
}
