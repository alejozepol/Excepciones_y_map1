/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasexcepciones.controladores;

import ejerciciolistasexcepciones.modelo.Cliente;
import ejerciciolistasexcepciones.modelo.Empleado;
import ejerciciolistasexcepciones.modelo.EmpleadoContratista;
import ejerciciolistasexcepciones.modelo.EmpleadoPlanta;
import ejerciciolistasexcepciones.modelo.Usuario;
import ejerciciolistasexcepciones.util.excepciones.ExcepcionSistema;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SENA
 */
public class Sistema {

    public void correrPrograma() throws ClassCastException{
        Usuario u = new EmpleadoContratista(1, "123456", "Carlos", "Bernal",
                "cbernal@correo.com", "1234", Empleado.CARGO_AUXILIAR, new Date(), 900000.0);
        Usuario u1 = new EmpleadoPlanta(2, "234567", "Hernan", "Ramirez",
                "hramirez@correo.com", "1234", Empleado.CARGO_GERENTE, new Date("10/21/2005"), 1500000.0);
        Usuario u2 = new Cliente(3, "345678", "Andrea", "Sanabria",
                "asanabria@correo.com", "1234", true);

        List<Usuario> usuarios = new ArrayList();
        usuarios.add(u);
        usuarios.add(u1);
        usuarios.add(u2);
        
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getDatosCompletos());
            System.out.println(usuario.getDatos());
            //if(usuario instanceof Empleado){
            Empleado e = (Empleado) usuario;
            System.out.println("Su bonificación es: " + e.calcularBonificacion());
            //}
            System.out.println("-----------------------");
        }
        
        Map<Integer, Usuario> usuariosMap = new HashMap<>();
        usuariosMap.put(456, u);
        usuariosMap.put(123, u1);
        usuariosMap.put(789, u2);
        
        Iterator<Integer> i = usuariosMap.keySet().iterator();
        while(i.hasNext()){
            Integer key = i.next();
            Usuario usuario = usuariosMap.get(key);
            
            System.out.println(usuario.getDatosCompletos());
            System.out.println(usuario.getDatos());
            //if(usuario instanceof Empleado){
            Empleado e = (Empleado) usuario;
            System.out.println("Su bonificación es: " + e.calcularBonificacion());
            //}
            System.out.println("-----------------------");
            
        }
        
        

        /*
        try {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getDatosCompletos());
                System.out.println(usuario.getDatos());
                //if(usuario instanceof Empleado){
                Empleado e = (Empleado) usuario;
                System.out.println("Su bonificación es: " + e.calcularBonificacion());
                //}
                System.out.println("-----------------------");
            }
        } catch (ClassCastException cce) {
            System.out.println("Uno de los usuarios no es empleado");
            System.out.println("Mensaje: " + cce.getMessage());
            System.out.println("Detalles");
            cce.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se presentó un error en el sistema.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Detalles");
        } finally {
            System.out.println("Ya se ejecutó todo el código.");
        }
         */

 /*
        try {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getDatosCompletos());
                System.out.println(usuario.getDatos());
                //if(usuario instanceof Empleado){
                Empleado e = (Empleado) usuario;
                System.out.println("Su bonificación es: " + e.calcularBonificacion());
                //}
                System.out.println("-----------------------");
            }
        } catch (ClassCastException cce) {
            //throw new Exception("Hola, se presento un error");
            throw new ExcepcionSistema(1, "Error cast", "Uno de los usuarios no es empleado", cce.getMessage());
        } catch (Exception e) {
            throw new ExcepcionSistema(1, "Error del sistema", "Se presentó un error en el sistema", e.getMessage());
            
        } finally {
            System.out.println("Ya se ejecutó todo el código.");
        }
         */
    }
}
