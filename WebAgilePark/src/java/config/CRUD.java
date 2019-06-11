/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.util.List;
import modelos.Persona;


/**
 *
 * @author ASUS
 */
public interface CRUD {
    public List Listar();
    public Persona list(String Doc_E);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(String Doc_E);
}
