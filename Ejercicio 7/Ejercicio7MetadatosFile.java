// Ejercicio 7: Exploración y gestión de metadatos con File
import java.io.File;
import java.io.IOException;

public class Ejercicio7MetadatosFile {

    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        try {
            // 1. Comprobación previa: exists() indica si la ruta está disponible
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                // createNewFile() no crea carpetas, por eso se prepara "datos"
                archivo.getParentFile().mkdirs();

                // 2. Creación controlada
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            }

            // 3. Extracción de información
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getPath());
        } catch (IOException e) {
            System.out.println("Se produjo un error al crear el archivo.");
        }
    }
}
