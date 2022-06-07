package inleveropdrachten.opdracht8;

public class Main {
    public static void main(String[] args) {

    Bedrijfsinventaris bedInv1 = new Bedrijfsinventaris("Inventaris", 99999999.99);
    Computer comp1 = new Computer("Dell", "11:22:33:44:55:66", 300.00, 2000);
    Computer comp2 = new Computer("Dell", "11:22:33:44:55:66", 300.00, 2000);
    Computer comp3 = new Computer("HP", "66:55:44:33:22:11", 400.00, 2005);
    Fiets fiets1 = new Fiets("Scala", 100.00, 2001, 12345);
    Fiets fiets2 = new Fiets("Scala", 100.00, 2001, 12345);
    Fiets fiets3 = new Fiets("oBike", 150.00, 2010, 54321);
    Auto auto1 = new Auto("Audi", 10000.00, 2002, "22-AU-TO");
    Auto auto2 = new Auto("Audi", 10000.00, 2002, "22-AU-TO");
    Auto auto3 = new Auto("Porsche", 11000.00, 2003, "AU-TO-22");
    Auto auto4 = new Auto("Ferrari", 199999999.99, 2003, "FE-RI-40");

    bedInv1.schafAan(comp1);
    bedInv1.schafAan(comp2);
    bedInv1.schafAan(comp3);
    bedInv1.schafAan(fiets1);
    bedInv1.schafAan(fiets2);
    bedInv1.schafAan(fiets3);
    bedInv1.schafAan(auto1);
    bedInv1.schafAan(auto2);
    bedInv1.schafAan(auto3);

    bedInv1.toString();
    System.out.print(bedInv1);
    }
}
