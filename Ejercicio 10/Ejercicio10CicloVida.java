// Ejercicio 10: Ciclo de vida completo y borrado seguro
import java.io.File;
import java.io.IOException;

public class Ejercicio10CicloVida {

    public static void main(String[] args) {
        // 1. Objeto File que representa la ruta
        File archivo = new File("datos/temporal.txt");

        // 2. Consulta del estado y creación segura
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                // createNewFile() no crea carpetas, por eso se prepara "datos"
                archivo.getParentFile().mkdirs();

                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getPath());
                }
            }
        } catch (IOException e) {
            System.out.println("Se produjo un error al crear el archivo.");
        }

        // 3. Variable de control que simula la confirmación del usuario
        boolean confirmarBorrado = true;

        // 4. delete() solo se ejecuta si la confirmación es verdadera
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
        } else {
            System.out.println("Borrado cancelado. El archivo se conserva.");
        }
    }
}
