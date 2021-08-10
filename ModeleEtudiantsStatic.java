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
public class ModeleEtudiantsStatic {
      // clique sur ALT + INS 
    public static SimpleStringProperty idEtudiant = new SimpleStringProperty();
    public static SimpleStringProperty DateAjout = new SimpleStringProperty();
    public static SimpleStringProperty NomEtudiant = new SimpleStringProperty();
    public static SimpleStringProperty PrenomEtudiant = new SimpleStringProperty();
    public static SimpleStringProperty TelEtudiant = new SimpleStringProperty();
    public static SimpleStringProperty EmailEtudiant = new SimpleStringProperty();
    
    //LA VIE EST FACILE 
    
    
    public String getIdEtudiant() {
        return idEtudiant.get();
    }

    public void setIdEtudiant(String idEtudiant) {
        this.idEtudiant.set(idEtudiant);
    }
    
     public String getDate() {
        return DateAjout.get();
    }

    public void setDate(String DateAjout) {
        this.DateAjout.set(DateAjout);
    }

    public String getNomEtudiant() {
        return NomEtudiant.get();
    }

    public void setNomEtudiant(String NomEtudiant) {
        this.NomEtudiant.set(NomEtudiant); 
    }

    public String getPrenomEtudiant() {
        return PrenomEtudiant.get();
    }

    public void setPrenomEtudiant(String PrenomEtudiant) {
        this.PrenomEtudiant.set(PrenomEtudiant);
    }

    public String getTelEtudiant() {
        return TelEtudiant.get();
    }

    public void setTelEtudiant(String TelEtudiant) {
        this.TelEtudiant.set(TelEtudiant);
    }

    public String getEmailEtudiant() {
        return EmailEtudiant.get();
    }

    public void setEmailEtudiant(String EmailEtudiant) {
        this.EmailEtudiant.set(EmailEtudiant);
    }
    
   
}
