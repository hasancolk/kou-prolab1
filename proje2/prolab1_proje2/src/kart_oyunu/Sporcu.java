/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

import javax.swing.*;

public class Sporcu {

    public Sporcu() {

    }

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    private String sporcuIsim;
    private String sporcuTakim;
    private ImageIcon fotograf;
    

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    
    public ImageIcon getFotograf() {
        return fotograf;
    }

    
    public void setFotograf(ImageIcon fotograf) {
        this.fotograf = fotograf;
    }
}
