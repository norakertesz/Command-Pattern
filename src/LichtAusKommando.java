public class LichtAusKommando implements Kommando{
    private Licht licht;

    public LichtAusKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.aus();
    }
}
