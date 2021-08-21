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
public class ModeleFormations {
 
    public SimpleStringProperty idFormation = new SimpleStringProperty();
    public SimpleStringProperty DateAjout = new SimpleStringProperty();
    public SimpleStringProperty TitreFormation = new SimpleStringProperty();
    public SimpleStringProperty Prix = new SimpleStringProperty();
    public SimpleStringProperty Session = new SimpleStringProperty();
    public SimpleStringProperty DateD = new SimpleStringProperty();
    public SimpleStringProperty DateF = new SimpleStringProperty();
    public SimpleStringProperty IdEnseignant = new SimpleStringProperty();
    public SimpleStringProperty Niveau = new SimpleStringProperty();
    public SimpleStringProperty Description = new SimpleStringProperty();

    public String getIdFormation() {
        return idFormation.get();
    }

    public void setIdFormation(String idFormation) {
        this.idFormation.set(idFormation);
    }

    public void setDateAjout(String DateAjout) {
        this.DateAjout.set(DateAjout);
    }

    public void setTitreFormation(String TitreFormation) {
        this.TitreFormation.set(TitreFormation);
    }

    public void setPrix(String Prix) {
        this.Prix.set(Prix);
    }

    public void setSession(String Session) {
        this.Session.set(Session);
    }

    public void setDateD(String DateD) {
        this.DateD.set(DateD);
    }

    public void setDateF(String DateF) {
        this.DateF.set(DateF);
    }

    public void setIdEnseignant(String IdEnseignant) {
        this.IdEnseignant.set(IdEnseignant);
    }

    public String getDateAjout() {
        return DateAjout.get();
    }

    public String getTitreFormation() {
        return TitreFormation.get();
    }

    public String getPrix() {
        return Prix.get();
    }

    public String getSession() {
        return Session.get();
    }

    public String getDateD() {
        return DateD.get();
    }

    public String getDateF() {
        return DateF.get();
    }

    public String getIdEnseignant() {
        return IdEnseignant.get();
    }

     public String getNiveau() {
        return Niveau.get();
    }

    public void setNiveau(String Niveau) {
        this.Niveau.set(Niveau);
    }
     public String getDescription() {
        return Description.get();
    }

    public void setDescription(String Desciption) {
        this.Description.set(Desciption);
    }
    
}
