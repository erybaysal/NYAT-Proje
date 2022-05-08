package com.company;

import java.util.Scanner;

public class AgArayüzü implements IagArayuzu,Ivarlik {

    Cihaz cihaz=new Cihaz();

    @Override
    public void cihazBaslat() {

        boolean flag=true;

        while (flag){
            VeriAl();
            boolean kontrol=VtKontrol();

            if(kontrol) {
                cihaz.DurumMesajı();
                flag=false;
            }
            else {
                System.out.println("Hatali giris yaptiniz...");
            }
        }

        while (true){
            menuGoster();
            islemler();

        }

    }

    @Override
    public boolean VtKontrol() {
        veritabani v1=new veritabani();
        boolean kontrol=v1.Kontrol(kullanici.getIsim(),kullanici.getSifre());

        return kontrol;

    }

    @Override
    public void VeriAl() {
        Scanner sns=new Scanner(System.in);
        kullanici admin=new kullanici();

        System.out.println("isim giriniz...:");
        String isim=sns.nextLine();
        admin.setIsim(isim);

        System.out.println("Sifre giriniz...:");
        String sifre=sns.nextLine();
        admin.setSifre(sifre);
    }

    @Override
    public void menuGoster() {
        menu.menuGoster();
    }

    @Override
    public void islemler() {

        Scanner sns=new Scanner(System.in);
        int secenek=sns.nextInt();

        switch (secenek){
            case 1:
                cihaz.DurumMesajı();
                cihaz.sogutucuAc();
            break;

            case 2:
                cihaz.DurumMesajı();
                cihaz.sogutucuKapat();

                break;

            case 3:
                cihaz.DurumMesajı();
                cihaz.sicaklikGoster();

                break;

            case 4:

                System.exit(1);

            break;

        }
    }
}
