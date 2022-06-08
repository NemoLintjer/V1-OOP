package inleveropdrachten.opdracht2B;

public class Voetbalclub {
    protected int aantalGewonnen;
    protected int aantalGelijk;
    protected int aantalVerloren;
    protected String naam;
    protected Voetbalclub(String nm){
        naam = nm;
        if ( naam == null ){
            naam = "FC";
        }
    }

    protected void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }
    }

    public Integer aantalPunten() {
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public Integer aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString(){
        String standen = naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return standen;
    }
}