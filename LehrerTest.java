public class LehrerTest {
    public static void main(String[] args) {
        Lehrer welsch = new Lehrer("Schmitz", "Welsch", 42, "Mathe");
        System.out.println(welsch.getName() + " unterrichtet " + welsch.getFach());
    }
}
