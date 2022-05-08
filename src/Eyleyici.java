package com.company;


public class Eyleyici implements Iobserver{

    private boolean durum=false;


    public void sogutucuAc(){
        System.out.println("Sogutucu Aciliyor...");
        durum=true;
    }

    public void sogutucuKapat(){
        System.out.println("Sogutucu Kapaniyor...");

        durum= false;
    }

    public void setDurum(boolean Durum){
        this.durum=Durum;
    }

    public boolean getDurum(){
        return durum;
    }

    @Override
    public String sogutucuKapaliUyariMesaji( ) {
        return "Sogutucu  zaten kapatildi...";
    }


    @Override
    public String sogutucuAcikUyariMesaji( ) {
        return  "Sogutucu  zaten Acildi...";
    }

    @Override
    public void  DurumMesajı() {

    }


}
