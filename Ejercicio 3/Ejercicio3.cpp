// Ejercicio 3: Eliminar un fichero
#include <cstdio>
#include <iostream>
using namespace std;

int main() {
    // remove() devuelve 0 si elimina el archivo
    if (remove("estudiantes.txt") == 0) {
        cout << "Archivo eliminado correctamente." << endl;
    } else {
        cout << "No se pudo eliminar el archivo. Verifique que exista." << endl;
    }

    return 0;
}
