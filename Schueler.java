public class Schueler extends Person {
    private int klasse;

    public Schueler(String n, String v, int a, int k) {
        super(n, v, a);
        this.klasse = k;
    }

    public int getKlasse() {
        return this.klasse;
    }

    public void versetzung() {
        this.klasse++;
    }
}
