/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author ASUS
 */
public class consulPlaca extends coneccion{ 
    public boolean consultarPlacaa( String placa_e) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consul = "select * from vehiculo where Placa = ?";
            pst = getConection().prepareStatement(consul);
            pst.setString(1, placa_e);
            

            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                return true;
                
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    //main utlizado para verificar la conexion a la bd y la existencia de usuario en  mysql
    public static void main(String[]args){
        consulPlaca pla = new consulPlaca();
        System.out.println(pla.consultarPlacaa("AFF24M"));
        
    }
    

}
