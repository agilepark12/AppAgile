/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Conexion {
    Connection con = null;
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/agilepark?useTimezone=true&serverTimezone=UTC&useSSL=false","root","123456");
        }catch(Exception e){
            System.err.println("error"+e);
        }  
    }
    public Connection getConnection(){        
        return con;
    }
    
     public static void main(String[]args){
            Conexion con = new Conexion();
            System.out.println(""+con);
        }    
}
