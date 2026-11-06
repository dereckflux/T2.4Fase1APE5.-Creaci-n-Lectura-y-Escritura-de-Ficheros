// Ejercicio 9: Control del modo de apertura (append vs sobrescribir)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9ModoAppend {

    public static void main(String[] args) {
        try {
            // 1. El segundo parámetro en true activa el modo de adición
            FileWriter archivo = new FileWriter("materias.txt", true);
            BufferedWriter escritor = new BufferedWriter(archivo);

            // 2. Las nuevas asignaturas se agregan al final
            escritor.write("Desarrollo Web");
            escritor.newLine();
            escritor.write("Ciberseguridad");
            escritor.newLine();

            // 3. Cierre del flujo
            escritor.close();
            System.out.println("Se agregaron 2 asignaturas a materias.txt.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al escribir en el archivo.");
        }
    }
}
