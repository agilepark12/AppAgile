/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class ConsultasGrales extends coneccion {
    
    
    public static void usuario(String documento) throws SQLException{
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        String accediendo = "select * from logistico where Documento = ' "+documento+" ' ";
        
        try {
            
            
        } catch (Exception e) {
            
        }
    }
}
