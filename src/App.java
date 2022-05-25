import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;

import classes.Contacto;

public class App {
    public static void main(String[] args) {
        Contacto nuevo = new Contacto();
        HashMap<String, String> newContact = nuevo.addContact();

        try {
            PrintStream newFile = new PrintStream("lib\\contactos.txt");
            // newFile.println(newContact);
            newFile.printf("%s", newContact);
            System.out.println("El contacto ha sido guardado.");
            newFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
