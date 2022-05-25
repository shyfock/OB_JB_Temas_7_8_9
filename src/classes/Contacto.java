package classes;

import java.util.HashMap;
import java.util.Scanner;

public class Contacto {
    String name = "";
    String lastName = "";
    String birthDate = "";
    String phoneNumber = "";
    String eMail = "";

    public Contacto() {
    };

    public Contacto(String name, String lastName, String birthDate, String phoneNumber, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public HashMap<String, String> addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del contacto: ");
        this.name = sc.nextLine();
        System.out.println("Ingrese apellido del contacto: ");
        this.lastName = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (DD/MM/YYYY): ");
        this.birthDate = sc.nextLine();
        System.out.println("Ingrese el número de teléfono: ");
        this.phoneNumber = sc.nextLine();
        System.out.println("Ingrese el email: ");
        this.eMail = sc.nextLine();
        sc.close();

        HashMap<String, String> newContact = new HashMap<String, String>();
        newContact.put("name", this.name);
        newContact.put("lastName", this.lastName);
        newContact.put("birthDate", this.birthDate);
        newContact.put("phoneNumber", this.phoneNumber);
        newContact.put("eMail", this.eMail);

        return newContact;
    }
}
