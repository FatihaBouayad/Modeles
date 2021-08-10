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
public class ModeleEtudiants {

    
     // clique sur ALT + INS 
    public SimpleStringProperty idEtudiant = new SimpleStringProperty();
    public SimpleStringProperty DateAjout = new SimpleStringProperty();
    public SimpleStringProperty NomEtudiant = new SimpleStringProperty();
    public SimpleStringProperty PrenomEtudiant = new SimpleStringProperty();
    public SimpleStringProperty TelEtudiant = new SimpleStringProperty();
    public SimpleStringProperty EmailEtudiant = new SimpleStringProperty();
     
    //LA VIE EST FACILE 
    
    
    public String getIdEtudiant() {
        return idEtudiant.get();
    }

    public void setIdEtudiant(String idEtudiant) {
        this.idEtudiant.set(idEtudiant);
    }

    public String getDateAjout() {
        return DateAjout.get();
    }

    public void setDateAjout(String DateAjoutP) {
        this.DateAjout.set(DateAjoutP);
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
