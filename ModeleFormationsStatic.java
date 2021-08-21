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
public class ModeleFormationsStatic {
    public static SimpleStringProperty idFormation = new SimpleStringProperty();
    public static SimpleStringProperty DateAjout = new SimpleStringProperty();
    public static SimpleStringProperty TitreFormation = new SimpleStringProperty();
    public static SimpleStringProperty Prix = new SimpleStringProperty();
    public static SimpleStringProperty Session = new SimpleStringProperty();
    public static SimpleStringProperty DateD = new SimpleStringProperty();
    public static SimpleStringProperty DateF = new SimpleStringProperty();
    public static SimpleStringProperty IdEnseignant = new SimpleStringProperty();
    public static SimpleStringProperty Niveau = new SimpleStringProperty();
    public static SimpleStringProperty Description = new SimpleStringProperty();

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
