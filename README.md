<a name="inicio"></a>

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:000000,45:14060F,75:4A044E,100:BE185D&height=220&section=header&text=INICIO%20DE%20LA%20GUIA%20APE%205&fontSize=50&fontColor=FF3EA5&stroke=4A044E&strokeWidth=2&animation=fadeIn&fontAlignY=38&desc=CREACI%C3%93N%2C%20LECTURA%20Y%20ESCRITURA%20DE%20FICHEROS&descSize=16&descAlignY=65" width="100%" alt="INICIO DE LA GUIA APE 5">

# 🃏 INICIO DE LA GUIA APE 5 · LA BARAJA DE GAMBITO 🃏

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=800&size=22&duration=3500&pause=1200&color=FF3EA5&background=0D1117&center=true&vCenter=true&width=900&height=70&lines=%E2%99%A0+T2.4+FASE+1+APE+5+%E2%99%A0;%E2%99%A5+UNIVERSIDAD+TECNICA+DE+AMBATO+%E2%99%A5;%E2%99%A6+CREAR%2C+ESCRIBIR+Y+ELIMINAR+FICHEROS+%E2%99%A6;%E2%99%A3+DIEZ+CARTAS%2C+UN+SOLO+LENGUAJE+%E2%99%A3" width="100%" alt="Texto animado de la guía APE 5">

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
<img src="https://img.shields.io/badge/LENGUAJE-JAVA-BE185D?style=flat-square&labelColor=18181B" alt="LENGUAJE: JAVA">
<img src="https://img.shields.io/badge/TEMA-T2.4FASE1APE5-BE185D?style=flat-square&labelColor=18181B" alt="TEMA: T2.4FASE1APE5">
<img src="https://img.shields.io/badge/ESTADO-EN_PARTIDA-BE185D?style=flat-square&labelColor=18181B" alt="ESTADO: EN PARTIDA">

<br><br>

**Bienvenido a la mesa de juego, mon ami.**<br>
Este repositorio contiene la solución del tema **T2.4Fase1APE5. Creación, Lectura y Escritura de Ficheros**, con los 10 ejercicios de este avance de la guía APE 5.<br>
Aquí cada ejercicio es una carta cargada de energía cinética: se resuelve en **Java** y se comprueba con su prueba de escritorio.

**Un jugador. Diez cartas. Cero errores de compilación.**

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

Este repositorio reúne los 10 ejercicios de este avance de la guía APE 5. Con ellos se practican las operaciones sobre ficheros de texto: **crear** archivos, **consultar** sus datos, **escribir** información con distintos modos de apertura y **eliminarlos** de forma controlada.

Como en cualquier partida de Remy LeBeau, el orden de las cartas importa: el Ejercicio 3 elimina el `estudiantes.txt` del Ejercicio 2, y el Ejercicio 9 continúa el `materias.txt` del Ejercicio 8.

<div align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&size=16&duration=900&pause=380&color=FF3EA5&background=0A0A0A&center=false&vCenter=false&width=560&height=161&multiline=true&lines=++%3E+BARAJANDO+EL+MAZO+DE+GAMBITO+...........+%5B+OK+%5D;++%3E+CARTAS+1-3%3A+CREAR%2C+ESCRIBIR%2C+ELIMINAR+....+%5B+OK+%5D;++%3E+CARTAS+4-6%3A+REGISTROS+Y+VENTAS+...........+%5B+OK+%5D;++%3E+CARTAS+7-10%3A+RUTAS%2C+APPEND+Y+BORRADO+.....+%5B+OK+%5D;++%3E+COMPILANDO+EN+JAVA+......................+%5B+OK+%5D;++%3E+MISION%3A+GUIA+APE+5+%C2%B7+EN+CURSO+%E2%96%88" alt="Terminal animada de la baraja">
</div>

### 🎯 Objetivos de la misión

- **Crear y consultar ficheros**: generar archivos, comprobar si existen y mostrar su nombre y su ruta.
- **Escribir sin perder información**: usar `FileWriter` y `BufferedWriter` en modo normal y en modo append.
- **Construir registros útiles**: guardar estudiantes, productos y ventas, con cálculos y datos validados.
- **Eliminar con control**: borrar archivos e informar el resultado, incluso con una confirmación previa.

> [!TIP]
> **Lema de la mesa:** «Antes de lanzar la carta, revisa si el archivo existe».

---

<a name="jugador"></a>

## 🃏 El jugador · Integrante y rol

Esta partida se juega en solitario. El único integrante se encarga de toda la baraja:

