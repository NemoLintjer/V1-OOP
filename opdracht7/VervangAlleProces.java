package inleveropdrachten.opdracht7;

class VervangAlleProces implements OpmaakProces {
    String oud;
    String nieuw;

    VervangAlleProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input) {
        return input.replaceAll(oud, nieuw);

    }
}
