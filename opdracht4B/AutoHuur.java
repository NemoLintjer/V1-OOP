package inleveropdrachten.opdracht4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;
    private double totaalPrijs;

    public AutoHuur(int aD) {
        aantalDagen = aD;
    }

    public AutoHuur() {
    }

    public void setGehuurdeAuto(Auto at) {
        gehuurdeAuto = at;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant kl) {
        huurder = kl;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        if (aantalDagen <= 0) {
            aantalDagen = -aantalDagen;
        }
        return aantalDagen;
    }

    public double totaalPrijs() {
        if (Auto.prijsPerDag <= 0) {
            Auto.prijsPerDag = -Auto.prijsPerDag;
        }
        double totaalPrijs = aantalDagen * Auto.prijsPerDag;
        return totaalPrijs;
    }

    public String toString() {
        String tekst;
        if (aantalDagen <= 0) {
             tekst = "Aantal dagen is te weinig";
        } else {
            tekst = "Aantal dagen " + aantalDagen + " en dat kost" + totaalPrijs;
        }
        if (gehuurdeAuto == null) {
            tekst = "Er is geen auto bekend";
        } else {
            tekst = "Autotype: " + gehuurdeAuto + "Met prijs per dag" + Auto.prijsPerDag;
        }
        if (huurder == null) {
            tekst = "Er is geen huurder gevonden";
        } else {
            tekst = "Op naam van" + huurder + "Korting: " + Klant.kortingsPercentage;
        }
        return tekst;
    }
}
