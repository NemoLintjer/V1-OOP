package inleveropdrachten.opdracht8;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public Auto(String tp, double pr, int jr) {
        super(tp, pr, jr);
    }

    public double huidigeWaarde(){
    double np = nieuwprijs;
    for (int i = bouwjaar; i < 2022; i++) {
        np *= 0.7;
    }
    return np;
    }
    public boolean equals(Object obj){
        if (obj.equals(type)) {
            return true;
        }
        else return false;
    }
    public String toString() {
        return "Auto " + type + " heeft een waarde van " + Utils.euroBedrag(this.huidigeWaarde());
    }
}
