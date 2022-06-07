package inleveropdrachten.opdracht4B;

public class Auto {
    private String type;
    public static double prijsPerDag;

    public Auto(String tp, double prPd){
    type = tp;
    prijsPerDag = prPd;
    }
    public void setPrijsPerDag() {
    this.prijsPerDag = prijsPerDag;
    }


    public double getPrijsPerDag() {
        if(prijsPerDag <= 0) {
            prijsPerDag = -prijsPerDag;
        }
    return prijsPerDag;
    }

    public String getType() {
        return type;
    }

    public String toString() {
    return "Er is geen huurder gevonden";
    }
}
