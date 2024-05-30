import java.io.*;
import java.util.*;

public class FileTurner {
    public static void main(String[] args) {
        try {
            turnFile(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        } catch (IOException e) {
            System.out.println("Dateifehler!");
        }
    }

    static void turnFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String zeile = "";
        Stack zeilen = new Stack();

        while((zeile = reader.readLine()) != null) {
            zeilen.push(zeile);
        }
        while(!zeilen.empty()) {
            zeile = (String)zeilen.pop();
            System.out.println(zeile);
        }
    }
}
