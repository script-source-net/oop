package com.company.enums;

public enum Fall {
    NOMINATIV,
    GENITIV,
    DATIV,
    AKKUSATIV;

    public String getBetimmterArtikel (Geschlecht geschlecht){
        String[][] bestimmterArtikel = {
                {"der", "die", "das"},
                {"des", "der","des"},
                {"dem", "der", "dem"},
                {"den", "die","das"}
        };
        return bestimmterArtikel[this.ordinal()][geschlecht.ordinal()];
    }

    public String getUnbestimmterArtikel (Geschlecht geschlecht){
        String [][] unbestimmterArtikel = {
                {"ein","eine","ein"},
                {"eines","einer","eines"},
                {"einem","einer","einem"},
                {"einen","eine","ein"}
        };
        return unbestimmterArtikel[this.ordinal()][geschlecht.ordinal()];
    }
}
