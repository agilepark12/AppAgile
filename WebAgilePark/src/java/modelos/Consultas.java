/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class Consultas extends coneccion {      
        public boolean Registrar (String placa,String color,String marca,String foto,String tipo){
    PreparedStatement pst=null;
    
    try {
        
        String consulta= "insert into vehiculo (Placa,Color,Marca,FotoVehiculo,IdTipoVehiculo)values (?,?,?,?,?) "; 
        pst=getConection (). prepareStatement(consulta);
        pst.setString(1, placa);
        pst.setString(2, color);
        pst.setString(3, marca);
        pst.setString(4, foto);
        pst.setString(5, tipo);
        
        
        if(pst.executeUpdate()==1){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            return true;
        }
        
        }catch (SQLException ex){
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
        
 /**
    public static void main(String[] args) {
        Consultas co = new Consultas();
        System.out.println(co.Registrar("rojo","cir950","volkswagen","imagen","3"));

    }*/

    

}
   
