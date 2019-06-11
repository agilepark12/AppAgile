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
 * @author johndavis09
 */
public class AdminUsuarios extends coneccion{
   
    public boolean RegUsuario (String Docu,String Nom,String Ape,String TipoDo, String Clave, String tipolog){
    PreparedStatement pst=null;
    
    try {
        
        String regisusuario= "insert into logistico (Documento, Nombre, Apellido, TipoDocumento, clave, tipoLogistico)values (?,?,?,?,?,?) "; 
        pst=getConection (). prepareStatement(regisusuario);
        pst.setString(1, Docu);
        pst.setString(2, Nom);
        pst.setString(3, Ape);
        pst.setString(4, TipoDo);
        pst.setString(5, Clave);
        pst.setString(6, tipolog);
        
        
        if(pst.executeUpdate()==1){
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
    public static void main(String[] args) {
        AdminUsuarios co = new AdminUsuarios();
        System.out.println(co.RegUsuario("54321","johana","car","2","cardona123","1"));

    }
}
