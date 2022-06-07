package inleveropdrachten.opdracht4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }
    public void setHuisbaas(Persoon hb){
    huisbaas = hb;
    }
    public Persoon getHuisbaas(){
    return huisbaas;
    }
    public String toString(){
    String h = "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas + "; leeftijd " + Persoon.leeftijd + " jaar.";
    return h;
    }
}