<div align="center">
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=18&duration=2400&pause=1300&color=FF3EA5&background=0D1117&center=true&vCenter=true&width=860&height=52&lines=Jugador+unico+%E2%80%BA+Dereck+Paredes+%E2%80%BA+Ejercicios+del+1+al+10" width="100%" alt="Integrante del repositorio">
</div>

| N.º | Integrante | Rol en la mesa | Componentes |
| :---: | :--- | :--- | :--- |
| **1** | **Paredes Acosta Dereck Shair** | **As del Código Cajún · Analizar, programar y probar** | Ejercicios del 1 al 10 en **Java**, con sus informes. |

| Dato | Detalle |
| :--- | :--- |
| **Asignatura** | Algoritmos y Lógica de Programación |
| **Nivel y paralelo** | Primero - B |
| **Docente** | Ing. José Ruben Caizabuano, M.Sc. |
| **Universidad** | Universidad Técnica de Ambato |

---

<a name="cartas"></a>

## ♠️ Las cartas · Los 10 ejercicios

| Carta | Ejercicio | Archivo de texto | Clases y métodos en Java |
| :---: | :--- | :--- | :--- |
| ♠️ | **1. Crear un fichero** | `curso.txt` | `File`, `createNewFile()`, `getName()` |
| ♥️ | **2. Escribir información en un fichero** | `estudiantes.txt` | `Scanner`, `FileWriter`, `write()`, `close()` |
| ♦️ | **3. Eliminar un fichero** | `estudiantes.txt` | `File`, `delete()` |
| ♣️ | **4. Registro de estudiantes y calificaciones** | `estudiantes.txt` | `Scanner`, `BufferedWriter`, `FileWriter`, `newLine()` |
| ♠️ | **5. Registro de productos con modo append** | `productos.txt` | `BufferedWriter`, `FileWriter(nombre, true)` |
| ♥️ | **6. Sistema de registro de ventas** | `ventas.txt` | `BufferedWriter`, `FileWriter(nombre, true)` |
| ♦️ | **7. Exploración y gestión de metadatos con File** | `datos/prueba.txt` | `File`, `exists()`, `createNewFile()`, `getName()`, `getPath()` |
| ♣️ | **8. Escritura estructurada por líneas con BufferedWriter** | `materias.txt` | `BufferedWriter`, `FileWriter`, `newLine()`, `close()` |
| ♠️ | **9. Control del modo de apertura** | `materias.txt` | `FileWriter(nombre, true)`, `BufferedWriter` |
| ♥️ | **10. Ciclo de vida completo y borrado seguro** | `datos/temporal.txt` | `File`, `exists()`, `createNewFile()`, `delete()` |

### 🃏 Primera mano · Crear, escribir y eliminar

**♠️ Ejercicio 1 · Crear un fichero.** Crea `curso.txt`, indica si se creó o si ya existía, muestra su nombre y controla los errores con `try-catch`.

```text
Archivo creado correctamente.
Nombre del archivo: curso.txt
```

**♥️ Ejercicio 2 · Escribir información en un fichero.** Pide un mensaje por teclado y lo agrega al final de `estudiantes.txt`, conservando lo anterior gracias al parámetro `true` de `FileWriter`.

```text
Ingrese un mensaje: Hola, soy estudiante de Software
Mensaje guardado correctamente.
```

**♦️ Ejercicio 3 · Eliminar un fichero.** Elimina `estudiantes.txt` y muestra un mensaje según el resultado.

```text
Archivo eliminado correctamente.
```

### 🃏 Segunda mano · Registros en archivos

**♣️ Ejercicio 4 · Registro de estudiantes y calificaciones.** Solicita los datos de 3 estudiantes y guarda cada uno en dos líneas. Si la calificación no es válida, la vuelve a pedir.

```text
Estudiante: Ana Torres
Calificacion: 9.5
Estudiante: Luis Mena
Calificacion: 7.25
Estudiante: Sofia Vega
Calificacion: 10.0
```

**♠️ Ejercicio 5 · Registro de productos con modo append.** Calcula el valor total (precio × cantidad) y agrega cada producto a `productos.txt` sin borrar los anteriores.

```text
Nombre del producto: Cuaderno
Precio: 2.50
Cantidad disponible: 10
Valor total: $25.00
```

**♥️ Ejercicio 6 · Sistema de registro de ventas.** Registra ventas hasta que se escribe `fin`, aplica un 10% de descuento desde $100 y guarda el total acumulado en `ventas.txt`.

```text
Nombre del producto (fin para terminar): Mochila
Precio: 25
Cantidad vendida: 4
Subtotal: $100.00
Descuento: $10.00
Total a pagar: $90.00
```

