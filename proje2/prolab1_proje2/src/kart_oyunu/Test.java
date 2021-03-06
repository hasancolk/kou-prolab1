package kart_oyunu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Test extends javax.swing.JFrame {

    int numara;
    int ozellikNo;
    int kullanilanFutbolcuKarti = 0;
    int kullanilanBasketbolcuKarti = 0;
    int futbolcuHamleSayisi = 0;
    int basketbolcuHamleSayisi = 0;
    boolean kartlarGeriAlindiMi = true; //kartlarin beraberlik durumunda "kartlari geri al" butonuna basilip basilmadigini kontrol ediyor.
    ArrayList<JButton> buton = new ArrayList<JButton>();
    ArrayList<JLabel> label = new ArrayList<JLabel>();

    public Test() {

        initComponents();
        panel2.setVisible(false);
        berabere.setVisible(false);
        berabereSon.setVisible(false);

        Futbolcu ronaldo = new Futbolcu("Cristiano Ronaldo", "Juventus", 94, 80, 96);
        Futbolcu messi = new Futbolcu("Lionel Messi", "Barcelona", 91, 92, 93);
        Futbolcu ibrahimovic = new Futbolcu("Zlatan Ibrahimovic", "Milan", 85, 69, 90);
        Futbolcu lewandowski = new Futbolcu("Robert Lewandowski", "Bayern Munih", 86, 68, 92);
        Futbolcu bale = new Futbolcu("Gareth Bale", "Tottenham", 90, 78, 85);
        Futbolcu modric = new Futbolcu("Luka Modric", "Real Madrid", 86, 78, 72);
        Futbolcu falcao = new Futbolcu("Radamel Falcao", "Galatasaray", 84, 68, 83);
        Futbolcu burak = new Futbolcu("Burak Yilmaz", "Lille", 84, 70, 81);
        

        ArrayList<Futbolcu> futbolcuKartlari = new ArrayList<Futbolcu>();
        futbolcuKartlari.add(0, ronaldo);
        futbolcuKartlari.add(1, messi);
        futbolcuKartlari.add(2, ibrahimovic);
        futbolcuKartlari.add(3, lewandowski);
        futbolcuKartlari.add(4, bale);
        futbolcuKartlari.add(5, modric);
        futbolcuKartlari.add(6, falcao);
        futbolcuKartlari.add(7, burak);

        Basketbolcu vesely = new Basketbolcu("Jan Vesely", "Fenerbahce", 91, 50, 60);
        Basketbolcu dixon = new Basketbolcu("Bobby Dixon", "Fenerbahce", 80, 90, 89);
        Basketbolcu bogdanovic = new Basketbolcu("Bogdan Bogdanovic", "Sacramento Kings", 87, 89, 85);
        Basketbolcu datome = new Basketbolcu("Luigi Datome", "Olimpia Milano", 87, 88, 87);
        Basketbolcu larkin = new Basketbolcu("Shane Larkin", "Anadolu Efes", 90, 89, 92);
        Basketbolcu deColo = new Basketbolcu("Nando de Colo", "Fenerbahce", 92, 85, 90);
        Basketbolcu udoh = new Basketbolcu("Ekpe Udoh", "Beijing Ducks", 93, 72, 81);
        Basketbolcu sloukas = new Basketbolcu("Kostas Sloukas", "Olympiacos", 81, 84, 85);

        ArrayList<Basketbolcu> basketbolcuKartlari = new ArrayList<Basketbolcu>();
        basketbolcuKartlari.add(0, vesely);
        basketbolcuKartlari.add(1, dixon);
        basketbolcuKartlari.add(2, bogdanovic);
        basketbolcuKartlari.add(3, datome);
        basketbolcuKartlari.add(4, larkin);
        basketbolcuKartlari.add(5, deColo);
        basketbolcuKartlari.add(6, udoh);
        basketbolcuKartlari.add(7, sloukas);

        ImageIcon foto1 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\1-ronaldo.jpg");
        ImageIcon foto2 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\2-messi.jpg");
        ImageIcon foto3 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\3-ibra.jpg");
        ImageIcon foto4 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\4-lewa.jpg");
        ImageIcon foto5 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\5-bale.jpg");
        ImageIcon foto6 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\6-modric.jpg");
        ImageIcon foto7 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\7-falcao.jpg");
        ImageIcon foto8 = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\8-burak.jpg");
        ImageIcon foto9 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\01-vesely.jpg");
        ImageIcon foto10 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\02-dixon.jpg");
        ImageIcon foto11 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\03-bogdanovic.jpg");
        ImageIcon foto12 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\04-datome.jpg");
        ImageIcon foto13 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\05-larkin.jpg");
        ImageIcon foto14 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\06-deColo.jpg");
        ImageIcon foto15 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\07-udoh.jpg");
        ImageIcon foto16 = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\08-sloukas.jpg");
        ImageIcon futbolcuTers = new ImageIcon("src\\kart_oyunu\\futbolcu_kartlari\\futbolcu_ters.jpg");
        ImageIcon basketbolcuTers = new ImageIcon("src\\kart_oyunu\\basketbolcu_kartlari\\basketbolcu_ters.jpg");

        futbolcuKartlari.get(0).setFotograf(foto1);
        futbolcuKartlari.get(1).setFotograf(foto2);
        futbolcuKartlari.get(2).setFotograf(foto3);
        futbolcuKartlari.get(3).setFotograf(foto4);
        futbolcuKartlari.get(4).setFotograf(foto5);
        futbolcuKartlari.get(5).setFotograf(foto6);
        futbolcuKartlari.get(6).setFotograf(foto7);
        futbolcuKartlari.get(7).setFotograf(foto8);
        basketbolcuKartlari.get(0).setFotograf(foto9);
        basketbolcuKartlari.get(1).setFotograf(foto10);
        basketbolcuKartlari.get(2).setFotograf(foto11);
        basketbolcuKartlari.get(3).setFotograf(foto12);
        basketbolcuKartlari.get(4).setFotograf(foto13);
        basketbolcuKartlari.get(5).setFotograf(foto14);
        basketbolcuKartlari.get(6).setFotograf(foto15);
        basketbolcuKartlari.get(7).setFotograf(foto16);

        buton.add(0, kullanici0);
        buton.add(1, kullanici1);
        buton.add(2, kullanici2);
        buton.add(3, kullanici3);
        buton.add(4, kullanici4);
        buton.add(5, kullanici5);
        buton.add(6, kullanici6);
        buton.add(7, kullanici7);

        label.add(0, bilgisayar0);
        label.add(1, bilgisayar1);
        label.add(2, bilgisayar2);
        label.add(3, bilgisayar3);
        label.add(4, bilgisayar4);
        label.add(5, bilgisayar5);
        label.add(6, bilgisayar6);
        label.add(7, bilgisayar7);

        Bilgisayar bilgisayar = new Bilgisayar("Bilgisayar", "Bilgisayar", 0);
        Kullan??c?? kullanici = new Kullan??c??("hasancolak99", "Hasan", 0);

        int sayi;
        int kullaniciIndex = 0;
        int bilgisayarIndex = 0;

        while (kullaniciIndex != 4 || bilgisayarIndex != 4) //futbolcu kartlarinin dagitimi
        {
            sayi = (int) (Math.random() * 8);
            if (bilgisayarIndex != 4 && futbolcuKartlari.get(sayi).kartDagitildiMi == false) //bilgisayara kart dagitimi
            {
                bilgisayar.futbolcuKartlari.add(bilgisayarIndex, futbolcuKartlari.get(sayi));
                label.get(bilgisayarIndex).setIcon(futbolcuTers); //bilgisayarin kartlari kullaniciya gozukmeyeceginden ters koyduk.
                futbolcuKartlari.get(sayi).kartDagitildiMi = true;
                bilgisayarIndex++;
            }

            sayi = (int) (Math.random() * 8);
            if (kullaniciIndex != 4 && futbolcuKartlari.get(sayi).kartDagitildiMi == false) //kullaniciya kart dagitimi
            {
                kullanici.futbolcuKartlari.add(kullaniciIndex, futbolcuKartlari.get(sayi));
                buton.get(kullaniciIndex).setIcon(futbolcuKartlari.get(sayi).getFotograf());
                futbolcuKartlari.get(sayi).kartDagitildiMi = true;
                kullaniciIndex++;
            }
        }

        while (kullaniciIndex != 8 || bilgisayarIndex != 8) //basketbolcu kartlarinin dagitimi
        {
            sayi = (int) (Math.random() * 8);
            if (bilgisayarIndex != 8 && basketbolcuKartlari.get(sayi).kartDagitildiMi == false) //bilgisayara kart dagitimi
            {
                bilgisayar.basketbolcuKartlari.add(bilgisayarIndex - 4, basketbolcuKartlari.get(sayi));
                label.get(bilgisayarIndex).setIcon(basketbolcuTers); //bilgisayarin kartlari kullaniciya gozukmeyeceginden ters koyduk.
                basketbolcuKartlari.get(sayi).kartDagitildiMi = true;
                bilgisayarIndex++;
            }

            sayi = (int) (Math.random() * 8);
            if (kullaniciIndex != 8 && basketbolcuKartlari.get(sayi).kartDagitildiMi == false) //kullaniciya kart dagitimi
            {
                kullanici.basketbolcuKartlari.add(kullaniciIndex - 4, basketbolcuKartlari.get(sayi));
                buton.get(kullaniciIndex).setIcon(basketbolcuKartlari.get(sayi).getFotograf());
                basketbolcuKartlari.get(sayi).kartDagitildiMi = true;
                kullaniciIndex++;
            }
        }

        kullanici0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi || kullanilanBasketbolcuKarti == 4) && kartlarGeriAlindiMi == true) { //basketbolcu kartlari bittiyse
                    numara = 0;
                    kullanici.kartSec("Futbol", numara);
                    secilen1.setIcon(kullanici.secilenFutbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Futbol", kullanilanFutbolcuKarti); //secilebilecek kart numarasindan kullanilmis kart kadar azaltilir.
                    secilen2.setIcon(bilgisayar.secilenFutbolcuKarti.getFotograf());
                    kullanici0.setVisible(false);
                    bilgisayar0.setVisible(false);
                    futbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    futbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlari geri almadan secim yapamazsiniz!!!"); //berabere kalindiginda "kartlari geri al" butonuna basmadan yeniden kart se??mek istenildi??inde uyar?? verir.
                } else {
                    JOptionPane.showMessageDialog(null, "Basketbolcu karti seciniz...");
                }
            }
        });
        kullanici1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi || kullanilanBasketbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 1;
                    kullanici.kartSec("Futbol", numara);
                    secilen1.setIcon(kullanici.secilenFutbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Futbol", kullanilanFutbolcuKarti); //secilebilecek kart numarasindan kullanilmis kart kadar azaltilir.
                    secilen2.setIcon(bilgisayar.secilenFutbolcuKarti.getFotograf());
                    kullanici1.setVisible(false);
                    bilgisayar1.setVisible(false);
                    futbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    futbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlari geri almadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Basketbolcu karti seciniz...");
                }
            }
        });
        kullanici2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi || kullanilanBasketbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 2;
                    kullanici.kartSec("Futbol", numara);
                    secilen1.setIcon(kullanici.secilenFutbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Futbol", kullanilanFutbolcuKarti); //secilebilecek kart numarasindan kullanilmis kart kadar azaltilir.
                    secilen2.setIcon(bilgisayar.secilenFutbolcuKarti.getFotograf());
                    kullanici2.setVisible(false);
                    bilgisayar2.setVisible(false);
                    futbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    futbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlari geri almadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Basketbolcu karti seciniz...");
                }
            }
        });
        kullanici3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi || kullanilanBasketbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 3;
                    kullanici.kartSec("Futbol", numara);
                    secilen1.setIcon(kullanici.secilenFutbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Futbol", kullanilanFutbolcuKarti); //secilebilecek kart numarasindan kullanilmis kart kadar azaltilir.
                    secilen2.setIcon(bilgisayar.secilenFutbolcuKarti.getFotograf());
                    kullanici3.setVisible(false);
                    bilgisayar3.setVisible(false);
                    futbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    futbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlari geri almadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Basketbolcu karti seciniz...");
                }
            }
        });
        kullanici4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi + 1 || kullanilanFutbolcuKarti == 4) && kartlarGeriAlindiMi == true) { //futbolcu kartlari bittiyse
                    numara = 4;
                    kullanici.kartSec("Basketbol", numara);
                    secilen1.setIcon(kullanici.secilenBasketbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Basketbol", kullanilanBasketbolcuKarti);
                    secilen2.setIcon(bilgisayar.secilenBasketbolcuKarti.getFotograf());
                    kullanici4.setVisible(false);
                    bilgisayar4.setVisible(false);
                    basketbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    basketbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlar geri alinmadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Futbolcu karti seciniz...");
                }

            }
        });
        kullanici5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi + 1 || kullanilanFutbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 5;
                    kullanici.kartSec("Basketbol", numara);
                    secilen1.setIcon(kullanici.secilenBasketbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Basketbol", kullanilanBasketbolcuKarti);
                    secilen2.setIcon(bilgisayar.secilenBasketbolcuKarti.getFotograf());
                    kullanici5.setVisible(false);
                    bilgisayar5.setVisible(false);
                    basketbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    basketbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlar geri alinmadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Futbolcu karti seciniz...");
                }
            }
        });
        kullanici6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi + 1 || kullanilanFutbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 6;
                    kullanici.kartSec("Basketbol", numara);
                    secilen1.setIcon(kullanici.secilenBasketbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Basketbol", kullanilanBasketbolcuKarti);
                    secilen2.setIcon(bilgisayar.secilenBasketbolcuKarti.getFotograf());
                    kullanici6.setVisible(false);
                    bilgisayar6.setVisible(false);
                    basketbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    basketbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlar geri alinmadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Futbolcu karti seciniz...");
                }
            }

        });
        kullanici7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((futbolcuHamleSayisi == basketbolcuHamleSayisi + 1 || kullanilanFutbolcuKarti == 4) && kartlarGeriAlindiMi == true) {
                    numara = 7;
                    kullanici.kartSec("Basketbol", numara);
                    secilen1.setIcon(kullanici.secilenBasketbolcuKarti.getFotograf());
                    bilgisayar.kartSec("Basketbol", kullanilanBasketbolcuKarti);
                    secilen2.setIcon(bilgisayar.secilenBasketbolcuKarti.getFotograf());
                    kullanici7.setVisible(false);
                    bilgisayar7.setVisible(false);
                    basketbolcuKarsilastir(kullanici, bilgisayar);
                    panel2.setVisible(true);
                    sonucuAcikla(kullanici, bilgisayar); //kartlar bittiginde calisir.
                    basketbolcuHamleSayisi++;
                } else if (kartlarGeriAlindiMi == false) {
                    JOptionPane.showMessageDialog(null, "Kartlar geri alinmadan secim yapamazsiniz!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Futbolcu karti seciniz...");
                }
            }
        });
        berabere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numara == 0) {
                    kullanici0.setVisible(true);
                    bilgisayar0.setVisible(true);
                } else if (numara == 1) {
                    kullanici1.setVisible(true);
                    bilgisayar1.setVisible(true);
                } else if (numara == 2) {
                    kullanici2.setVisible(true);
                    bilgisayar2.setVisible(true);
                } else if (numara == 3) {
                    kullanici3.setVisible(true);
                    bilgisayar3.setVisible(true);
                } else if (numara == 4) {
                    kullanici4.setVisible(true);
                    bilgisayar4.setVisible(true);
                } else if (numara == 5) {
                    kullanici5.setVisible(true);
                    bilgisayar5.setVisible(true);
                } else if (numara == 6) {
                    kullanici6.setVisible(true);
                    bilgisayar6.setVisible(true);
                } else if (numara == 7) {
                    kullanici7.setVisible(true);
                    bilgisayar7.setVisible(true);
                }

                secilen1.setIcon(futbolcuTers);
                secilen2.setIcon(futbolcuTers);
                berabere.setVisible(false);
                panel2.setVisible(false);
                kartlarGeriAlindiMi = true;
            }
        });
        berabereSon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kullanilanFutbolcuKarti == 3 && kullanilanBasketbolcuKarti == 4) {
                    futbolcuKarsilastir(kullanici, bilgisayar);
                    if (kullanilanFutbolcuKarti == 4) { //futbolcu karti bitince "tekrar karsilastir" butonunu kaldir.
                        berabereSon.setVisible(false);
                    }
                    sonucuAcikla(kullanici, bilgisayar);
                } else if (kullanilanBasketbolcuKarti == 3 && kullanilanFutbolcuKarti == 4) {
                    basketbolcuKarsilastir(kullanici, bilgisayar);
                    if (kullanilanBasketbolcuKarti == 4) { //basketbolcu karti bitince "tekrar karsilastir" butonunu kaldir.
                        berabereSon.setVisible(false);
                    }
                    sonucuAcikla(kullanici, bilgisayar);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        kullanici2 = new javax.swing.JButton();
        kullanici3 = new javax.swing.JButton();
        kullanici1 = new javax.swing.JButton();
        kullanici5 = new javax.swing.JButton();
        kullanici6 = new javax.swing.JButton();
        kullanici7 = new javax.swing.JButton();
        kullanici4 = new javax.swing.JButton();
        bilgisayar3 = new javax.swing.JLabel();
        bilgisayar0 = new javax.swing.JLabel();
        bilgisayar2 = new javax.swing.JLabel();
        bilgisayar1 = new javax.swing.JLabel();
        bilgisayar5 = new javax.swing.JLabel();
        bilgisayar6 = new javax.swing.JLabel();
        bilgisayar4 = new javax.swing.JLabel();
        bilgisayar7 = new javax.swing.JLabel();
        secilen2 = new javax.swing.JLabel();
        secilen1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_ozellik = new javax.swing.JLabel();
        label_secilen1 = new javax.swing.JLabel();
        label_puan1 = new javax.swing.JLabel();
        label_secilen2 = new javax.swing.JLabel();
        label_puan2 = new javax.swing.JLabel();
        label_kazanan = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_skor1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label_skor2 = new javax.swing.JLabel();
        kullanici0 = new javax.swing.JButton();
        berabere = new javax.swing.JButton();
        berabereSon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(kullanici2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 498, 122, 191));
        panel1.add(kullanici3, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 498, 122, 191));
        panel1.add(kullanici1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 498, 122, 191));
        panel1.add(kullanici5, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 498, 122, 191));
        panel1.add(kullanici6, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 498, 122, 191));
        panel1.add(kullanici7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 498, 122, 191));
        panel1.add(kullanici4, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 498, 122, 191));

        bilgisayar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/futbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 11, -1, -1));

        bilgisayar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/futbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/futbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 11, -1, -1));

        bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/futbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 11, -1, -1));

        bilgisayar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/basketbolcu_kartlari/basketbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 11, -1, -1));

        bilgisayar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/basketbolcu_kartlari/basketbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 11, -1, -1));

        bilgisayar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/basketbolcu_kartlari/basketbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 11, -1, -1));

        bilgisayar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/basketbolcu_kartlari/basketbolcu_ters.jpg"))); // NOI18N
        panel1.add(bilgisayar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 11, -1, -1));

        secilen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/bos.jpg"))); // NOI18N
        panel1.add(secilen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 232, -1, -1));

        secilen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kart_oyunu/futbolcu_kartlari/bos.jpg"))); // NOI18N
        panel1.add(secilen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 232, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("KULLANICI");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 434, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("B??LG??SAYAR");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 434, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("KAR??ILA??TIRILACAK ??ZELL??K : ");

        label_ozellik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_ozellik.setText("jLabel1");

        label_secilen1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_secilen1.setText("Sporcu 1");

        label_puan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_puan1.setText("Puan");

        label_secilen2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_secilen2.setText("Sporcu 2");

        label_puan2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_puan2.setText("Puan");

        label_kazanan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        label_kazanan.setText("KAZANAN");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_kazanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_secilen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_secilen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_puan1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_puan2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))
                        .addContainerGap())
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_ozellik, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_ozellik))
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_secilen1)
                    .addComponent(label_puan1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_secilen2)
                    .addComponent(label_puan2))
                .addGap(26, 26, 26)
                .addComponent(label_kazanan)
                .addGap(20, 20, 20))
        );

        jLabel6.getAccessibleContext().setAccessibleParent(panel2);

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 240, -1, 140));
        panel2.getAccessibleContext().setAccessibleParent(this);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("SKORLAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("KULLANICI");

        label_skor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_skor1.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("B??LG??SAYAR");

        label_skor2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_skor2.setText("0");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_skor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_skor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_skor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(label_skor2))
                .addGap(26, 26, 26))
        );

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 210, 140));
        panel3.getAccessibleContext().setAccessibleDescription("");
        panel3.getAccessibleContext().setAccessibleParent(this);

        panel1.add(kullanici0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 498, 122, 191));

        berabere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        berabere.setText("KARTLARI GER?? AL");
        panel1.add(berabere, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 220, -1));

        berabereSon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        berabereSon.setText("TEKRAR KAR??ILA??TIR");
        panel1.add(berabereSon, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 420, 220, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int ozellikSec(Oyuncu oyuncu, int ozellik) { //oyuncunun secilen ozellikteki puanini donderir.
        if (ozellik == 0) {
            return oyuncu.secilenFutbolcuKarti.getPenalti();
        } else if (ozellik == 1) {
            return oyuncu.secilenFutbolcuKarti.getSerbestAtis();
        } else if (ozellik == 2) {
            return oyuncu.secilenFutbolcuKarti.getKaleciKarsiKarsiya();
        } else if (ozellik == 3) {
            return oyuncu.secilenBasketbolcuKarti.getIkilik();
        } else if (ozellik == 4) {
            return oyuncu.secilenBasketbolcuKarti.getUcluk();
        } else if (ozellik == 5) {
            return oyuncu.secilenBasketbolcuKarti.getSerbestAtis();
        } else {
            return 0;
        }
    }

    public void futbolcuKarsilastir(Kullan??c?? kullanici, Bilgisayar bilgisayar) {
        ozellikNo = (int) (Math.random() * 3); //0,1,2 degerleri futbolcular icin ; 3,4,5 degerleri basketbolcular icin.

        karsilastirilacakOzellik(ozellikNo); //ekrana hangi ozelligin karsilastirilacagini yazar.
        label_secilen1.setText(kullanici.secilenFutbolcuKarti.getSporcuIsim());
        label_secilen2.setText(bilgisayar.secilenFutbolcuKarti.getSporcuIsim());
        label_puan1.setText(Integer.toString(ozellikSec(kullanici, ozellikNo))); //ekrana karsilastirilan ozelligin puanini yazar. 
        label_puan2.setText(Integer.toString(ozellikSec(bilgisayar, ozellikNo)));

        if (ozellikSec(kullanici, ozellikNo) > ozellikSec(bilgisayar, ozellikNo)) {
            //kullanici.skor += 10;
            kullanici.setSkor(kullanici.getSkor() + 10);
            label_kazanan.setText("KULLANICININ KARTI KAZANDI");
            bilgisayar.kullanilaniKaldir("Futbol", 0);
            kullanilanFutbolcuKarti++;
        } else if (ozellikSec(bilgisayar, ozellikNo) > ozellikSec(kullanici, ozellikNo)) {
            //bilgisayar.skor += 10;
            bilgisayar.setSkor(bilgisayar.getSkor() + 10);
            label_kazanan.setText("B??LG??SAYARIN KARTI KAZANDI");
            bilgisayar.kullanilaniKaldir("Futbol", 0);
            kullanilanFutbolcuKarti++;
        } else {
            label_kazanan.setText("KARTLAR BERABERE KALDI");
            if ((kullanilanBasketbolcuKarti == 3 && kullanilanFutbolcuKarti == 4) || (kullanilanBasketbolcuKarti == 4 && kullanilanFutbolcuKarti == 3)) //berabere kalan kartlar son kart ise
            {
                berabereSon.setVisible(true);
            } else { //son kart harici beraberlik durumlarinda
                kartlarGeriAlindiMi = false;
                berabere.setVisible(true);
            }
        }
        kullanici.skorGoster(label_skor1);
        bilgisayar.skorGoster(label_skor2);
    }

    public void basketbolcuKarsilastir(Kullan??c?? kullanici, Bilgisayar bilgisayar) {
        ozellikNo = (int) (3 + Math.random() * 3);

        karsilastirilacakOzellik(ozellikNo); //ekrana hangi ozelligin karsilastirilacagini yazar.
        label_secilen1.setText(kullanici.secilenBasketbolcuKarti.getSporcuIsim());
        label_secilen2.setText(bilgisayar.secilenBasketbolcuKarti.getSporcuIsim());
        label_puan1.setText(Integer.toString(ozellikSec(kullanici, ozellikNo))); //ekrana karsilastirilan ozelligin puanini yazar.
        label_puan2.setText(Integer.toString(ozellikSec(bilgisayar, ozellikNo)));

        if (ozellikSec(kullanici, ozellikNo) > ozellikSec(bilgisayar, ozellikNo)) {
            //kullanici.skor += 10;
            kullanici.setSkor(kullanici.getSkor() + 10);
            label_kazanan.setText("KULLANICININ KARTI KAZANDI");
            bilgisayar.kullanilaniKaldir("Basketbol", kullanilanFutbolcuKarti);
            kullanilanBasketbolcuKarti++;
        } else if (ozellikSec(bilgisayar, ozellikNo) > ozellikSec(kullanici, ozellikNo)) {
            //bilgisayar.skor += 10;
            bilgisayar.setSkor(bilgisayar.getSkor() + 10);
            label_kazanan.setText("B??LG??SAYARIN KARTI KAZANDI");
            bilgisayar.kullanilaniKaldir("Basketbol", kullanilanFutbolcuKarti);
            kullanilanBasketbolcuKarti++;
        } else {
            label_kazanan.setText("KARTLAR BERABERE KALDI");
            if ((kullanilanBasketbolcuKarti == 3 && kullanilanFutbolcuKarti == 4) || (kullanilanBasketbolcuKarti == 4 && kullanilanFutbolcuKarti == 3)) //berabere kalan kartlar son kart ise
            {
                berabereSon.setVisible(true);
            } else { //son kart harici beraberlik durumlarinda
                kartlarGeriAlindiMi = false;
                berabere.setVisible(true);
            }
        }
        kullanici.skorGoster(label_skor1);
        bilgisayar.skorGoster(label_skor2);
    }

    public void karsilastirilacakOzellik(int ozellik) { // secilen kartlarin hangi ozelliklerinin karsilastirilacagin?? ekrana yazar..
        if (ozellik == 0) {
            label_ozellik.setText("PENALTI");
        } else if (ozellik == 1) {
            label_ozellik.setText("SERBEST ATI??");
        } else if (ozellik == 2) {
            label_ozellik.setText("KAR??I KAR??IYA");
        } else if (ozellik == 3) {
            label_ozellik.setText("??K??L??K");
        } else if (ozellik == 4) {
            label_ozellik.setText("????L??K");
        } else if (ozellik == 5) {
            label_ozellik.setText("SERBEST ATI??");
        }
    }

    public void sonucuAcikla(Kullan??c?? kullanici, Bilgisayar bilgisayar) {
        if (kullanilanFutbolcuKarti == 4 && kullanilanBasketbolcuKarti == 4) {
            if (kullanici.getSkor() > bilgisayar.getSkor()) {
                JOptionPane.showMessageDialog(null, "TEBR??KLER OYUNU KAZANDINIZ!!!");
            } else if (bilgisayar.getSkor() > kullanici.getSkor()) {
                JOptionPane.showMessageDialog(null, "MAALESEF OYUNU KAYBETT??N??Z!!!");
            } else {
                JOptionPane.showMessageDialog(null, "OYUN BERABERE SONU??LANDI...");
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton berabere;
    private javax.swing.JButton berabereSon;
    private javax.swing.JLabel bilgisayar0;
    private javax.swing.JLabel bilgisayar1;
    private javax.swing.JLabel bilgisayar2;
    private javax.swing.JLabel bilgisayar3;
    private javax.swing.JLabel bilgisayar4;
    private javax.swing.JLabel bilgisayar5;
    private javax.swing.JLabel bilgisayar6;
    private javax.swing.JLabel bilgisayar7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton kullanici0;
    private javax.swing.JButton kullanici1;
    private javax.swing.JButton kullanici2;
    private javax.swing.JButton kullanici3;
    private javax.swing.JButton kullanici4;
    private javax.swing.JButton kullanici5;
    private javax.swing.JButton kullanici6;
    private javax.swing.JButton kullanici7;
    private javax.swing.JLabel label_kazanan;
    private javax.swing.JLabel label_ozellik;
    private javax.swing.JLabel label_puan1;
    private javax.swing.JLabel label_puan2;
    private javax.swing.JLabel label_secilen1;
    private javax.swing.JLabel label_secilen2;
    private javax.swing.JLabel label_skor1;
    private javax.swing.JLabel label_skor2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JLabel secilen1;
    private javax.swing.JLabel secilen2;
    // End of variables declaration//GEN-END:variables
}
