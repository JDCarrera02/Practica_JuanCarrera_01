# Practica_JuanCarrera_01

Aplicación Android desarrollada en **Kotlin** como entregable de prácticas del módulo de 2º DAM. Reúne varias pantallas independientes a las que se accede desde un menú principal tras iniciar sesión.

---

## Contenido de la aplicación

| Pantalla                  | Descripción                                                                                                             |
|---------------------------|-------------------------------------------------------------------------------------------------------------------------|
| **Login**                 | Pantalla de acceso a la aplicación.                                                                                     |
| **Dashboard**             | Menú principal desde el que se navega al resto de pantallas.                                                            |
| **Edad canina**           | Calcula la edad equivalente del usuario si fuera un perro.                                                              |
| **Super héroes**          | Creación de una bio sobre superhéroes de Marvel o DC.                                                                   |
| **Detalles super héroes** | Muestra el resultado de cada Bio del super heroe creado en la vista "Super héroes".                                     |
| **Quizzes**               | Pequeño cuestionario sobre super heroes. Se compone de dos interfaces                                                   |

---

## Descripción de las pantallas

### Login (`LoginActivity`)
Punto de entrada de la aplicación.
- El usuario introduce su nombre y una contraseña (Típico login), en fase de prueba, no hace validaciones

### Dashboard (`DashBoardMain`)
Menú principal que da acceso a cada una de las prácticas.
- Edad Canina (edad del usuario equivalente a la edad de un can)
- Super Heroes (formulario para "registrar un super heroe", imagen, nombre, alter ego, bio basica descriptiva)
	- Detalles super héroes (muestra lo que se ha registrado en la pantalla anterior)
- Quizzes (pequeño cuestionario sobre super héroes)

### Edad canina (`EdadCanina`)
- El usuario introduce su edad en un campo de texto.
- Al pulsar **Calcular**, se muestra cuál sería su edad si fuera un perro.
- Si el campo está vacío, un `Toast` avisa de que hay que introducir la edad.

### Super héroes (`SuperHeroes`)
Un formulario basico con 4 campos.
- Imagen (icono de camara), se accede a la camara del dispositivo.
- Nombre del super héroe, ejemplo: Iron Man, Wolverine, Spider Man, Deadpool
- Alter ego (permite que el personaje mantenga su vida civil (trabajo, familia, amigos) separada de su labor heroica para proteger a sus seres queridos.), ejemplo: Bruce Wayne, Peter Parker  
- Bio (una pequeña descripción de lo que es el super héroe)
- Power, una barra de calificación que se refiere al poder del super héroe en cuestion
- Boton de guardar, envía la información escrita en los campos a la siguiente interfaz de los detalles (`SuperHeroeDetail`)

### Detalles super héroes (`SuperHeroDetail`)
Interfaz que contiene la información registrada en la interfaz de `super héroes`.
Se muestra la información en el siguiente orden:
- Imagen registrada del icono de la cámara
- Información registrada del nombre del super héroe
- Etiqueta **Alter Ego**
  - Información registrada de alter ego
- Etiqueta **Bio**
  - Información registrada de la Bio
- Etiqueta **Power**
  - Información registrada de la barra de calificación Power


## Quizzes (`QuizMain`)
Cuestionario de **3 preguntas** con dos opciones de respuesta cada una. Esta actividad está compuesta por: QuizMain y QuizDialog

- Muestra el progreso actual (`1 / 3`) con texto y barra de progreso.
- Presenta el enunciado de la pregunta y dos opciones en un `RadioGroup`.
- Al pulsar **Send**:
	- Si no se ha marcado ninguna opción, se muestra un `Toast` y no se avanza.
	- Si hay una opción marcada, se abre la pantalla de resultado enviando la pregunta actual y la respuesta elegida mediante `Intent`.

## Dialogo Quiz (`QuizDialog`)
Pantalla de resultado de cada pregunta. Recibe las respuestas seleccionadas en `QuizMain` 

- Si la respuesta es correcta, muestra **¡Correcto!** con su icono.
- Si es incorrecta, muestra **¡Incorrecto!** con su icono.
- En la última pregunta muestra **¡Finalizado!** y el botón cambia a **Start again**.
- El botón **Next** avanza a la siguiente pregunta; **Start again** vuelve a la primera.

---

## Aspectos técnicos

- **Lenguaje:** Kotlin
- **Vistas:** layouts XML con View Binding
- **Textos:** centralizados en `res/values/strings.xml`, sin textos escritos directamente en el código ni en los layouts. Las preguntas, opciones y respuestas correctas se guardan en `string-array` paralelos, relacionados por su posición.
- **Navegación:** `Intent` con datos extra (`putExtra` / `getIntExtra` / `getStringExtra`) entre pantallas.

---

## Requisitos

- [Android Studio](https://developer.android.com/studio) (versión reciente)
- Un dispositivo Android físico o un emulador configurado en Android Studio
<!-- Completar: versión mínima de Android (minSdk) indicada en app/build.gradle.kts -->

---

## Cómo ejecutar el proyecto

1. **Obtener el proyecto**, de una de estas dos formas:
	- Clonar el repositorio:
	  ```bash
      git clone <URL_DEL_REPOSITORIO>
      ```
	- O descargarlo como `.zip` y descomprimirlo.
2. **Abrir el proyecto** en Android Studio con *File → Open*, seleccionando la carpeta raíz del proyecto.
3. **Esperar a que termine la sincronización de Gradle** (barra de progreso inferior). La primera vez puede tardar unos minutos.
4. **Elegir dónde ejecutar la aplicación:**
	- **Dispositivo físico:** conectarlo por cable USB con la *Depuración USB* activada en las opciones de desarrollador.
	- **Emulador:** crear uno desde *Device Manager* si no hay ninguno.
5. **Ejecutar** con el botón ▶ *Run 'app'* (o `Shift + F10`).

La aplicación se inicia en la pantalla de **Login** (`LoginActivity`, en `app/src/main/java/org/iesch/appPractica`).

---

## Autor

**Juan Carrera** — 2º DAM


