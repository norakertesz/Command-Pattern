public class EinfacheFernbedienung {

    private Kommando slot;

    public void setKommando(Kommando k) {
        slot = k;
    }

    public void knopfGedrueckt() {
        slot.ausfuehren();
    }
}
