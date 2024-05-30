public class Person {
    private String name;
    private String vorname;
    private int alter;

    public Person(String n, String v, int a) {
        this.name = n;
        this.vorname = v;
        this.alter = a;
    }

    public void geburtstag() {
        this.alter++;
    }

    public String getName() {
        return this.vorname + " " + this.name;
    }

    public int getAlter() {
        return this.alter;
    }

}
 