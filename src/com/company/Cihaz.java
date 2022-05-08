package com.company;


public class Cihaz implements Iobserver{

    Eyleyici e1=new Eyleyici();


    public void sicaklikGoster() {
        SicaklikAlgilayici s1=new SicaklikAlgilayici();
        System.out.println("Sıcaklık Degeri "+s1.sicaklikOku()+" derecedir.");
    }

    public void sogutucuAc() {

        if(e1.getDurum()){
            System.out.println(e1.sogutucuAcikUyariMesaji());
        }
        else {

            e1.setDurum(true);
            e1.sogutucuAc();
            System.out.println("Sogutucu Acildi...");
        }
    }

    public void sogutucuKapat() {

        if(!e1.getDurum()){
            System.out.println(e1.sogutucuKapaliUyariMesaji());
        }
        else {
            e1.setDurum(false);
            e1.sogutucuKapat();
            System.out.println("Sogutucu Kapatildi...");

        }
    }

    @Override
    public String sogutucuKapaliUyariMesaji() {
        return "Sogutucu Kapali";
    }

    @Override
    public String sogutucuAcikUyariMesaji() {
        return "Sogutucu Acik";
    }

    @Override
    public void DurumMesajı() {

        System.out.println("İslem yapılıyor lutfen bekleyiniz...");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

}
