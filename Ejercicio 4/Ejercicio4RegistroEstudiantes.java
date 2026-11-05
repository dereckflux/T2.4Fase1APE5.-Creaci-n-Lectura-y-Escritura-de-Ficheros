// Ejercicio 4: Registro de estudiantes y calificaciones
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4RegistroEstudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            FileWriter archivo = new FileWriter("estudiantes.txt");
            BufferedWriter escritor = new BufferedWriter(archivo);

            for (int i = 1; i <= 3; i++) {
                System.out.print("Nombre del estudiante " + i + ": ");
                String nombre = teclado.nextLine();
                double calificacion = leerNumero(teclado, "Calificacion: ");

                // Cada estudiante ocupa dos líneas en el archivo
                escritor.write("Estudiante: " + nombre);
                escritor.newLine();
                escritor.write("Calificacion: " + calificacion);
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Datos guardados correctamente en estudiantes.txt");
        } catch (IOException e) {
            System.out.println("Se produjo un error al guardar el archivo.");
        }

        teclado.close();
    }

    // Repite la pregunta hasta recibir un número válido
    public static double leerNumero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                String texto = teclado.nextLine().trim().replace(',', '.');
                double numero = Double.parseDouble(texto);
                if (numero >= 0) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                // Si no es un número, se vuelve a preguntar
            }
            System.out.println("Valor no valido. Intente de nuevo.");
        }
    }
}
