public class PersonenTest {
    public static void main(String[] args) {
        Person klaus = new Person("Schmitz", "Klaus", 42);
        System.out.println("Person: " + klaus.getName());
        klaus.geburtstag();
        System.out.println("Neues Alter: " + klaus.getAlter());
    }
}
