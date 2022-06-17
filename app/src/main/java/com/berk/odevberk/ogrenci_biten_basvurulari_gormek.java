package com.berk.odevberk;

public class ogrenci_biten_basvurulari_gormek {
    //HANGÝ BÝLGÝLERÝ ÇEKMEK ÝSTÝYORSAK BÝLGÝNÝN VERÝTABANINDAKÝ ÝSMÝYLE BÝREBÝR OLACAK ÞEKÝLDE BÝR DEÐÝÞKEN TANIMLIYORUZ

    private String adres ;
    private String TC;
    private String mail;


    // BÝLGÝLER ÝÇÝN CONSTRUCTORLAR - 2. CONSTRUCTOR BOÞ BÝLGÝ DE GELEBÝLÝR HATA OLMAMASI AÇISINDAN VAR

    public ogrenci_biten_basvurulari_gormek(String adres, String TC, String mail) {
        this.adres = adres;
        this.TC = TC;
        this.mail = mail;
    }
    private ogrenci_biten_basvurulari_gormek(){
    }

    //DEÐÝÞKENLERÝN GETTER VE SETTER FONKSÝYONLARI

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
