import java.io.*;

public class Hallo {
    public static void main(String[] args) {
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Hallo Welt!");
        System.out.println("Ihr Name, bitte: ");
        try {
            name = eingabe.readLine();
        } catch(IOException e) {}
        System.out.println("Hallo " + name + "!");
    }
}