### 🃏 Tercera mano · Rutas, modos y borrado seguro

**♦️ Ejercicio 7 · Exploración y gestión de metadatos con File.** Comprueba con `exists()` si `datos/prueba.txt` está disponible, lo crea si hace falta y muestra su nombre y su ruta.

```text
Archivo creado correctamente.
Nombre: prueba.txt
Ruta: datos/prueba.txt
```

**♣️ Ejercicio 8 · Escritura estructurada por líneas con BufferedWriter.** Crea `materias.txt` con cinco asignaturas, una por línea.

```text
Algoritmos
Sistemas Operativos
Base de Datos
Redes de Computadoras
Estructura de Datos
```

**♠️ Ejercicio 9 · Control del modo de apertura.** Agrega dos asignaturas a `materias.txt`, que conserva las cinco originales.

```text
Algoritmos
Sistemas Operativos
Base de Datos
Redes de Computadoras
Estructura de Datos
Desarrollo Web
Ciberseguridad
```

**♥️ Ejercicio 10 · Ciclo de vida completo y borrado seguro.** Crea `datos/temporal.txt` y solo lo elimina si la variable `confirmarBorrado` es verdadera.

```text
Archivo creado: datos/temporal.txt
Resultado de delete(): true
```

---

<a name="baraja"></a>

## 🗂️ La baraja · Estructura del repositorio

```text
T2.4Fase1APE5.-Creaci-n-Lectura-y-Escritura-de-Ficheros/
┣ 📂 Ejercicio1/
┃ ┣ 📜 Ejercicio1.java
┃ ┗ 📜 Informe_Ejercicio1.pdf
┣ 📂 Ejercicio2/
┃ ┣ 📜 Ejercicio2.java
┃ ┗ 📜 Informe_Ejercicio2.pdf
┣ 📂 Ejercicio3/
┃ ┣ 📜 Ejercicio3.java
┃ ┗ 📜 Informe_Ejercicio3.pdf
┣ 📂 Ejercicio4/
┃ ┣ 📜 Ejercicio4RegistroEstudiantes.java
┃ ┗ 📜 Informe_Ejercicio4.pdf
┣ 📂 Ejercicio5/
┃ ┣ 📜 Ejercicio5RegistroProductos.java
┃ ┗ 📜 Informe_Ejercicio5.pdf
┣ 📂 Ejercicio6/
┃ ┣ 📜 Ejercicio6RegistroVentas.java
┃ ┗ 📜 Informe_Ejercicio6.pdf
┣ 📂 Ejercicio7/
┃ ┣ 📜 Ejercicio7MetadatosFile.java
┃ ┗ 📜 Informe_Ejercicio7.pdf
┣ 📂 Ejercicio8/
┃ ┣ 📜 Ejercicio8EscrituraMaterias.java
┃ ┗ 📜 Informe_Ejercicio8.pdf
┣ 📂 Ejercicio9/
┃ ┣ 📜 Ejercicio9ModoAppend.java
┃ ┗ 📜 Informe_Ejercicio9.pdf
┣ 📂 Ejercicio10/
┃ ┣ 📜 Ejercicio10CicloVida.java
┃ ┗ 📜 Informe_Ejercicio10.pdf
┣ 📜 Informe_General_APE5_Ejercicios_1_al_10.pdf
┗ 📜 README.md
```

---

<a name="como-jugar"></a>

## ▶️ Cómo jugar · Compilar y ejecutar

Cada ejercicio se ejecuta desde su propia carpeta. Por ejemplo, para el Ejercicio 7:

```bash
cd Ejercicio7
javac Ejercicio7MetadatosFile.java
java Ejercicio7MetadatosFile
```

> [!IMPORTANT]
> Algunas cartas dependen de la anterior:
> - **Ejercicio 2:** crea antes `estudiantes.txt` en la carpeta desde donde lo vas a ejecutar.
> - **Ejercicio 3:** ejecútalo donde esté el `estudiantes.txt` que quieres eliminar.
> - **Ejercicio 9:** ejecútalo una sola vez, después del Ejercicio 8 y con el mismo `materias.txt`.

---

<a name="descanso"></a>

## 🎷 Zona de descanso · Una pausa en Nueva Orleans

<div align="center">

*«La partida terminó, mon ami. Guarda la baraja, que la guía APE 5 apenas comienza.»*

Si llegaste hasta aquí, la mesa te agradece la visita. 🃏♠️♥️♦️♣️

[⬆️ Volver al inicio](#inicio)

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:BE185D,25:4A044E,55:14060F,100:000000&height=120&section=footer" width="100%" alt="Pie de página">

</div>
