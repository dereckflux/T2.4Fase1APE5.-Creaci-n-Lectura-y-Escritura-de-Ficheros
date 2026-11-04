// Ejercicio 1: Crear un fichero
import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Objeto File que representa el archivo curso.txt
            File archivo = new File("curso.txt");

            // createNewFile() devuelve true si crea el archivo y false si ya existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            System.out.println("Nombre del archivo: " + archivo.getName());
        } catch (IOException e) {
            System.out.println("Se produjo un error al crear el archivo.");
        }
    }
}
