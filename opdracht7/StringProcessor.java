package inleveropdrachten.opdracht7;

import java.util.ArrayList;

public class StringProcessor {
    ArrayList<OpmaakProces> processen;

    public StringProcessor() {
        processen = new ArrayList<OpmaakProces>();
    }

    public String verwerk(String input) {
        for (OpmaakProces oP : processen) {
            input = oP.maakOp(input);
        }
        return input;
    }

    public void voegProcesToe(OpmaakProces proces) {
        processen.add(proces);
    }
}
