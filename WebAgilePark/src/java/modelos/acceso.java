/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class acceso extends coneccion{ 
    public boolean autenticacion( String documento, String clave) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String accediendo = "select Nombre from logistico where Documento = ? and clave = ?";
            pst = getConection().prepareStatement(accediendo);
            pst.setString(1, documento);
            pst.setString(2, clave);


            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                System.out.println("datos: " + documento +" otro "+ clave);
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
    
    
    
    /**
        public void mostrarNombre(String documento){
            String[] titulos ={"Nombre"};
            String [] registros = new String[1];
            
            DefaultTableModel modelo = new DefaultTableModel(null,titulos);
            String consulta ="SELECT Nombre FROM logistico WHERE documento = ' "+documento+" '";

            try{
                Statement pst = co.CreateStatement();
                ResultSet rs =pst.executeQuery(consulta);
                while(rs.next()){
                    registros()= rs.getString("Documento");
                    modelo.addRow(registros);
                }
                documento.setModel(modelo);
            }catch(Exception n){
                System.err.println("Error" + n);
            }
            
        }*/
    //main utlizado para verificar la conexion a la bd y la existencia de usuario en  mysql
    
    public static void main(String[]args){
        acceso co = new acceso();
        System.out.println(co.autenticacion("237912", "124509S"));
    }

    
    
}
