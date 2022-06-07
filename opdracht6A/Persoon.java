package inleveropdrachten.opdracht6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> gameLijst = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget >= g.huidigeWaarde() && !gameLijst.contains(g)) {
            budget = budget - g.huidigeWaarde();
            gameLijst.add(g);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.budget >= g.huidigeWaarde()) {
            if (this.gameLijst.contains(g) && !koper.gameLijst.contains(g)) {
                koper.budget -= g.huidigeWaarde();
                this.budget += g.huidigeWaarde();
                this.gameLijst.remove(g);
                koper.gameLijst.add(g);
                return true;
            }
        }
        return false;
    }

    public Game zoekGameOpNaam(String gameNaam) {
        for (Game spel : gameLijst) {
            if (spel.getNaam().equals(gameNaam)) {

                return spel;
            }
        }
        return null;
    }


    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> gameLijst) {
        ArrayList<Game> spellenInEigendom = new ArrayList<Game>();
        for (Game spel : gameLijst) {
            if (!gameLijst.contains(spel)) {
                spellenInEigendom.add(spel);
            }

        }
        return spellenInEigendom;
    }

    public String toString() {
        String tekst = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for (Game spel : gameLijst) {
            tekst += "\n" + spel;
        }
        return tekst;
    }
}
