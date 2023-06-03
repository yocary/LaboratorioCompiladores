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
public class Terminales {

   // se crea la lista para almacenar las terminales 
    private List<String> listaTerminales = new ArrayList<>();
    
     public void agregarTerminal(String terminal) {
        // valida si no existe la terminal 
        if (!listaTerminales.contains(terminal)) {
            //si no existe se crea la terminal
            listaTerminales.add(terminal);
        }

    }
     //consola
     public List<String> getTerminales() {
        // 
         System.out.println("***LISTADO TERMINALES");
          for (String t : listaTerminales) {
            System.out.println(t);
        }
          return listaTerminales;

    }
   
}
