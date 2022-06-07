package inleveropdrachten.opdracht3;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null, c3 = null;

        try {
            c1 = new Cirkel(5, 0, 0);
            c2 = new Cirkel(10, 10, 10);
            c3 = new Cirkel(-1, -1, -1);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
