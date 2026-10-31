# CodeSphere — Capturas de la aplicación

Capturas reales del APK ejecutado en Android Emulator (1080 × 2400). Pulsa una imagen para verla en tamaño completo.

| Inicio | Favoritos |
| --- | --- |
| <img src="docs/capturas/01-inicio.png" width="300" alt="Inicio"> | <img src="docs/capturas/02-favoritos.png" width="300" alt="Favoritos"> |

| Historia y código | Frameworks |
| --- | --- |
| <img src="docs/capturas/03-historia.png" width="300" alt="Historia y código de Python"> | <img src="docs/capturas/04-frameworks.png" width="300" alt="Frameworks de Python"> |

| Práctica | Videos |
| --- | --- |
| <img src="docs/capturas/05-practica.png" width="300" alt="Ejercicios de Python"> | <img src="docs/capturas/06-videos.png" width="300" alt="Videos de Python"> |

## Quiz General

<img src="docs/capturas/07-quiz.png" width="300" alt="Quiz General">

## Código del proyecto

Aplicación Android en Kotlin y Jetpack Compose (Material 3). Incluye búsqueda y filtros de lenguajes, favoritos, historia y sintaxis, frameworks, ejercicios, videos y cuestionarios.

### Ejecutar

1. Abre la raíz del repositorio en Android Studio.
2. Instala Android SDK Platform 37 y configura la ubicación del SDK desde Android Studio.
3. Sincroniza Gradle y ejecuta el módulo `app` en un emulador o dispositivo con Android API 24 o superior.

Para compilar desde Windows: `gradlew.bat assembleDebug` (con el SDK configurado). Gradle usa un toolchain JDK 25.

### Estructura

- `app/src/main/java/com/example/tarea/`: actividad principal, modelos, datos, navegación y pantallas.
- `app/src/main/res/`: recursos Android.
- `gradle/`: versiones y Gradle Wrapper.
- `docs/capturas/`: capturas de las vistas.
