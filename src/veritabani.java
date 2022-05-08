package com.company;

import java.sql.*;

public class veritabani implements IveriTabani{

    @Override
    public Connection Baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proje",
                    "postgres", "1234");


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("baglanti basarisiz");
        }
        return conn;
    }

    @Override
    public boolean Kontrol(String KullaniciAdi , String Sifre)
        {
            String sql= "SELECT * FROM \"public\".\"Kullaniciler\"";
            String isim = "";
            String sifre = "";

            Connection conn=this.Baglan();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                conn.close();

                while(rs.next())
                {
                    isim = rs.getString("isim");
                    sifre = rs.getString("sifre");
                    if(isim.equals(KullaniciAdi) && sifre.equals(Sifre)){
                        System.out.println("baglanti basarili");
                        return true;
                    }
                }
                rs.close();
                stmt.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;

    }
}
