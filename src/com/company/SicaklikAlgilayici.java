package com.company;

import java.util.Random;

public class SicaklikAlgilayici implements IsicaklikAlgilayici{

    private Random rnd = new Random();
    private int sicaklik;

    public SicaklikAlgilayici()
    {
         sicaklik = rnd.nextInt(30);
    }

    public int sicaklikOku()
    {
        return sicaklik;
    }


}
