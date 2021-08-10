/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgsescuela.Modele;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author hdegd
 */
public class ModeleEnseignantsStatic {
    
    public static SimpleStringProperty idEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty DateAjout = new SimpleStringProperty();
    public static SimpleStringProperty NomEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty PrenomEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty TelEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty EmailEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty AdresseEnseignant = new SimpleStringProperty();
     
     
     public String getIdEnseignant() {
        return idEnseignant.get();
    }

    public void setIdEnseignant(String idEnseignant) {
        this.idEnseignant.set(idEnseignant);
    }

    public String getDateAjout() {
        return DateAjout.get();
    }

    public void setDateAjout(String DateAjoutP) {
        this.DateAjout.set(DateAjoutP);
    }
    
    public String getNomEnseignant() {
        return NomEnseignant.get();
    }

    public void setNomEnseignant(String NomEnseignant) {
        this.NomEnseignant.set(NomEnseignant); 
    }

    public String getPrenomEnseignant() {
        return PrenomEnseignant.get();
    }

    public void setPrenomEnseignant(String PrenomEnseignant) {
        this.PrenomEnseignant.set(PrenomEnseignant);
    }

    public String getTelEnseignant() {
        return TelEnseignant.get();
    }

    public void setTelEnseignant(String TelEnseignant) {
        this.TelEnseignant.set(TelEnseignant);
    }

    public String getEmailEnseignant() {
        return EmailEnseignant.get();
    }

    public void setEmailEnseignant(String EmailEnseignant) {
        this.EmailEnseignant.set(EmailEnseignant);
    }
    
     public String getAdresseEnseignant() {
        return AdresseEnseignant.get();
    }

    public void setAdresseEnseignant(String AdresseEnseignant) {
        this.AdresseEnseignant.set(AdresseEnseignant);
    }
}
