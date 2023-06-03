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
public class Variable {
// se crea la lista para almacenar las variables 
    private  List<String> listaVariables = new ArrayList<>();
       
       
    public void agregarVariable(String variable) {
        // se valida si no existe la  variable  
        if (!listaVariables.contains(variable)) {
            //si no existe se crea la variable en la lista
            listaVariables.add(variable);
        }
    }
    //consola
     public  List<String> getVariables() {
        // 
         System.out.println("***LISTADO VARIABLES");
          for (String v : listaVariables) {
            System.out.println(v);
        }
          return listaVariables;
    }
}
