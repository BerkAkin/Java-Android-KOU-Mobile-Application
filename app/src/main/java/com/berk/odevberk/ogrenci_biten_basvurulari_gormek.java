package com.berk.odevberk;

public class ogrenci_biten_basvurulari_gormek {
    //HANG� B�LG�LER� �EKMEK �ST�YORSAK B�LG�N�N VER�TABANINDAK� �SM�YLE B�REB�R OLACAK �EK�LDE B�R DE���KEN TANIMLIYORUZ

    private String adres ;
    private String TC;
    private String mail;


    // B�LG�LER ���N CONSTRUCTORLAR - 2. CONSTRUCTOR BO� B�LG� DE GELEB�L�R HATA OLMAMASI A�ISINDAN VAR

    public ogrenci_biten_basvurulari_gormek(String adres, String TC, String mail) {
        this.adres = adres;
        this.TC = TC;
        this.mail = mail;
    }
    private ogrenci_biten_basvurulari_gormek(){
    }

    //DE���KENLER�N GETTER VE SETTER FONKS�YONLARI

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
