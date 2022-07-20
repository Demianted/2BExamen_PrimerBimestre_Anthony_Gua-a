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
public class empresa extends Persona {
    private String nombreEmpresa;

    public empresa() {
    }

    public empresa(String nombreEmpresa, String nombre1, String nombre2, String apellido1, String apellido2, String Numerotelefonico, Date edad) {
        super(nombre1, nombre2, apellido1, apellido2, Numerotelefonico, edad);
        this.nombreEmpresa = nombreEmpresa;
    }
    

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    @Override
    public String toString() {
        return "El nombre de la empresa es \n"
                 +"Nombre de la empresa: "+getNombreEmpresa();
        
       
    }

    public void setNombre(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCorreo(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDireccion(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTelefono(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
