package inleveropdrachten.opdracht6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double getNieuwprijs(){
        return nieuwprijs;
    }
    public double huidigeWaarde(){
         double prijs = nieuwprijs;
         if (releaseJaar == 2022) {
             return nieuwprijs;
         } else {
             for (int j = releaseJaar; j < 2022; j++) {
                 prijs *= 0.70;
             }
             return prijs;
         }
    }

    public boolean equals(Game andereObject) {
        boolean isGelijk = false;

            if (this.naam.equals(andereObject.getNaam())) {
                if (this.releaseJaar == andereObject.releaseJaar) {
                    return true;
                }
            }
        return isGelijk;
    }

    public String toString(){
        String tekst = naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + nieuwprijs + "0 nu voor: €" + huidigeWaarde() + "0";
        return tekst.replace('.', ',');
    }
}
