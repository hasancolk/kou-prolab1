/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

import javax.swing.*;

public class Futbolcu extends Sporcu {

    public Futbolcu() {
        super();
    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super();
        setSporcuIsim(sporcuIsim);
        setSporcuTakim(sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    boolean kartDagitildiMi;
    boolean kartKullanildiMi;
    

    public int getPenalti() {
        if (penalti > 0 && penalti <= 100) {
            return penalti;
        } else {
            return 0;
        }
    }

    public void setPenalti(int penalti) {
        if (penalti > 0 && penalti <= 100) {
            this.penalti = penalti;
        }
    }

    public int getSerbestAtis() {
        if (serbestAtis > 0 && serbestAtis <= 100) {
            return serbestAtis;
        } else {
            return 0;
        }
    }

    public void setSerbestAtis(int serbestAtis) {
        if (serbestAtis > 0 && serbestAtis <= 100) {
            this.serbestAtis = serbestAtis;
        }
    }

    public int getKaleciKarsiKarsiya() {
        if (kaleciKarsiKarsiya > 0 && kaleciKarsiKarsiya <= 100) {
            return kaleciKarsiKarsiya;
        } else {
            return 0;
        }
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        if (kaleciKarsiKarsiya > 0 && kaleciKarsiKarsiya <= 100) {
            this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        }
    }

    public boolean isKartDagitildiMi() {
        return kartDagitildiMi;
    }

    public void setKartDagitildiMi(boolean kartDagitildiMi) {
        this.kartDagitildiMi = kartDagitildiMi;
    }
}
