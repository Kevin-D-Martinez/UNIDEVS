# Registro Académico - 20252024 Darvin Mendez

## Descripción
Este proyecto en **Java Swing** permite registrar los datos académicos de un estudiante, calcular su nota final y determinar si aprobó o reprobó.  

El proyecto consta de dos partes principales:

1. **Clase `Estudiante`**  
   Representa un estudiante con sus datos personales y calificaciones en distintas evaluaciones académicas.

2. **Interfaz `RegistroAcademicoGUI`**  
   Una ventana gráfica que permite ingresar los datos del estudiante, calcular la nota final y mostrar el resultado de manera interactiva.

---

## Estructura del proyecto
src/
├── Estudiante.java             # Clase con la lógica de negocio y encapsulamiento.
├── RegistroAcademicoGUI.java    # Interfaz gráfica (JFrame) y manejo de eventos.
└── RegistroAcademicoGUI.form    # Archivo de diseño visual generado por NetBeans.

---

## Clases principales

### `Estudiante.java`

- **Atributos privados**
  - `nombre`: Nombre completo del estudiante
  - `matricula`: Matrícula del estudiante
  - `carrera`: Carrera o programa académico
  - `practicas`: Calificación obtenida en prácticas (0-40)
  - `parciales`: Calificación obtenida en parciales (0-20)
  - `asignaciones`: Calificación obtenida en asignaciones (0-20)
  - `examenFinal`: Calificación obtenida en examen final (0-20)

- **Métodos**
  - `calcularNotaFinal()`: Suma todas las evaluaciones y devuelve la nota final.
  - `getResultado()`: Devuelve `"APROBADO"` si la nota final ≥ 60, `"REPROBADO"` en caso contrario.
  - `getNombre()`, `getMatricula()`, `getCarrera()`: Devuelven los datos personales del estudiante.

---

### `RegistroAcademicoGUI.java`

- Ventana principal construida con **Java Swing**.
- Campos de entrada para:
  - Nombre, matrícula, carrera
  - Prácticas, parciales, asignaciones, examen final
- Botones:
  - `Calcular Resultado`: Calcula la nota final y muestra el estado aprobado/reprobado.
  - `Limpiar`: Limpia todos los campos y el resultado.
- Validaciones:
  - No permite campos personales vacíos.
  - Las calificaciones deben estar en su rango permitido.
  - Bloquea la entrada de letras en las calificaciones.
- Muestra el resultado en un `JLabel` con color:
  - Verde si aprobado
  - Rojo si reprobado

---

## Uso

1. Abrir el proyecto en NetBeans o cualquier IDE compatible con Java Swing.
2. Ejecutar la clase `RegistroAcademicoGUI`.
3. Ingresar los datos del estudiante en los campos correspondientes.
4. Presionar **Calcular Resultado** para obtener la nota final y estado.
5. Presionar **Limpiar** para reiniciar los campos.

---

## Notas

- Proyecto creado para fines académicos.  
- La nota final se calcula sumando todas las evaluaciones según el esquema:
  - Prácticas: 0-40
  - Parciales: 0-20
  - Asignaciones: 0-20
  - Examen final: 0-20

---

## Autor

**Darvin Mendez**  
Matrícula: 20252024  
