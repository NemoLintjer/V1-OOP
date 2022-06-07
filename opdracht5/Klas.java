package inleveropdrachten.opdracht5;

import java.util.ArrayList;
import java.util.Objects;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingLijst;

    public Klas(String kC) {
        this.klasCode = kC;
        leerlingLijst = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingLijst.add(l);
    }

    public void wijzigCijfer(String naam, double nweCijfer) {
        for (Leerling l : leerlingLijst) {
            if (l.getNaam().equals(naam)) {
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingLijst;
    }

    public int aantalLeerlingen() {
        return leerlingLijst.size();
    }

    public String toString() {
        System.out.println("In klas " + klasCode + " zitten de volgende leerlingen:");
        for (Leerling l : leerlingLijst) {
            System.out.println(l.toString());
        }
        return "";
    }
}

