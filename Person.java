public class Person {
    protected String name;
    protected String vorname;
    protected int alter;

    public Person(String n, String v, int a) {
        this.name = n;
        this.vorname = v;
        this.alter = a;
    }

    public Person(String n, int a) {
        this(n, "", a);
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
 