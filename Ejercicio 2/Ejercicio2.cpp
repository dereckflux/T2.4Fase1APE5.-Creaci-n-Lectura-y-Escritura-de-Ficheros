// Ejercicio 2: Escribir información en un fichero
#include <fstream>
#include <iostream>
#include <stdexcept>
#include <string>
using namespace std;

int main() {
    string mensaje;

    cout << "Ingrese un mensaje: ";
    getline(cin, mensaje);

    try {
        // ios::app conserva la información anterior
        ofstream escritor("estudiantes.txt", ios::app);
        if (!escritor.is_open()) {
            throw runtime_error("No se pudo abrir el archivo");
        }

        escritor << mensaje << endl;
        escritor.close();

        cout << "Mensaje guardado correctamente." << endl;
    } catch (const exception& e) {
        cout << "Se produjo un error al escribir en el archivo." << endl;
    }

    return 0;
}
