<a name="inicio"></a>

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:000000,45:14060F,75:4A044E,100:BE185D&height=220&section=header&text=INICIO%20DE%20LA%20GUIA%20APE%205&fontSize=50&fontColor=FF3EA5&stroke=4A044E&strokeWidth=2&animation=fadeIn&fontAlignY=38&desc=CREACI%C3%93N%2C%20LECTURA%20Y%20ESCRITURA%20DE%20FICHEROS&descSize=16&descAlignY=65" width="100%" alt="INICIO DE LA GUIA APE 5">

# 🃏 INICIO DE LA GUIA APE 5 · LA BARAJA DE GAMBITO 🃏

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=800&size=22&duration=3500&pause=1200&color=FF3EA5&background=0D1117&center=true&vCenter=true&width=900&height=70&lines=%E2%99%A0+T2.4+FASE+1+APE+5+%E2%99%A0;%E2%99%A5+UNIVERSIDAD+TECNICA+DE+AMBATO+%E2%99%A5;%E2%99%A6+CREAR%2C+ESCRIBIR+Y+ELIMINAR+FICHEROS+%E2%99%A6;%E2%99%A3+TRES+CARTAS%2C+DOS+LENGUAJES+%E2%99%A3" width="100%" alt="Texto animado de la guía APE 5">

</div>

<p align="center">
  <strong>♠️ LA MESA DE JUEGO DEL CÓDIGO · FACULTAD DE INGENIERÍA EN SISTEMAS, ELECTRÓNICA E INDUSTRIAL</strong><br>
  <em>«Una carta sola no gana la partida: se crea, se escribe y, cuando termina el juego, se retira de la mesa.»</em>
</p>

<div align="center">

<img src="https://img.shields.io/badge/BASE-NUEVA_ORLEANS-FF3EA5?style=for-the-badge&labelColor=18181B" alt="BASE: NUEVA ORLEANS">
<img src="https://img.shields.io/badge/JUGADOR-DERECK_PAREDES-FF3EA5?style=for-the-badge&labelColor=18181B" alt="JUGADOR: DERECK PAREDES">
<img src="https://img.shields.io/badge/MISI%C3%93N-MANEJO_DE_FICHEROS-FF3EA5?style=for-the-badge&labelColor=18181B" alt="MISIÓN: MANEJO DE FICHEROS">

<br>

<img src="https://img.shields.io/badge/ASIGNATURA-ALGORITMOS_Y_L%C3%93GICA-BE185D?style=flat-square&labelColor=18181B" alt="ASIGNATURA: ALGORITMOS Y LÓGICA">
<img src="https://img.shields.io/badge/LENGUAJES-JAVA_Y_C%2B%2B-BE185D?style=flat-square&labelColor=18181B" alt="LENGUAJES: JAVA Y C++">
<img src="https://img.shields.io/badge/TEMA-T2.4FASE1APE5-BE185D?style=flat-square&labelColor=18181B" alt="TEMA: T2.4FASE1APE5">
<img src="https://img.shields.io/badge/ESTADO-EN_PARTIDA-BE185D?style=flat-square&labelColor=18181B" alt="ESTADO: EN PARTIDA">

<br><br>

**Bienvenido a la mesa de juego, mon ami.**<br>
Este repositorio contiene la solución del tema **T2.4Fase1APE5. Creación, Lectura y Escritura de Ficheros**, el inicio de la guía APE 5.<br>
Aquí cada ejercicio es una carta cargada de energía cinética: se resuelve en **Java** y en **C++**, y se comprueba con su prueba de escritorio.

**Un jugador. Tres cartas. Dos lenguajes.**

