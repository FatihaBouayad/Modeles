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
public class ModeleInscriptions {
    
     public SimpleStringProperty idInscription = new SimpleStringProperty();
     public SimpleStringProperty idFormat = new SimpleStringProperty();
     public SimpleStringProperty idEtud = new SimpleStringProperty();
     public SimpleStringProperty DateIns = new SimpleStringProperty();
       public SimpleStringProperty TitreF = new SimpleStringProperty();
     public SimpleStringProperty NomE = new SimpleStringProperty();

    public String getIdInscription() {
        return idInscription.get();
    }


    public void setIdInscription(String idInscription) {
        this.idInscription.set(idInscription);
    }

    public String getIdFormat() {
        return idFormat.get();
    }

    public void setIdFormat(String idFormat) {
        this.idFormat.set(idFormat);
    }

    public String getIdEtud() {
        return idEtud.get();
    }

    public void setIdEtud(String idEtud) {
        this.idEtud.set(idEtud);
    }

    public String getTitreF() {
        return TitreF.get();
    }

    public void setTitreF(String TitreF) {
        this.TitreF.set(TitreF);
    }
   public String getNomE() {
        return NomE.get();
    }


    public void setNomE(String NomE) {
        this.NomE.set(NomE);
    }
     public String getDateIns() {
        return DateIns.get();
    }


    public void setDateIns(String DateIns) {
        this.DateIns.set(DateIns);
    }
    
}
