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
public class ModeleFrais {
    
    private SimpleStringProperty IDFRAIS = new SimpleStringProperty();
    private SimpleStringProperty DENOMINATION = new SimpleStringProperty();
    private SimpleStringProperty Montant = new SimpleStringProperty();
    private SimpleStringProperty DATE = new SimpleStringProperty();  

    public String getIDFRAIS() {
        return IDFRAIS.get();
    }

    public void setIDFRAIS(String IDFRAIS) {
        this.IDFRAIS.set(IDFRAIS);
    }

    public String getDENOMINATION() {
        return DENOMINATION.get();
    }

    public void setDENOMINATION(String DENOMINATION) {
        this.DENOMINATION.set(DENOMINATION);
    }

    public String getMontant() {
        return Montant.get();
    }

    public void setMontant(String TARIF) {
        this.Montant.set(TARIF);
    }

    public String getDATE() {
        return DATE.get();
    }

    public void setDATE(String DATE) {
        this.DATE.set(DATE);
    }
    
    

}
