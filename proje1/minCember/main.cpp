#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <graphics.h>

int permutasyon(int x)
{
    int sonuc=1;
    for(int j=2;j<=x;j++)
        sonuc*=j;
    return sonuc;
}

int kombinasyon(int n , int i)
{
    return permutasyon(n)/(permutasyon(i)*permutasyon(n-i));
}

void bSpline(int x[],int y[],int n)
{

    double xu;
    double yu;


    for (double u=0.0;u<1.0;u+=0.001)
    {
        xu=0;
        yu=0;

        for(int i=0;i<n;i++)
        {
            xu+=kombinasyon(n-1,i)*pow(u,i)*x[i]*pow(1-u,n-i-1);
            yu+=kombinasyon(n-1,i)*pow(u,i)*y[i]*pow(1-u,n-i-1);
        }

        putpixel (500+10.0*xu, 350-10.0*yu, WHITE);
    }
}

double benzerlik(double a1,double b1,double b2)
{
    /* benzer iki ucgende yapilacak 2 oranlamadaki 4 uzunluktan 3'unun bilindigi durumlarda
    dorduncuyu bulmaya yarar. ornegin:
    birinci ucgendeki a1 kenari ile ikinci ucgendeki b1 kenari
    birinci ucgendeki a2 kenari ile ikinci ucgendeki b2 kenari benzerdir varsayalim.
    a1/b1=a2/b2 denkliginden her iki tarafi b2 ile carparsak a2=a1*b2/b1 denkligini elde ederiz.*/

    double a2=a1*b2/b1;

    return a2;
}

double uzunluk(double x1,double y1,int x2,int y2)
{
    return sqrt(pow(x1-x2,2)+pow(y1-y2,2)); //koordinat düzleminde iki nokta arasindaki uzakligi bulmaya yarar.
}

