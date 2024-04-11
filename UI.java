/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JWindow;

/**
 *
 * @author Win10
 */
public class UI {

    /**
     * @param args the command line arguments
     */
    
            public static  boolean visible = true;
    
    public static void main(String[] args) {
        

        
        
        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = tailleEcran.height;
        int largeur = tailleEcran.width;

         
    
      pass NewJFrame = new pass();
      NewJFrame.setLocation(largeur/4, hauteur/4);
      NewJFrame.setVisible(visible);  
      
      
//                          Interface Interface = new Interface();
//                     Interface.setSize(largeur, hauteur);
//                    Interface.setVisible(true);  

      
        
    }
    
 
    
    
    
}
