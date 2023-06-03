/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoriocompi;

/**
 *
 * @author yocary
 */
public class Produccion {
   
    private String Variable;
    private String Produccion;
    
  
    public Produccion(String Variable, String Produccion) {
        this.Variable = Variable;
        this.Produccion = Produccion;
    }
    public String getVariable() {
        return Variable;
    }

    public void setVariable(String Variable) {
        this.Variable = Variable;
    }

    public String getProduccion() {
        return Produccion;
    }

    public void setProduccion(String Produccion) {
        this.Produccion = Produccion;
    }
   
}
