/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author johann.montoya
 */
public class Conetion {
  Connection conetion;

    public Conetion() {
    }
  Statement st;
    
   
     public Connection getConexion() {
        return conetion;
    }
      /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConetion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");                                      //user  //pass
            conetion = DriverManager.getConnection("jdbc:mysql://localhost:3306/construchome", "root", "root");
            st = conetion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }  
}
