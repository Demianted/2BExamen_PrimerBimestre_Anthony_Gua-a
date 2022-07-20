/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Directivo extends empleado {
    private String empleado;

    public Directivo() {
    }

    public Directivo(String empleado, double sueldobruto, String nombre1, String nombre2, String apellido1, String apellido2, String Numerotelefonico, Date edad) {
        super(sueldobruto, nombre1, nombre2, apellido1, apellido2,Numerotelefonico, edad);
        this.empleado = empleado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    @Override
    public double getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
    
}
