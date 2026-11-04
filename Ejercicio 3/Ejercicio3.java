// Ejercicio 3: Eliminar un fichero
import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Objeto File que representa el archivo estudiantes.txt
        File archivo = new File("estudiantes.txt");

        // delete() devuelve true si elimina el archivo y false si no pudo hacerlo
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo. Verifique que exista.");
        }
    }
}
