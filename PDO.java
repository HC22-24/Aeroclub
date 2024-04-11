/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Win10
 */

public class PDO {



    Connection conn;
        public static String Upassword;
        public static String Uuser;
          public static String Univeau;
    
    public  Connection pdo() {
        
        try {

                        String url = "jdbc:postgresql://10.22.32.41:5432/aeroclub";
                 String password = "Admin1&"; //Logger.getLogger(pass.class.getName()).log(Level.SEVERE, null, ex);
                String user = "matthieu";
                 // System.out.println("password : "+ password);  
            
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
             System.out.println("Connected database successfully..."); 
             
             
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(PDO.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Error log"); 
        }
        
        if(conn != null){
        return conn;
        }else{
      System.out.println("Connection = NULL"); 
      return conn;
        }
    }

    public static void main(String[] args){
   PDO pdoInstance = new PDO();
        Connection con = pdoInstance.pdo();
          }
    
}
