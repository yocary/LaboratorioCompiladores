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
public class Producciones {
    
    // se crea la lista para almacenar las producciones 
    private List<Produccion> listaProducciones = new ArrayList<>();

    public void agregarProduccion(Produccion produccion) {
        // valida si no existe produccion
        if (!listaProducciones.contains(produccion)) {
            //si no existe agrega produccion en la lista de producciones 
            listaProducciones.add(produccion);

        }
    } 
    //consola
     public List<Produccion> getProducciones() {
        // 
         System.out.println("***LISTADO PRODUCCIONES");
          for (Produccion p : listaProducciones) {
            System.out.println("Var: " + p.getVariable() + " Produc: " + p.getProduccion() );
        }
          return listaProducciones;
    }
    
    
}
