public class Lehrer extends Person {
    private String fach;

    public Lehrer(String n, String v, int a, String f) {
        super(n, v, a);
        this.fach = f;
    }

    public String getFach() {
        return this.fach;
    }
}
