/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistasexcepciones.modelo;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class EmpleadoPlanta extends Empleado{

    public EmpleadoPlanta() {
    }

    public EmpleadoPlanta(int id, String documento, String nombres, String apellidos, String correoElectronico, String clave, String cargo, Date fechaIngreso, Double salario) {
        super(id, documento, nombres, apellidos, correoElectronico, clave, cargo, fechaIngreso, salario);
    }

    
    
    @Override
    public Double calcularBonificacion() {
        return this.salario * 0.1;
    }
    
}
