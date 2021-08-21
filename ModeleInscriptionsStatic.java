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
public class ModeleInscriptionsStatic {
     public static SimpleStringProperty idInscription = new SimpleStringProperty();
     public static SimpleStringProperty idFormat = new SimpleStringProperty();
     public static SimpleStringProperty idEtud = new SimpleStringProperty();
     public static SimpleStringProperty DateIns = new SimpleStringProperty();

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

    public String getDateIns() {
        return DateIns.get();
    }

    public void setDateIns(String DateIns) {
        this.DateIns.set(DateIns);
}
}
