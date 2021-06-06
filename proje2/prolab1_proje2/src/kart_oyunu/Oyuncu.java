/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Oyuncu {

    public Oyuncu() {

    }

    public Oyuncu(String oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    private String oyuncuID;
    private String oyuncuAdi;
    private int skor;

    ArrayList<Futbolcu> futbolcuKartlari = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> basketbolcuKartlari = new ArrayList<Basketbolcu>();

    public final void skorGoster(JLabel sonuc) { //mirasci classlarda overrite edilmesin diye "final" seklinde yazilmistir.
        sonuc.setText(Integer.toString(skor)); //gonderilen label icerisine oyuncunun skorunu yazar.
    }

    Futbolcu secilenFutbolcuKarti = new Futbolcu();
    Basketbolcu secilenBasketbolcuKarti = new Basketbolcu();

    public abstract void kartSec(String brans, int num); //kullanici kismi buton ile , bilgisayar kismi suan oldugu gibi otomatik.

    int numara;

    public final void kullanilaniKaldir(String brans, int kullanilan) {

        if (brans == "Futbol") {
            futbolcuKartlari.remove(numara);
        } else if (brans == "Basketbol") {
            basketbolcuKartlari.remove(numara);

        }

    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

}