// saga dogru gitmek icin + , yukari dogru gitmek icin -
int main()
{

    initwindow(1000,700,"Windows Text",175,0);
    line(0,350,1000,350); // x ekseni
    line(500,0,500,700); //y ekseni
    char sayi[2];
    settextstyle(SMALL_FONT,HORIZ_DIR,2.5); //yazi boyutunu ayarladik.

    for(int r=-50;r<=50;r++) //-50 den +50 ye yazdirdik.
{
    if(r!=0){
    sprintf(sayi,"%d",r); //sayi dizisinin icine koordinat degerlerini tek tek atadik.
    outtextxy(500+10*r,350+3,sayi); //x koordinat degerlerini yerlestirdik.
    outtextxy(500-10,350-10*r,sayi); //y koordinat degerlerini yerlestirdik.
    line(500+10*r,350+0.8,500+10*r,350-1.2); //x koordinat sistemindeki sayilari belirtir.
    line(500-0.8,350+10*r,500+1.2,350+10*r); //y koordinat sistemindeki sayilari belirtir.
    }
}

    FILE *dosyaptr=fopen("koordinat.txt","r");
    int n=0;
    int p;
    while(!feof(dosyaptr))
    {
        fscanf(dosyaptr,"%d",&p);
        fscanf(dosyaptr,"%d",&p);
        n++;
    }
    fclose(dosyaptr);

    dosyaptr=fopen("koordinat.txt","r");
    int *x=(int*)malloc(n*sizeof(int));
    int *y=(int*)malloc(n*sizeof(int));
    int v=0;
    while(!feof(dosyaptr))
    {
        fscanf(dosyaptr,"%d",&x[v]);
        fscanf(dosyaptr,"%d",&y[v]);
        v++;
    }

    int nokta1,nokta2; //capi olusturan noktalar (koordinat degil, n noktadan kacinci oldugu)
    double x0,y0; //merkez koordinatlari(yaricap koordinatlari)
    double cap; //en kucuk cemberin capi
    double yedekCap; //kontrol amacli cap
    int yedekNokta1,yedekNokta2; //yedek capi olusturan noktalar (koordinat degil, n noktadan kacinci oldugu)
    int sayac=0; //tum noktalar cemberin icinde mi diye kontrol ediyor. sayac==n ise icindedir.
    int nyedek=n; //sayacta esitlik saglanmazsa bir azalarak tekrar donguye sokar.
    int ilkCapiBelirleme=0; //capa atanacak ilk degeri belirlemek icin.
    int sayacKontrol=0;



    while(sayacKontrol==0)
    {

    for(int i=0;i<n;i++) //birinci noktanin kontrolu
    {
        for(int j=i+1;j<n;j++) //ikinci noktanin kontrolu
        {
            yedekCap=uzunluk(x[i]*1.0,y[i]*1.0,x[j]*1.0,y[j]*1.0);
            yedekNokta1=i;
            yedekNokta2=j;

            for(int k=0;k<n;k++)
            {
                if((yedekCap/2.0)>=uzunluk((x[yedekNokta1]+x[yedekNokta2])/2.0,(y[yedekNokta1]+y[yedekNokta2])/2.0,x[k]*1.0,y[k]*1.0))
                {//merkezden cember icerisindeki noktalara olan uzaklýgýn yaricaptan kuçuk esit olmasi lazim.
                    sayac++; //n nokta icin de (yaricap>=noktaya uzaklik) denklemini kontrol etmek amacli.
                }
            }

            if(sayac==nyedek)
            {
                sayacKontrol=1;
                if(ilkCapiBelirleme==0) //daha once cap belirlenmemisse bu blokta belirlenir.
                    {
                        cap=yedekCap;
                        nokta1=i;
                        nokta2=j;
                        ilkCapiBelirleme++;
                    }

                else if(cap>yedekCap) //yeni olusan cap, eski captan kucukse artik yeni cap olur.cunku en kucugu ariyoruz.
                    {
                        cap=yedekCap;
                        nokta1=i;
                        nokta2=j;
                    }
            }
            sayac=0; //yeni cap olusturulurken sayac sifirlanir.
        }
    }
    nyedek--;
    }//while blogunun bitisi

    x0=(x[nokta1]+x[nokta2])/2.0; //merkezin apsisi
    y0=(y[nokta1]+y[nokta2])/2.0; //merkezin ordinati

    int disardaKalan=-1; //disarda kalan noktanin indexini tutar.
    double xx,yy; //cember uzerinde bir noktadir. disarda nokta kalirsa kalan nokta ile birlesip capi olustur.
    double uzaklik,d;

    for(int i=0;i<n;i++) //disarda kalan noktalarin kontrolunu yapar.
    {
        if(uzunluk(x0,y0,x[i]*1.0,y[i]*1.0)>cap/2.0) //noktanin merkeze olan uzakligi yaricaptan buyukse disarda kalmistir.
        {
            disardaKalan=i;
        }
    }


    if(disardaKalan!=-1)
    {
            uzaklik=uzunluk(x[disardaKalan]*1.0,y[disardaKalan]*1.0,x0,y0); //disarda kalan nokta ile merkez arasi uzaklik.
            d=uzaklik-(cap/2.0); //disarda kalan nokta ile cember arasi uzaklik

            xx=x[disardaKalan]-benzerlik(x[disardaKalan]*1.0-x0,uzaklik,uzaklik+(cap/2.0));
            yy=y[disardaKalan]-benzerlik(y[disardaKalan]*1.0-y0,uzaklik,uzaklik+(cap/2.0));
            x0=(x[disardaKalan]+xx)/2.0;
            y0=(y[disardaKalan]+yy)/2.0;
            cap=uzunluk(x[disardaKalan]*1.0,y[disardaKalan]*1.0,xx,yy);

            circle(500+10*x0,350-10*y0,10*cap/2);
    }

    else //disarda kalan deger yoksa yani girdigimiz noktalardan ikisi capi olusturursa
    {
    x0=(x[nokta1]+x[nokta2])/2.0;
    y0=(y[nokta1]+y[nokta2])/2.0;
    circle(500+10.0*x0,350-10.0*y0,10.0*cap/2.0);
    }


    for(int s=0;s<n;s++)
    {
        fillellipse(500+10.0*x[s],350-10.0*y[s],2.5,2.5); //noktalar
    }

    setfillstyle(1,RED);
    fillellipse(500+10.0*x0,350-10.0*y0,4.5,4.5); //merkez

    printf("Yaricap uzunlugu: %f cm",cap/2.0);
    printf("\nMerkez koordinati: (x:%f , y:%f)",x0,y0);

    bSpline(x,y,n);

    getch();
    closegraph();
    fclose(dosyaptr);
    return 0;
}
