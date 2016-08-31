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
public abstract class Empleado extends Usuario{
    
    public final static String CARGO_AUXILIAR = "Auxiliar";
    public final static String CARGO_GERENTE = "Gerente";
    public final static String CARGO_ADMINISTRADOR = "Administrador";

    protected String cargo;
    protected Date fechaIngreso;
    protected Double salario;

    public Empleado() {
        super();
    }

    public Empleado(int id, String documento, String nombres, String apellidos,
            String correoElectronico, String clave, String cargo, 
            Date fechaIngreso, Double salario) {
        super(id, documento, nombres, apellidos, correoElectronico, clave);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public String getDatosCompletos() {
        return "Soy un Empleado, mi nombre es: " + nombres + " " + apellidos + 
                " y mi cargo es: " +  cargo + " -  Sueldo: " + salario + " - " +
                        "Fecha ingreso: " + fechaIngreso;
    }
    
    @Override
    public String getDatos(){
        return "Soy un Empleado, mi nombre es: " + nombres + " " + apellidos + 
                " y mi cargo es: " +  cargo;
    }
    
    public abstract Double calcularBonificacion();
}
