/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
        super();
    }

    public Bilgisayar(String oyuncuID, String oyuncuAdi, int skor) {
        super();
        setOyuncuID(oyuncuID);
        setOyuncuAdi(oyuncuAdi);
        setSkor(skor);
    }

    public void kartSec(String brans, int kullanilan) {

        int numara = (int) (Math.random() * (4-kullanilan)); //secilebilecek kart numarasi sayisi kullanilmis kart sayisi kadar azaltilir.
        this.numara = numara;

        if (brans == "Futbol")
            secilenFutbolcuKarti = futbolcuKartlari.get(numara);
        else if (brans == "Basketbol")
            secilenBasketbolcuKarti = basketbolcuKartlari.get(numara);
    }

}