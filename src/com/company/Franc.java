package com.company;

public class Franc extends Euro{
    public Franc(double franc){
        super(franc/6.55957);
    }

    public Franc(Euro euro){
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag(){
        return euroBetrag()*6.55957;
    }
}
