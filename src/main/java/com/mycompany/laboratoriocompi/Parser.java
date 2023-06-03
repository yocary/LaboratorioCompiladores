/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoriocompi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yocary
 */
public class Parser {

   
  
    private Terminales terminales = new Terminales();
    private Producciones producciones = new Producciones();
    private Variable variables = new Variable();
    

    public Terminales getTerminales() {
        return terminales;
    }

    public void setTerminales(Terminales terminales) {
        this.terminales = terminales;
    }

    public Producciones getProducciones() {
        return producciones;
    }

    public void setProducciones(Producciones producciones) {
        this.producciones = producciones;
    }

    public Variable getVariables() {
        return variables;
    }

    public void setVariables(Variable variables) {
        this.variables = variables;
    }

    public void analizarCadena(String cadena) {
        // metodo para analizar la cadena 
        //se crean las variables temporales vacias
        String tempVariable = "";
        String tempProduccion = "";
        String tempTerminal = "";
        int tamanio = cadena.length();
        //booleanas para saber si se almacenara una terminal(dentro de comillas) o una variable(fuera de comillas)
        boolean dentrodeComilla = false;
        boolean dentroProduccion = false;
        
        for (int i = 0; i < tamanio; i++) {
            char c = cadena.charAt(i);
            switch (c) {
                case '\n': {
                    //valida si es salto de linea 
                    if (!tempProduccion.equals("")) {
                        Produccion prod = new Produccion(tempVariable,tempProduccion);
                        producciones.agregarProduccion(prod);
                        tempVariable="";
                        tempProduccion="";
                        dentroProduccion = false;
                    }
                    break;
                }
                case ':': {
                    dentroProduccion = true; //se cambia el valor dentro de produccion a verdadero
                    //se almacena la variable en el listado de variables
                    if (!tempVariable.equals("")) {
                        variables.agregarVariable(tempVariable);
                    }
                    break;
                }
                case '\'': {
                    if (dentrodeComilla) {
                        dentrodeComilla = false;
                        if (!tempTerminal.equals("")) {
                            terminales.agregarTerminal(tempTerminal);
                            tempProduccion += tempTerminal;
                            tempTerminal="";
                        }
                    }else{
                        dentrodeComilla = true;
                    }
                    break;
                }
                case '|': {
                    if (!tempProduccion.equals("")) {
                        Produccion prod = new Produccion(tempVariable,tempProduccion);
                         producciones.agregarProduccion(prod);
                        tempProduccion="";
                    }
                    break;
                }
                case 'e': {
                    if (dentrodeComilla) {
                        tempTerminal += c; 
                    }else{
                        tempTerminal += c;
                        terminales.agregarTerminal(tempTerminal);
                        tempProduccion += tempTerminal;
                        tempTerminal="";
                    }
                    break;
                }
                case ' ':case '\t':case '\r':{
                    break;
                }
                default:{
                    if(dentrodeComilla){
                        tempTerminal += c; 
                    }else if(dentroProduccion){
                        tempProduccion += c;
                    }else{
                        tempVariable += c;
                    }
                }
            }
        }
        // al finalizar el analisis se verifica si no hay una produccion pendiente de insertar
        if (!tempProduccion.equals("")) {
            Produccion prod = new Produccion(tempVariable,tempProduccion);
            producciones.agregarProduccion(prod);
        }
    }
    //consola
    public void mostrarSalida(){
        variables.getVariables();
        terminales.getTerminales();
        producciones.getProducciones();
    }
}


