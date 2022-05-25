
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Imprime texto invertido
        System.out.println(reverse("Hola Mundo"));

        // Punto 1: Recorrer Array unidimensional
        String[] arrayUni = {
                "Hola",
                "Adios",
                "Ciao",
                "Good Bye",
                "Sayonara",
        };

        for (String word : arrayUni) {
            System.out.println(word);
        }
        // Punto 2: Recorrer Array bidimensional
        int[][] arrayBid = {
                { 1, 2, 3, 4 },
                { 10, 20, 30, 40 },
                { 100, 200, 300, 400 },
                { 1000, 2000, 3000, 4000 },
        };

        for (int i = 0; i < arrayBid.length; i++) {
            for (int j = 0; j < arrayBid[i].length; j++) {
                System.out.println("Position: " + "(" + i + "," + j + ")" + " | " + "Element: " + arrayBid[i][j]);
            }
        }

        // Punto 3: Crear Vector
        Vector<String> vector = new Vector<>();
        System.out.println(vector.capacity());
        // añadir 5 elementos
        vector.add("amor");
        vector.add("bondad");
        vector.add("sencillez");
        vector.add("generosidad");
        vector.add("solidaridad");
        // eliminar el 2do y 3r elemento
        vector.remove(1); // elimina elemento y se reconstruyen los índices
        vector.remove(1);

        System.out.println(vector);

        // Punto 4: Utilizar vector con capacidad por defecto
        /**
         * Al utilizar la capacidad por defecto se crea un vector para 10 elementos.
         * Si se requiere agregar 1000, entonces al superar la capacidad inicial esta se
         * duplica.
         * En este caso el vector debería duplicarse tantas veces como requiera para
         * alcanzar la capacidad de 1000 elementos.
         * Cada proceso de duplicación en memoria consume recursos y ralentiza el
         * proceso.
         */

        // Punto 5: ArrayList tipo String
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add(0, "Andres");
        nombres.add(1, "Sara");
        nombres.add(2, "Joaquin");
        nombres.add(3, "Milena");

        LinkedList<String> nombresLink = new LinkedList<>(nombres);

        for (String nombre : nombresLink) {
            System.out.println(nombre);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Punto 6: ArryList de números
        ArrayList<Integer> numeros = new ArrayList<>();
        // bucle for para rellenar ArrayList con enteros 1..10
        for (int i = 0; i < 10; i++) {
            numeros.add(i, i + 1);
        }
        // bucle for para borrar números pares
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(numeros.get(i));
            }
        }
        System.out.println(numeros);

        // Punto 7: Función DividePorCero
        try {
            DividePorCero(0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        // Punto 8: InputStream, PrintStream

        String fileIn = "lib\\origen.txt";
        String fileOut = "lib\\destino.txt";
        try {
            copyFile(fileIn, fileOut);
            System.out.println("El archivo ha sido copiado");
        } catch (IOException e) {
            System.out.println("Mensaje: " + e.getMessage() + "\n" + "El archivo no se ha copiado");
        }

    }

    // Función reverse()
    public static String reverse(String texto) {
        String[] textoArray = texto.split("");
        String cadenaReverse = "";
        for (int i = 0; i < textoArray.length; i++) {
            cadenaReverse += textoArray[textoArray.length - 1 - i];
        }
        return cadenaReverse;
    }

    // Función DividePorCero()
    public static void DividePorCero(int number) throws ArithmeticException {
        int resultado = 100 / number;
        System.out.println("El resultado es: " + resultado);

    }

    // Función InputStream PrintStream
    public static void copyFile(String fileIn, String fileOut) throws IOException {
        InputStream file1 = new FileInputStream(fileIn);
        byte[] datos = file1.readAllBytes();
        PrintStream file2 = new PrintStream(fileOut);
        file2.write(datos);
        file1.close();
        file2.close();
    }
}
