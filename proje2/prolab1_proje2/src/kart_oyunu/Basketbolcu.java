/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

public class Basketbolcu extends Sporcu {

    public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis) {
        super();
        setSporcuIsim(sporcuIsim);
        setSporcuTakim(sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public Basketbolcu() {
        super();
    }

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    boolean kartDagitildiMi;
    boolean kartKullanildiMi;


    public int getIkilik() {
        if (ikilik > 0 && ikilik <= 100) {
            return ikilik;
        } else {
            return 0;
        }
    }

    public void setIkilik(int ikilik) {
        if (ikilik > 0 && ikilik <= 100) {
            this.ikilik = ikilik;
        }
    }

    public int getUcluk() {
        if (ucluk > 0 && ucluk <= 100) {
            return ucluk;
        } else {
            return 0;
        }
    }

    public void setUcluk(int ucluk) {
        if (ucluk > 0 && ucluk <= 100) {
            this.ucluk = ucluk;
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

    public boolean isKartDagitildiMi() {
        return kartDagitildiMi;
    }

    public void setKartDagitildiMi(boolean kartDagitildiMi) {
        this.kartDagitildiMi = kartDagitildiMi;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
}
