/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author johndavis09
 */
public class coneccion {
    
    private String USERNAME ="root";
    private String PASSWORD ="123456";
    private String HOST ="localhost";
    private String PORT ="3307";
    private String DATABASE ="agilepark?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private String CLASSNAME ="com.mysql.cj.jdbc.Driver";
    private String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection lazo;
    
    //Aqui define el constructor para la clase coneccion.
    
        public coneccion(){
            try{
                Class.forName(CLASSNAME);
                lazo=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }catch(ClassNotFoundException e){
                System.err.println("ERROR"+e);
            }catch(SQLException e){
                System.err.println("ERROR" +e);
            }
        }
        public Connection getConection(){
            return lazo;
        }
        
        //codigo para probar la conexion de datos
        
        public static void main(String[]args){
            coneccion lazo = new coneccion();
            System.out.println(""+lazo);
        }
    
}
