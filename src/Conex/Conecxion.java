/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author kewin
 */
public class Conecxion {
    Connection con;
    public Conecxion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema de gestion","root","");
        }catch(Exception e) {
            System.out.println("error en conecxion"+e);
        }   
    }
    
    
}
