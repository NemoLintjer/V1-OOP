package inleveropdrachten.opdracht2;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double ln, double br, double dp) {
        lengte = ln;
        breedte = br;
        diepte = dp;
    }
    public Zwembad(){

    }
    public String toString() {
        return String.format("Dit zwembad is " + lengte + " meter lang, " + breedte + " meter breed en " + diepte + " meter diep.");
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double br) {
        this.breedte = br;
    }

    public void setLengte(double ln) {
        this.lengte = ln;
    }

    public void setDiepte(double dp) {
        this.diepte = dp;
    }

    public double inhoud() {
        double inhoud = lengte * breedte * diepte;
        return inhoud;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }
}
