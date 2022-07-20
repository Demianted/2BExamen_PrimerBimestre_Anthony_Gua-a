/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class empleado extends Persona {
    //como calcular salario
  double sueldobruto;
private String Categoria;
    public empleado() {
    }

    public empleado(double sueldobruto, String nombre1, String nombre2, String apellido1, String apellido2, String Numerotelefonico, Date edad) {
        super(nombre1, nombre2, apellido1, apellido2, Numerotelefonico, edad);
        this.sueldobruto = sueldobruto;
    }

    public double getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    
    @Override
    public String toString() {
        return "sueldobruto: "
                + "el sueldo del empleado es: \n" +getSueldobruto()
                +"la categoria del empleado es: \n"+getCategoria();
       
        
    }

 
  
        }
    
    

