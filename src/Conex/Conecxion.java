/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
 public boolean busqueda(String consulta,String tabla)  {
 Statement stm;
 boolean a=false;
        try {
            stm = con.createStatement();
            ResultSet rst = stm.executeQuery("select 1 from usuarios where "+tabla+"='"+consulta+"'");
            if(rst.next()){
                if(rst.getRow() > 0){
                    a = true;
                }else {
                   a=false;
                   JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Atención", JOptionPane.ERROR_MESSAGE);}
           }else {
                   a=false;
                   JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Atención", JOptionPane.ERROR_MESSAGE);}
            
        } catch (SQLException ex) {
            System.out.println("error en conecxion"+ex.getMessage());
            
           
        }finally{
            
        }
        
          
 return a;
     
 }
    
}
