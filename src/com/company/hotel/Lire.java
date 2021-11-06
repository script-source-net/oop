package com.company.hotel;

public class Lire extends Euro{
    public Lire(double lire){
        super(lire/1936.27);
    }

    public Lire(Euro euro){
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag(){
        return euroBetrag()*1936.27;
    }
}
