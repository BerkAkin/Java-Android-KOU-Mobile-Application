package com.berk.odevberk;

public class akademisyen_gelen_basvurulari_gormek {


    //HANGÝ BÝLGÝLERÝ ÇEKMEK ÝSTÝYORSAK BÝLGÝNÝN VERÝTABANINDAKÝ ÝSMÝYLE BÝREBÝR OLACAK ÞEKÝLDE BÝR DEÐÝÞKEN TANIMLIYORUZ

    private String fakülte ;
    private String TC;
    private String mail;


    // BÝLGÝLER ÝÇÝN CONSTRUCTORLAR - 2. CONSTRUCTOR BOÞ BÝLGÝ DE GELEBÝLÝR HATA OLMAMASI AÇISINDAN VAR

    public akademisyen_gelen_basvurulari_gormek(String fakülte, String TC, String mail) {
        this.fakülte = fakülte;
        this.TC = TC;
        this.mail = mail;
    }
    private akademisyen_gelen_basvurulari_gormek(){
    }

    //DEÐÝÞKENLERÝN GETTER VE SETTER FONKSÝYONLARI

    public String getFakülte() {
        return fakülte;
    }

    public void setFakülte(String fakülte) {
        this.fakülte = fakülte;
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
