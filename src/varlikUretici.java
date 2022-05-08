package com.company;

enum varlikTipi{
    AgArayüzü

}

public class varlikUretici implements IvarlikUretici{

    @Override
    public Ivarlik varlikUret(varlikTipi tip) {

        Ivarlik varlik=null;

        switch (tip){

            case AgArayüzü:
                varlik=new AgArayüzü();
                break;
        }


        return varlik;
    }
}
