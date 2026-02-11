# Primer Parcial – Calculadora Matemática

**Asignatura:** Programación 1 - Prof. Jesús Quezada
**Estudiante:** Zoila García [2021-1514]

---

La aplicación consiste en una **calculadora matemática** que permite ingresar dos números y realizar:

- Suma  
- Resta  
- Multiplicación  
- División (con validación de división por cero)

El programa presenta un **menú** que se repite hasta que el usuario decide salir.

---

## Estructura del Proyecto

El proyecto está compuesto por dos clases:

### `CalculadoraMatematica`
Clase encargada de realizar las operaciones matemáticas.

**Atributos:**
- `private double numero1`
- `private double numero2`

**Métodos principales:**
- Constructor por defecto
- `registrarNumeros(double a, double b)`
- `sumar()`
- `restar()`
- `multiplicar()`
- `dividir()`

---

### `PrimerParcial`
Clase que contiene el método `main`, el menú interactivo y la lectura de datos.

---

## Ejecución del Programa

1. Abrir el proyecto en NetBeans.
2. Ejecutar la clase PrimerParcial.
3. Seguir las instrucciones mostradas en el menú.