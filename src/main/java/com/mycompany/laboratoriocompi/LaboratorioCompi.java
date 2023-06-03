/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.laboratoriocompi;

import javax.swing.JFrame;

/**
 *
 * @author yocary
 */
public class LaboratorioCompi {

    public static void main(String[] args) {
        //MI DROP PANEL 
        JFrame ventana = new JFrame("Cargar Archivo TXT ");
         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ventana.getContentPane().add(new DropPanel());
         ventana.pack();
         ventana.setLocationRelativeTo(null);
         ventana.setVisible(true);
         }
}
