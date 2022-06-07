package inleveropdrachten.opdracht8;

abstract class Voertuig implements Goed {
    protected String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
    this.type = tp;
    this.nieuwprijs = pr;
    this.bouwjaar = jr;
    }
}
