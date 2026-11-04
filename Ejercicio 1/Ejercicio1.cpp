// Ejercicio 1: Crear un fichero
#include <fstream>
#include <iostream>
#include <stdexcept>
#include <string>
using namespace std;

int main() {
    string nombre = "curso.txt";

    try {
        // Si el archivo se puede abrir para lectura, significa que ya existe
        ifstream comprobar(nombre);

        if (comprobar.is_open()) {
            cout << "El archivo ya existe." << endl;
            comprobar.close();
        } else {
            // ofstream crea el archivo cuando no existe
            ofstream archivo(nombre);
            if (!archivo.is_open()) {
                throw runtime_error("No se pudo crear el archivo");
            }
            archivo.close();
            cout << "Archivo creado correctamente." << endl;
        }

        cout << "Nombre del archivo: " << nombre << endl;
    } catch (const exception& e) {
        cout << "Se produjo un error al crear el archivo." << endl;
    }

    return 0;
}
