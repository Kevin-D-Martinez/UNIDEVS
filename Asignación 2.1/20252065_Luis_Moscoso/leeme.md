# Tarea 2.1 — Programación Orientada a Objetos en Java

---

## Descripción del Proyecto

Este proyecto fue desarrollado como parte de la asignatura de programación para practicar los fundamentos de la **Programación Orientada a Objetos (POO) en Java**.

El objetivo principal es aprender a:

- Crear clases con atributos y métodos.
- Instanciar objetos.
- Asignar valores a propiedades.
- Invocar métodos desde la clase principal.
- Comprender el funcionamiento básico de los objetos en Java.

---

### 🔹 Tv.java

Define la clase `Tv`, que representa un televisor mediante atributos y métodos.

#### Atributos:

- `marca` (String)
- `pulgadas` (int)
- `encendido` (boolean)
- `volumen` (int)

#### Métodos:

- `encender()` → Enciende la TV.
- `apagar()` → Apaga la TV.
- `subirVolumen()` → Aumenta el volumen.
- `bajarVolumen()` → Disminuye el volumen.

Cada método imprime en consola la acción que se está realizando.

---

### 🔹 Prueba.java

Contiene el método `main`, donde:

- Se crean **3 objetos** de tipo `Tv`.
- Se asignan valores diferentes a cada instancia.
- Se invocan todos los métodos para demostrar su funcionamiento.

---

## ▶️ Ejecución del Programa

1. Abrir el proyecto en **VS Code** o **Apache NetBeans**.
2. Ejecutar el archivo `Prueba.java`.
3. Observar la salida en la consola.

### ✅ Ejemplo de salida esperada

```
=== TV 1 ===
Marca: Samsung
Pulgadas: 55
Volumen: 20
La TV se está encendiendo...
Subiendo el volumen...
Bajando el volumen...
La TV se está apagando...
```

---

## 🧠 Conceptos Aplicados

- Clases y Objetos
- Atributos
- Métodos
- Instanciación
- Encapsulación básica
- Método `main` en Java
