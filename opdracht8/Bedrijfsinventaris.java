package inleveropdrachten.opdracht8;

import java.util.ArrayList;

public class Bedrijfsinventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public Bedrijfsinventaris(String nm, double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
        alleGoederen = new ArrayList<Goed>();
    }

    public void setAlleGoederen(ArrayList<Goed> g){
        alleGoederen = g;
    }

    public ArrayList<Goed> getAlleGoederen(){
        return alleGoederen;
    }

    public void schafAan(Goed g) {
        if (g.huidigeWaarde() <= budget && !alleGoederen.contains(g)) {
                        budget -= g.huidigeWaarde();
                        alleGoederen.add(g);
                    }
        }

        @Override
    public String toString(){
        return "In de bedrijfsinventaris staan " + getAlleGoederen();
    }
}
