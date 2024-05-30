public class SchuelerTest {
    public static void main(String[] args) {
        Schueler tim = new Schueler("Schmitz", "Tim", 42, 11);
        tim.versetzung();
        System.out.println(tim.getName() + " versetzt in die Klasse " + tim.getKlasse());
    }
}
