// Ejercicio 6: Sistema de registro de ventas
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6RegistroVentas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double totalAcumulado = 0;
        int ventas = 0;

        try {
            // El parámetro true conserva las ventas registradas anteriormente
            FileWriter archivo = new FileWriter("ventas.txt", true);
            BufferedWriter escritor = new BufferedWriter(archivo);

            System.out.print("Nombre del producto (fin para terminar): ");
            String producto = teclado.nextLine().trim();

            while (!producto.equalsIgnoreCase("fin")) {
                double precio = leerNumero(teclado, "Precio: ");
                int cantidad = leerEntero(teclado, "Cantidad vendida: ");

                double subtotal = precio * cantidad;
                double descuento = 0;

                // Se aplica un descuento del 10% desde $100
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double total = subtotal - descuento;
                totalAcumulado += total;
                ventas++;

                System.out.println("Subtotal: $" + dinero(subtotal));
                System.out.println("Descuento: $" + dinero(descuento));
                System.out.println("Total a pagar: $" + dinero(total));

                escritor.write(producto + " | Precio: $" + dinero(precio)
                        + " | Cantidad: " + cantidad
                        + " | Subtotal: $" + dinero(subtotal)
                        + " | Descuento: $" + dinero(descuento)
                        + " | Total: $" + dinero(total));
                escritor.newLine();

                System.out.print("Nombre del producto (fin para terminar): ");
                producto = teclado.nextLine().trim();
            }

            // Se guarda el total acumulado de las ventas realizadas
            if (ventas > 0) {
                escritor.write("TOTAL ACUMULADO: $" + dinero(totalAcumulado));
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Total acumulado: $" + dinero(totalAcumulado));
            System.out.println("Proceso finalizado. Revise el archivo ventas.txt");
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
