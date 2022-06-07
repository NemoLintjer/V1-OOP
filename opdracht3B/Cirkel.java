package inleveropdrachten.opdracht3;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        if (radius <= 0) {
            throw new IllegalArgumentException("De radius moet groter dan 0 zijn!");
        }
        radius = rad;
        xPositie = x;
        yPositie = y;

    }
    public String toString() {
        String c = "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
        return c;
    }
}
