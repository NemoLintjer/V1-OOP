package inleveropdrachten.opdracht2B;

public class Main {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax");
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        Voetbalclub knvb = new Voetbalclub("Nederland");
        Voetbalclub psv = new Voetbalclub("PSV");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        knvb.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        ajx.verwerkResultaat('w');
        psv.verwerkResultaat('v');
        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
        System.out.println(knvb);
        System.out.println(psv);
    }
}
