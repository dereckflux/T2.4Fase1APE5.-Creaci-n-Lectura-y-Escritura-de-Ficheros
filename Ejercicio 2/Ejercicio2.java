// Ejercicio 2: Escribir información en un fichero
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensaje = teclado.nextLine();

        try {
            // El parámetro true conserva la información anterior
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            escritor.write(mensaje + System.lineSeparator());
            escritor.close();

            System.out.println("Mensaje guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al escribir en el archivo.");
        }

        teclado.close();
    }
}
