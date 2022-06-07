package inleveropdrachten.opdracht8;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde(){
        double np = aanschafPrijs;
        for (int i = productieJaar; i < 2022; i++) {
            np *= 0.6;
        }
        return np;
    }

    public boolean equals(Object obj){
        if (obj.equals(macAdres)) {
            return true;
        } return false;
    }

    public String toString(){
        return "Computer " + type + " heeft een waarde van " + Utils.euroBedrag(this.huidigeWaarde()); }
}
