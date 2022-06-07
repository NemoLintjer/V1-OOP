package inleveropdrachten.opdracht7;

class VervangProces implements OpmaakProces {
    String oud;
    String nieuw;

    VervangProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input) {
        return input.replace(oud, nieuw);

    }
}