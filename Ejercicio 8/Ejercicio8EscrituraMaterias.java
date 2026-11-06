// Ejercicio 8: Escritura estructurada por líneas con BufferedWriter
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8EscrituraMaterias {

    public static void main(String[] args) {
        String[] asignaturas = {
            "Algoritmos",
            "Sistemas Operativos",
            "Base de Datos",
            "Redes de Computadoras",
            "Estructura de Datos"
        };

        try {
            // 1. Flujo de salida: BufferedWriter enlazado con FileWriter
            FileWriter archivo = new FileWriter("materias.txt");
            BufferedWriter escritor = new BufferedWriter(archivo);

            // 2 y 3. Cada asignatura queda en una línea independiente
            for (int i = 0; i < asignaturas.length; i++) {
                escritor.write(asignaturas[i]);
                escritor.newLine();
            }

            // 4. Liberación de recursos
            escritor.close();
            System.out.println("Archivo materias.txt creado con 5 asignaturas.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al escribir en el archivo.");
        }
    }
}
