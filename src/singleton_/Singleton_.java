/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_;

import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezotero
 */
public class Singleton_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      
         ClaseSingleton Javi=ClaseSingleton.getSingletonInstance();
           Javi.setNombre("Javi");
            Javi.setApellido("Alvarez");
            Javi.setEdad(20);
            JOptionPane.showMessageDialog(null,Javi);
            ClaseSingleton julian=ClaseSingleton.getSingletonInstance();
            julian.setNombre("Julian");
            julian.setApellido("Hulio");
            julian.setEdad(23);
            JOptionPane.showMessageDialog(null,julian);
    }
    
}
