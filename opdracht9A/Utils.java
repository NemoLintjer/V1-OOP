package inleveropdrachten.opdracht9A;

public class Utils {
    public static String euroBedrag(double bedrag, int precisie) {
        String afgerondBedrag = String.format("%." + precisie + "f", bedrag);
        return "€ " + afgerondBedrag;
    }
    public static String euroBedrag(double bedrag) {
        String afgerondBedrag = String.format("%.2f", bedrag);
        return "€ " + afgerondBedrag;
    }
}