[🌃 Expediente](#expediente) ·
[🃏 Jugador](#jugador) ·
[♠️ Cartas](#cartas) ·
[🗂️ Baraja](#baraja) ·
[▶️ Cómo jugar](#como-jugar) ·
[🎷 Descanso](#descanso)

</div>

---

<a name="expediente"></a>

## 🌃 El expediente · ¿De qué trata este repositorio?

Este repositorio reúne los tres ejercicios con los que inicia la guía APE 5. Con ellos se practican las operaciones básicas sobre ficheros de texto: **crear** un archivo, **escribir** información en él y **eliminarlo**.

Como en cualquier partida de Remy LeBeau, el orden de las cartas importa: el Ejercicio 2 escribe en `estudiantes.txt` y el Ejercicio 3 elimina ese mismo archivo.

<div align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&size=16&duration=900&pause=380&color=FF3EA5&background=0A0A0A&center=false&vCenter=false&width=560&height=161&multiline=true&lines=++%3E+BARAJANDO+EL+MAZO+DE+GAMBITO+...........+%5B+OK+%5D;++%3E+CARTA+1%3A+CREAR+curso.txt+................+%5B+OK+%5D;++%3E+CARTA+2%3A+ESCRIBIR+estudiantes.txt+.......+%5B+OK+%5D;++%3E+CARTA+3%3A+ELIMINAR+estudiantes.txt+.......+%5B+OK+%5D;++%3E+COMPILANDO+JAVA+Y+C+++...................+%5B+OK+%5D;++%3E+MISION%3A+GUIA+APE+5+%C2%B7+EN+CURSO+%E2%96%88" alt="Terminal animada de la baraja">
</div>

### 🎯 Objetivos de la misión

- **Crear ficheros**: generar `curso.txt` y comprobar si se creó o si ya existía.
- **Escribir sin perder información**: agregar mensajes a `estudiantes.txt` conservando su contenido anterior.
- **Eliminar ficheros**: borrar `estudiantes.txt` e informar si se logró o no.
- **Comprobar cada programa**: ejecutar las versiones en Java y C++ y verificar su salida con pruebas de escritorio.

> [!TIP]
> **Lema de la mesa:** «Antes de lanzar la carta, revisa si el archivo existe».

---

<a name="jugador"></a>

## 🃏 El jugador · Integrante y rol

Esta partida se juega en solitario. El único integrante se encarga de toda la baraja:

<div align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=18&duration=2400&pause=1300&color=FF3EA5&background=0D1117&center=true&vCenter=true&width=860&height=52&lines=Jugador+unico+%E2%80%BA+Dereck+Paredes+%E2%80%BA+Ejercicios+1%2C+2+y+3" width="100%" alt="Integrante del repositorio">
</div>

| N.º | Integrante | Rol en la mesa | Componentes |
| :---: | :--- | :--- | :--- |
| **1** | **Paredes Acosta Dereck Shair** | **As del Código Cajún · Analizar, programar y probar** | Ejercicios 1, 2 y 3 en **Java** y **C++**, con sus informes. |

| Dato | Detalle |
| :--- | :--- |
| **Asignatura** | Algoritmos y Lógica de Programación |
| **Nivel y paralelo** | Primero - B |
| **Docente** | Ing. José Ruben Caizabuano, M.Sc. |
| **Universidad** | Universidad Técnica de Ambato |

---

<a name="cartas"></a>

## ♠️ Las cartas · Los tres ejercicios

| Carta | Ejercicio | Archivo de texto | Java | C++ |
| :---: | :--- | :--- | :--- | :--- |
| ♠️ | **1. Crear un fichero** | `curso.txt` | `File`, `createNewFile()`, `getName()` | `ifstream`, `ofstream` |
| ♥️ | **2. Escribir información en un fichero** | `estudiantes.txt` | `Scanner`, `FileWriter`, `write()`, `close()` | `getline`, `ofstream` con `ios::app` |
| ♦️ | **3. Eliminar un fichero** | `estudiantes.txt` | `File`, `delete()` | `remove()` |

### ♠️ Ejercicio 1 · Crear un fichero

Crea el archivo de texto `curso.txt`, comprueba si se creó correctamente o si ya existe, muestra su nombre y controla los errores con `try-catch`.

```text
Archivo creado correctamente.
Nombre del archivo: curso.txt
```

Si se ejecuta otra vez, el archivo no se sobrescribe:

```text
El archivo ya existe.
Nombre del archivo: curso.txt
```

### ♥️ Ejercicio 2 · Escribir información en un fichero

Pide un mensaje por teclado y lo agrega al final de `estudiantes.txt`. El parámetro `true` de `FileWriter` y el modo `ios::app` de C++ conservan la información anterior.

```text
Ingrese un mensaje: Hola, soy estudiante de Software
Mensaje guardado correctamente.
```

> [!NOTE]
> El archivo `estudiantes.txt` debe existir antes de ejecutar este ejercicio.

### ♦️ Ejercicio 3 · Eliminar un fichero

Intenta eliminar `estudiantes.txt` y muestra un mensaje según el resultado.

```text
Archivo eliminado correctamente.
```

Si el archivo ya no existe:

```text
No se pudo eliminar el archivo. Verifique que exista.
```

---

<a name="baraja"></a>

## 🗂️ La baraja · Estructura del repositorio

```text
Guia-APE-5/
┣ 📂 Ejercicio1/
┃ ┣ 📜 Ejercicio1.java
┃ ┣ 📜 Ejercicio1.cpp
┃ ┣ 📜 Informe_Ejercicio1.docx
┃ ┗ 📜 Informe_Ejercicio1.pdf
┣ 📂 Ejercicio2/
┃ ┣ 📜 Ejercicio2.java
┃ ┣ 📜 Ejercicio2.cpp
┃ ┣ 📜 Informe_Ejercicio2.docx
┃ ┗ 📜 Informe_Ejercicio2.pdf
┣ 📂 Ejercicio3/
┃ ┣ 📜 Ejercicio3.java
┃ ┣ 📜 Ejercicio3.cpp
┃ ┣ 📜 Informe_Ejercicio3.docx
┃ ┗ 📜 Informe_Ejercicio3.pdf
┣ 📜 Informe_General_APE5.docx
┣ 📜 Informe_General_Ejercicios.docx
┣ 📜 Informe_General_Ejercicios.pdf
┗ 📜 README.md
```

---

<a name="como-jugar"></a>

## ▶️ Cómo jugar · Compilar y ejecutar

Cada ejercicio se ejecuta desde su propia carpeta. Por ejemplo, para el Ejercicio 1:

```bash
cd Ejercicio1

# Java
javac Ejercicio1.java
java Ejercicio1

# C++
g++ -std=c++17 -o ejercicio1 Ejercicio1.cpp
./ejercicio1
```

> [!IMPORTANT]
> Antes de los ejercicios 2 y 3, crea `estudiantes.txt` en la carpeta desde donde vas a ejecutarlos. Deja el Ejercicio 3 para el final, porque elimina ese archivo.

---

<a name="descanso"></a>

## 🎷 Zona de descanso · Una pausa en Nueva Orleans

<div align="center">

*«La partida terminó, mon ami. Guarda la baraja, que la guía APE 5 apenas comienza.»*

Si llegaste hasta aquí, la mesa te agradece la visita. 🃏♠️♥️♦️♣️

[⬆️ Volver al inicio](#inicio)

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:BE185D,25:4A044E,55:14060F,100:000000&height=120&section=footer" width="100%" alt="Pie de página">

</div>
