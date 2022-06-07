package inleveropdrachten.opdracht7;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "die"));
        processor.voegProcesToe(new HoofdletterProces());
        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}
