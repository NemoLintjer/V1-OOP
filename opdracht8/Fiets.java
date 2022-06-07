package inleveropdrachten.opdracht8;

import java.util.Objects;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    public double huidigeWaarde() {
        double np = nieuwprijs;
        for (int i = bouwjaar; i < 2022; i++) {
            np *= 0.9;
        }
    return np;
    }

    public boolean equals(Object object){
        if (object.equals(framenummer)) {
            return true;
        } return false;
    }
    public String toString() {
        return "Fiets " + type + " heeft een waarde van " + Utils.euroBedrag(this.huidigeWaarde());
    }
}
