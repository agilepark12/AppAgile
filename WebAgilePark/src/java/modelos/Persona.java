/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author ASUS
 */
public class Persona {
    String Nom_E;
    String Ape_E;
    String TipoDoc_E;
    String Doc_E;
    String Depa_E;
    String Placa_E;

    public Persona() {
    }

    public Persona(String Nom_E, String Ape_E, String TipoDoc_E, String Doc_E, String Depa_E, String Placa_E) {
        this.Nom_E = Nom_E;
        this.Ape_E = Ape_E;
        this.TipoDoc_E = TipoDoc_E;
        this.Doc_E = Doc_E;
        this.Depa_E = Depa_E;
        this.Placa_E = Placa_E;
    }

    public String getNom_E() {
        return Nom_E;
    }

    public void setNom_E(String Nom_E) {
        this.Nom_E = Nom_E;
    }

    public String getApe_E() {
        return Ape_E;
    }

    public void setApe_E(String Ape_E) {
        this.Ape_E = Ape_E;
    }

    public String getTipoDoc_E() {
        return TipoDoc_E;
    }

    public void setTipoDoc_E(String TipoDoc_E) {
        this.TipoDoc_E = TipoDoc_E;
    }

    public String getDoc_E() {
        return Doc_E;
    }

    public void setDoc_E(String Doc_E) {
        this.Doc_E = Doc_E;
    }

    public String getDepa_E() {
        return Depa_E;
    }

    public void setDepa_E(String Depa_E) {
        this.Depa_E = Depa_E;
    }

    public String getPlaca_E() {
        return Placa_E;
    }

    public void setPlaca_E(String Placa_E) {
        this.Placa_E = Placa_E;
    }
    
    
    
}
