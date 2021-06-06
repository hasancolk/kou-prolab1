/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kart_oyunu;

import java.util.ArrayList;

public class Kullanıcı extends Oyuncu {

    public Kullanıcı() {
        super();
    }

    public Kullanıcı(String oyuncuID, String oyuncuAdi, int skor) {
        super();
        setOyuncuID(oyuncuID);
        setOyuncuAdi(oyuncuAdi);
        setSkor(skor);
    }

    public void kartSec(String brans, int numara) {

        this.numara = numara;

        if (brans == "Futbol")
            secilenFutbolcuKarti = futbolcuKartlari.get(numara);
        else if (brans == "Basketbol")
            secilenBasketbolcuKarti = basketbolcuKartlari.get(numara-4);
    }
}
