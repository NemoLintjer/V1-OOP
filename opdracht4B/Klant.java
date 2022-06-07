package inleveropdrachten.opdracht4B;

public class Klant {
    private String naam;
    public static double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
        if(naam == ""){
            naam = "Anoniem";
        }
    }
    public void setKorting(double kP){
        this.kortingsPercentage = kortingsPercentage;
    }
    public double getKorting(){
        return kortingsPercentage;
    }
    public String toString() {
    String s = naam;
    return s;
    }
}
