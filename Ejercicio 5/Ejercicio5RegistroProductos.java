// Ejercicio 5: Registro de productos con modo append
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5RegistroProductos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // El parámetro true conserva los productos registrados anteriormente
            FileWriter archivo = new FileWriter("productos.txt", true);
            BufferedWriter escritor = new BufferedWriter(archivo);
            String respuesta;

            do {
                System.out.print("Nombre del producto: ");
                String nombre = teclado.nextLine();
                double precio = leerNumero(teclado, "Precio: ");
                int cantidad = leerEntero(teclado, "Cantidad disponible: ");

                double valorTotal = precio * cantidad;

                escritor.write("Producto: " + nombre);
                escritor.newLine();
                escritor.write("Precio: $" + dinero(precio));
                escritor.newLine();
                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();
                escritor.write("Valor total: $" + dinero(valorTotal));
                escritor.newLine();
                escritor.write("------------------------------");
                escritor.newLine();

                System.out.println("Valor total: $" + dinero(valorTotal));
                System.out.print("Desea registrar otro producto? (s/n): ");
                respuesta = teclado.nextLine().trim();
            } while (respuesta.equalsIgnoreCase("s"));

            escritor.close();
            System.out.println("Productos guardados correctamente en productos.txt");
        } catch (IOException e) {
            System.out.println("Se produjo un error al guardar el archivo.");
        }

        teclado.close();
    }

    // Da formato de dos decimales con punto
    public static String dinero(double valor) {
        return String.format("%.2f", valor).replace(',', '.');
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

    // Repite la pregunta hasta recibir un número entero válido
    public static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int numero = Integer.parseInt(teclado.nextLine().trim());
                if (numero >= 0) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                // Si no es un entero, se vuelve a preguntar
            }
            System.out.println("Valor no valido. Intente de nuevo.");
        }
    }
}
