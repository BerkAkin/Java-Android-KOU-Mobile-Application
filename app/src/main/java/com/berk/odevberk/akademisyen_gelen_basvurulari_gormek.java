package com.berk.odevberk;

public class akademisyen_gelen_basvurulari_gormek {


    //HANG� B�LG�LER� �EKMEK �ST�YORSAK B�LG�N�N VER�TABANINDAK� �SM�YLE B�REB�R OLACAK �EK�LDE B�R DE���KEN TANIMLIYORUZ

    private String fak�lte ;
    private String TC;
    private String mail;


    // B�LG�LER ���N CONSTRUCTORLAR - 2. CONSTRUCTOR BO� B�LG� DE GELEB�L�R HATA OLMAMASI A�ISINDAN VAR

    public akademisyen_gelen_basvurulari_gormek(String fak�lte, String TC, String mail) {
        this.fak�lte = fak�lte;
        this.TC = TC;
        this.mail = mail;
    }
    private akademisyen_gelen_basvurulari_gormek(){
    }

    //DE���KENLER�N GETTER VE SETTER FONKS�YONLARI

    public String getFak�lte() {
        return fak�lte;
    }

    public void setFak�lte(String fak�lte) {
        this.fak�lte = fak�lte;
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
