import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PruevaNivel {
    public static ArrayList<disco> collecion = new ArrayList<>();
    public static void main(String[] args) {
        try {

            System.out.println("Selecciona una opción del menu:");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int val = 0;
            System.out.println("1. Añadir disco a colección.");
            System.out.println("2. Modificar disco.");
            System.out.println("3. Eliminar disco.");
            System.out.println("4. Mostrar disco.");
            System.out.println("5. Salir.");
            val = Integer.parseInt(buffer.readLine());
            switch (val) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void añadirDisco() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el título del disco:");
        String titulo = buffer.readLine();
        System.out.println("Introduce el artista del disco:");
        String artista = buffer.readLine();
        System.out.println("Introduce el número de temas del disco:");
        int numtemas = Integer.parseInt(buffer.readLine());
        System.out.println("Introduce la duración del disco:");
        double duracion = Integer.parseInt(buffer.readLine());
        disco nuevo = new disco(titulo, artista, numtemas, duracion);

    }
}
