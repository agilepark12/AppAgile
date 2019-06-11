/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import config.CRUD;
import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PersonaDAO  implements CRUD{
 
        Conexion conexion = new Conexion();
        Connection conect;
        PreparedStatement ps;
        ResultSet rs;
        Persona  per= new Persona();
   
    
  
    @Override
    public List Listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="SELECT * FROM cliente_empleado";
        try{
            conect=conexion.getConnection();
            ps=conect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setDoc_E(rs.getString("Documento"));
                per.setNom_E(rs.getString("Nombre"));
                per.setApe_E(rs.getString("Apellido"));
                per.setTipoDoc_E(rs.getString("TipoDocumneto"));
                per.setDepa_E(rs.getString("Departamento"));
                per.setPlaca_E(rs.getString("placa"));
                list.add(per);
            }
        }catch(Exception e){
            
        }
        return list;
    }

    @Override
    public Persona list(String Doc_E) {
         throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Persona per) {
       String sql="INSERT INTO cliente_empleado(Documento, Nombre, Apellido, TipoDocumneto, Departamento, placa)VALUES(' "+per.getDoc_E()+" ',' "+per.getNom_E()+" ',' "+per.getApe_E()+" ','  "+per.getTipoDoc_E()+" ',' "+per.getDepa_E()+" ',' "+per.getPlaca_E()+"  ')";
       try{
           conect=conexion.getConnection();
            ps=conect.prepareStatement(sql);
            ps.executeUpdate();
       } catch(Exception e){
       }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String Doc_E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
