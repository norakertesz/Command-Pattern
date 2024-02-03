public class LichtAnKommando implements Kommando {
    private Licht licht;

    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.an();
    }
}
