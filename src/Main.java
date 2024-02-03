public class Main {
    public static void main(String[] args) {
        System.out.println("*+*+*+*+*+*+*(Command Pattern)*+*+*+*+*+*+*");

        EinfacheFernbedienung fb = new EinfacheFernbedienung();
        Licht licht = new Licht();
        LichtAnKommando lk = new LichtAnKommando(licht);
        LichtAusKommando lk2 = new LichtAusKommando(licht);
        fb.setKommando(lk);
        fb.knopfGedrueckt();
        fb.setKommando(lk2);
        fb.knopfGedrueckt();

    }
}