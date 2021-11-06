package com.company.generics;

public class TierKäfigTest {
    public static void main(String[] args) {
        //TierKaefig<Tier> kaefig = new TierKaefig<Katze>();

        //TierKaefig<Hund> kaefig1 = new TierKaefig<Tier>();

        //TierKaefig<?> kaefig2 = new TierKaefig<Katze>();
        //kaefig2.setInsasse(new Katze());

        TierKaefig kaefig = new TierKaefig();
        kaefig.setInsasse(new Hund());
    }
}
