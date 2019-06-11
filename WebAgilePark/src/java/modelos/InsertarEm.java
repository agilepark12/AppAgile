/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class InsertarEm extends coneccion{
   
    
     
    public boolean Insercion ( String Nom_E, String Ape_E, String TipoDoc_E, String Doc_E, String Depa_E, String Placa_E){
    PreparedStatement pst=null;
    
    try {
        
        String inser=  "insert into cliente_empleado ( Nombre, Apellido, TipoDocumneto, Documento, Departamento, placa  )values (?,?,?,?,?,?)";
        pst=getConection (). prepareStatement(inser);
        pst.setString(1, Nom_E);
        pst.setString(2, Ape_E);
        pst.setString(3, TipoDoc_E);
        pst.setString(4, Doc_E);
        pst.setString(5, Depa_E);
        pst.setString(6, Placa_E);
        
        
        if(pst.executeUpdate()==1){
            return true;
        }
        
    } catch (SQLException ex){
        System.err.println("Error" + ex);
        }finally{
        
        try{
            if (getConection ()!=null)getConection ().close();
               if (pst!=null)pst.close(); 
                                       
        }catch (Exception e){
            System.err.println("Error" + e);
        }       
        }
    return false;
    }    
    //Main Utilizado para verificar la conexion a la BD y la existencia de usuarios en MYSQL
    
    
    public static void main(String[] args) {
        InsertarEm co = new InsertarEm();
        System.out.println(co.Insercion("jose", "mendez","3","7654","1","RXQ531"));

    }
    
    
}
