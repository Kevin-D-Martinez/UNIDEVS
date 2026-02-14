# 📘 Proyecto: Calculadora en Java

## 👨‍🎓 Información del Estudiante

**Nombre:** Luis Alberto
**Matrícula:** 2025-2065
**Asignatura:** Programación 1
**Tarea:** Sobrecarga de Métodos – Clase Calculadora

---

## 📌 Descripción del Proyecto

Este proyecto consiste en la creación de una clase **Calculadora** en Java capaz de realizar operaciones matemáticas básicas utilizando el concepto de **sobrecarga de métodos**.

La aplicación permite realizar operaciones de:

- ✅ Suma
- ✅ Resta
- ✅ Multiplicación
- ✅ División

Los métodos fueron implementados usando diferentes cantidades de parámetros para demostrar cómo Java selecciona automáticamente el método correcto según los argumentos enviados.

---

## Concepto Utilizado: Sobrecarga de Métodos

La **sobrecarga de métodos** permite definir varios métodos con el mismo nombre pero con distinta cantidad de parámetros.

Ejemplo:

```java
sumar(int a, int b)
sumar(int a, int b, int c)
sumar(int a, int b, int c, int d)
```

Java ejecuta automáticamente el método adecuado dependiendo de los valores enviados.

---

## 🧮 Métodos Implementados

| Método        | 2 Parámetros | 3 Parámetros | 4 Parámetros |
| ------------- | ------------ | ------------ | ------------ |
| sumar()       | ✔            | ✔            | ✔            |
| restar()      | ✔            | ✔            | ✔            |
| multiplicar() | ✔            | ✔            | ✔            |
| dividir()     | ✔            | ✘            | ✘            |

**Total:** 10 métodos implementados.

---

## Estructura del Proyecto

```
ProyectoCalculadora/
│
├── Calculadora.java
├── Main.java
└── README.md
```

---

## Ejecución del Programa

1. Abrir el proyecto en **VS Code** o **Apache NetBeans**.
2. Compilar los archivos Java.
3. Ejecutar la clase `Main.java`.
4. Verificar la salida en consola.

---

## Ejemplo de Salida

```
Suma (2 params): 8
Resta (2 params): 6
Multiplicación (2 params): 42
División (2 params): 5
Suma (3 params): 10
Resta (3 params): 4
Multiplicación (3 params): 24
Suma (4 params): 10
Resta (4 params): 10
Multiplicación (4 params): 16
```

## Conclusión

Este proyecto demuestra el uso práctico de la sobrecarga de métodos en Java, permitiendo reutilizar nombres de funciones y mejorar la organización del código.

---
