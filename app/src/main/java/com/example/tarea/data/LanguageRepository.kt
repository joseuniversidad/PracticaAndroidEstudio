package com.example.tarea.data

import com.example.tarea.model.Exercise
import com.example.tarea.model.Framework
import com.example.tarea.model.Language
import com.example.tarea.model.LanguageCategory
import com.example.tarea.model.QuizQuestion
import com.example.tarea.model.VideoResource

object LanguageRepository {

    val languages = listOf(
        Language(
            id = "kotlin",
            name = "Kotlin",
            tagline = "Moderno, conciso y seguro para Android y JVM",
            description = "Kotlin es un lenguaje de programación estáticamente tipado de código abierto desarrollado por JetBrains. Es el lenguaje preferido por Google para el desarrollo de aplicaciones Android modernas.",
            history = "Diseñado por JetBrains en San Petersburgo (Rusia) y presentado en 2011. En 2017, Google lo anunció como lenguaje oficial de primera clase para desarrollo Android. Se creó para superar la verbosidad de Java manteniendo 100% de interoperabilidad.",
            yearCreated = 2011,
            creator = "JetBrains (Andrey Breslav et al.)",
            paradigm = "Multi-paradigma (Orientado a Objetos, Funcional)",
            colorHex = 0xFF7F52FF,
            category = LanguageCategory.MOBILE,
            syntaxExample = """
                fun main() {
                    val message = "¡Hola, Kotlin!"
                    val numbers = listOf(1, 2, 3, 4, 5)
                    val doubles = numbers.map { it * 2 }
                    println("${'$'}message -> ${'$'}doubles")
                }
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "kt-compose",
                    name = "Jetpack Compose",
                    description = "El toolkit moderno de Google para crear interfaces de usuario nativas en Android con una arquitectura declarativa.",
                    useCase = "Desarrollo de UI Móvil y Multiplataforma",
                    officialUrl = "https://developer.android.com/compose"
                ),
                Framework(
                    id = "kt-ktor",
                    name = "Ktor",
                    description = "Framework asíncrono creado por JetBrains para construir aplicaciones conectadas, microservicios y clientes HTTP en Kotlin.",
                    useCase = "Backend REST / Microservicios y Clientes HTTP",
                    officialUrl = "https://ktor.io/"
                ),
                Framework(
                    id = "kt-kmp",
                    name = "Kotlin Multiplatform (KMP)",
                    description = "Permite compartir código de lógica de negocio entre Android, iOS, Desktop y Web manteniendo la UI nativa.",
                    useCase = "Desarrollo Multiplataforma Compartido",
                    officialUrl = "https://kotlinlang.org/lp/multiplatform/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-kt-1",
                    title = "Filtrar Números Pares",
                    description = "Escribe una función que tome una lista de enteros y devuelva solo los números pares utilizando operadores funcionales de Kotlin.",
                    difficulty = "Principiante",
                    initialCode = """
                        fun getEvens(numbers: List<Int>): List<Int> {
                            // Tu código aquí
                            return emptyList()
                        }
                    """.trimIndent(),
                    solutionCode = """
                        fun getEvens(numbers: List<Int>): List<Int> {
                            return numbers.filter { it % 2 == 0 }
                        }
                    """.trimIndent(),
                    explanation = "El método `filter` recorre cada elemento y evalúa si el predicado `it % 2 == 0` es verdadero.",
                    hints = listOf("Utiliza la función de extensión `.filter`", "Recuerda que `it` representa el elemento actual")
                ),
                Exercise(
                    id = "ex-kt-2",
                    title = "Manejo Seguro de Nulos",
                    description = "Dada una cadena opcional `name: String?`, retorna el tamaño de la cadena si no es nula, o 0 si es nula utilizando el operador Elvis (`?:`).",
                    difficulty = "Intermedio",
                    initialCode = """
                        fun getLength(name: String?): Int {
                            // Usa el operador Elvis ?:
                            return 0
                        }
                    """.trimIndent(),
                    solutionCode = """
                        fun getLength(name: String?): Int {
                            return name?.length ?: 0
                        }
                    """.trimIndent(),
                    explanation = "`name?.length` evalúa de forma segura a `Int?` (o null). El operador `?:` provee el valor por defecto `0` si es nulo.",
                    hints = listOf("Combina el operador de navegación segura `?.` con el operador Elvis `?:`.")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-kt-1",
                    question = "¿Qué palabra clave se usa en Kotlin para declarar una variable inmutable (de solo lectura)?",
                    options = listOf("var", "val", "let", "const"),
                    correctOptionIndex = 1,
                    explanation = "`val` se utiliza para declarar variables cuyo valor no puede ser reasignado una vez inicializado."
                ),
                QuizQuestion(
                    id = "q-kt-2",
                    question = "¿Cuál es el beneficio principal de los Null Safety (tipos anulables) en Kotlin?",
                    options = listOf(
                        "Evitar el famoso NullPointerException en tiempo de compilación",
                        "Hacer que el código ejecute más rápido en la JVM",
                        "Permitir la herencia múltiple",
                        "Convertir todo el código a JavaScript"
                    ),
                    correctOptionIndex = 0,
                    explanation = "Kotlin distingue entre tipos que pueden ser nulos (`String?`) y los que no (`String`), eliminando errores de NullPointerException en tiempo de compilación."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-kt-1",
                    title = "Curso Completo de Kotlin para Principiantes",
                    channelName = "Android Developers / MoureDev",
                    duration = "2h 45m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=7M_sC6Fk0yQ"
                ),
                VideoResource(
                    id = "v-kt-2",
                    title = "Aprende Jetpack Compose desde Cero",
                    channelName = "Aristodevs",
                    duration = "3h 15m",
                    level = "Intermedio",
                    videoUrl = "https://www.youtube.com/watch?v=kYv_3c3oYTU"
                )
            )
        ),
        Language(
            id = "python",
            name = "Python",
            tagline = "Legible, potente y el rey de la Inteligencia Artificial",
            description = "Python es un lenguaje de programación interpretado de alto nivel, conocido por su sintaxis extremadamente clara y limpia. Es el estándar de la industria en Inteligencia Artificial, Ciencia de Datos y Desarrollo Web.",
            history = "Creado por Guido van Rossum a finales de los 80 en los Países Bajos como sucesor del lenguaje ABC. Fue publicado por primera vez en 1991. Su nombre proviene del grupo de comedia británico Monty Python.",
            yearCreated = 1991,
            creator = "Guido van Rossum",
            paradigm = "Multi-paradigma (Orientado a Objetos, Imperativo, Funcional)",
            colorHex = 0xFF3776AB,
            category = LanguageCategory.DATA_SCIENCE,
            syntaxExample = """
                def greet(name: str) -> str:
                    fruits = ["Manzana", "Banana", "Cereza"]
                    return f"¡Hola {name}! Tus frutas son: {', '.join(fruits)}"

                if __name__ == "__main__":
                    print(greet("Desarrollador"))
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "py-django",
                    name = "Django",
                    description = "Framework web de alto nivel que fomenta un desarrollo rápido y un diseño limpio y pragmático con filosofía 'baterías incluidas'.",
                    useCase = "Desarrollo Web Full Stack seguro y escalable",
                    officialUrl = "https://www.djangoproject.com/"
                ),
                Framework(
                    id = "py-fastapi",
                    name = "FastAPI",
                    description = "Framework moderno y de alto rendimiento para construir APIs con Python 3.8+ basado en anotaciones de tipos estándar.",
                    useCase = "APIs REST de alto rendimiento y Microservicios",
                    officialUrl = "https://fastapi.tiangolo.com/"
                ),
                Framework(
                    id = "py-pytorch",
                    name = "PyTorch",
                    description = "Biblioteca líder de aprendizaje profundo (Deep Learning) desarrollada por Meta para redes neuronales y visión por computador.",
                    useCase = "Machine Learning y Modelos de IA Generativa",
                    officialUrl = "https://pytorch.org/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-py-1",
                    title = "Invertir una Cadena",
                    description = "Escribe una función en Python que invierta una cadena dada usando el operador de slicing `[::-1]`.",
                    difficulty = "Principiante",
                    initialCode = """
                        def reverse_string(text: str) -> str:
                            # Tu código aquí
                            return text
                    """.trimIndent(),
                    solutionCode = """
                        def reverse_string(text: str) -> str:
                            return text[::-1]
                    """.trimIndent(),
                    explanation = "El troceado o slicing `[::-1]` recorre la cadena desde el final hacia el principio con paso -1.",
                    hints = listOf("Explora la sintaxis de slicing `cadena[inicio:fin:paso]`.")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-py-1",
                    question = "¿Cómo se define un bloque de función en Python?",
                    options = listOf("function myFunc():", "def my_func():", "fn my_func() {}", "void myFunc()"),
                    correctOptionIndex = 1,
                    explanation = "En Python se usa la palabra clave `def` seguida del nombre de la función y dos puntos."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-py-1",
                    title = "Curso de Python desde Cero para Principiantes",
                    channelName = "MoureDev",
                    duration = "4h 00m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=Kp4Mvapo5kc"
                )
            )
        ),
        Language(
            id = "javascript",
            name = "JavaScript",
            tagline = "El lenguaje de la Web y el motor del desarrollo Frontend",
            description = "JavaScript es un lenguaje dinámico, débilmente tipado y basado en prototipos que impulsa el 98% del ecosistema web interactivo mundial tanto en el navegador como en el servidor.",
            history = "Creado en solo 10 días por Brendan Eich en Netscape en mayo de 1995 bajo el nombre Netscape Navigator / Mocha, luego LiveScript y finalmente JavaScript para alinearse a la popularidad de Java.",
            yearCreated = 1995,
            creator = "Brendan Eich",
            paradigm = "Multi-paradigma (Event-driven, Prototípico, Funcional)",
            colorHex = 0xFFF7DF1E,
            category = LanguageCategory.FRONTEND,
            syntaxExample = """
                const users = [
                    { name: 'Ana', age: 25 },
                    { name: 'Carlos', age: 30 }
                ];
                const names = users.map(u => u.name.toUpperCase());
                console.log("Usuarios: " + names.join(", "));
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "js-react",
                    name = "React",
                    description = "Biblioteca de UI desarrollada por Meta para construir interfaces interactivas basadas en componentes reutilizables y Virtual DOM.",
                    useCase = "Aplicaciones Web Frontend SPA y PWA",
                    officialUrl = "https://react.dev/"
                ),
                Framework(
                    id = "js-next",
                    name = "Next.js",
                    description = "Framework de React para aplicaciones web con renderizado en el servidor (SSR), generación estática (SSG) y APIs de servidor.",
                    useCase = "Desarrollo Web Fullstack e Integración SEO",
                    officialUrl = "https://nextjs.org/"
                ),
                Framework(
                    id = "js-express",
                    name = "Express.js",
                    description = "Framework minimalista y flexible para Node.js que proporciona un conjunto sólido de funciones para web y APIs.",
                    useCase = "Backend de Servidores HTTP en Node.js",
                    officialUrl = "https://expressjs.com/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-js-1",
                    title = "Sumar elementos de una Lista",
                    description = "Usa el método `.reduce()` para calcular la suma total de un arreglo de números.",
                    difficulty = "Principiante",
                    initialCode = """
                        function sumArray(arr) {
                            // Tu código aquí
                            return 0;
                        }
                    """.trimIndent(),
                    solutionCode = """
                        function sumArray(arr) {
                            return arr.reduce((acc, curr) => acc + curr, 0);
                        }
                    """.trimIndent(),
                    explanation = "El método `reduce` acumula el resultado aplicando una función a cada elemento del arreglo.",
                    hints = listOf("`arr.reduce((acumulador, actual) => acumulador + actual, 0)`")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-js-1",
                    question = "¿Cuál es la diferencia entre `==` y `===` en JavaScript?",
                    options = listOf(
                        "`==` compara valor convirtiendo tipos, mientras `===` compara valor y tipo estrictamente",
                        "No hay diferencia, son idénticos",
                        "`===` se usa solo para cadenas de texto",
                        "`==` es más rápido que `===`"
                    ),
                    correctOptionIndex = 0,
                    explanation = "`===` es la comparación estricta de igualdad que no realiza conversión implícita de tipos."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-js-1",
                    title = "Curso de JavaScript para Principiantes",
                    channelName = "midulive",
                    duration = "5h 20m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=Q9fwkxa7jL0"
                )
            )
        ),
        Language(
            id = "java",
            name = "Java",
            tagline = "Escribe una vez, ejecuta en cualquier lugar (WORA)",
            description = "Java es un lenguaje Orientado a Objetos robusto, ampliamente utilizado en el desarrollo empresarial, infraestructura de servidores bancarios, sistemas Android heredados y microservicios a gran escala.",
            history = "Desarrollado por James Gosling en Sun Microsystems y lanzado en 1995. Su máquina virtual (JVM) revolucionó el desarrollo multiplataforma. Fue adquirido por Oracle Corporation en 2010.",
            yearCreated = 1995,
            creator = "James Gosling (Sun Microsystems)",
            paradigm = "Orientado a Objetos estricto, Concurrente",
            colorHex = 0xFFED8B00,
            category = LanguageCategory.BACKEND,
            syntaxExample = """
                public class Main {
                    public static void main(String[] args) {
                        System.out.println("¡Hola desde Java!");
                        var list = java.util.List.of("Spring", "Hibernate", "Quarkus");
                        list.forEach(System.out::println);
                    }
                }
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "jv-spring",
                    name = "Spring Boot",
                    description = "El estándar de la industria para la creación de microservicios empresarial de alta disponibilidad con Inyección de Dependencias.",
                    useCase = "Backend Empresarial & Microservicios",
                    officialUrl = "https://spring.io/projects/spring-boot"
                ),
                Framework(
                    id = "jv-quarkus",
                    name = "Quarkus",
                    description = "Framework de Java nativo para Kubernetes adaptado para GraalVM y HotSpot con tiempos de arranque ultrarrápidos.",
                    useCase = "Servicios Cloud-Native en Kubernetes",
                    officialUrl = "https://quarkus.io/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-jv-1",
                    title = "Comprobar Palíndromo",
                    description = "Determina si una cadena dada es un palíndromo leyendo igual de izquierda a derecha que de derecha a izquierda.",
                    difficulty = "Intermedio",
                    initialCode = """
                        public boolean isPalindrome(String str) {
                            // Tu código aquí
                            return false;
                        }
                    """.trimIndent(),
                    solutionCode = """
                        public boolean isPalindrome(String str) {
                            String reversed = new StringBuilder(str).reverse().toString();
                            return str.equalsIgnoreCase(reversed);
                        }
                    """.trimIndent(),
                    explanation = "StringBuilder.reverse() permite invertir fácilmente una cadena para comparar.",
                    hints = listOf("Usa `StringBuilder` o dos punteros.")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-jv-1",
                    question = "¿Qué significa la sigla JVM?",
                    options = listOf(
                        "Java Virtual Machine",
                        "Java Visual Manager",
                        "Joint Variable Method",
                        "Java Vector Matrix"
                    ),
                    correctOptionIndex = 0,
                    explanation = "La Máquina Virtual de Java (JVM) ejecuta el código bytecode compilado en cualquier sistema operativo."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-jv-1",
                    title = "Curso de Java desde Cero",
                    channelName = "Píldoras Informáticas",
                    duration = "6h 10m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=coK4jM5wvko"
                )
            )
        ),
        Language(
            id = "rust",
            name = "Rust",
            tagline = "Rendimiento, seguridad de memoria y concurrencia sin sobrecarga",
            description = "Rust es un lenguaje de programación de sistemas centrado en la seguridad, la velocidad y la concurrencia segura sin la necesidad de un recolector de basura (Garbage Collector).",
            history = "Iniciado por Graydon Hoare en Mozilla Research en 2006 y lanzado oficialmente en versión 1.0 en 2015. Ha sido votado repetidamente como el lenguaje más amado por los desarrolladores en Stack Overflow.",
            yearCreated = 2015,
            creator = "Graydon Hoare (Mozilla Research)",
            paradigm = "Sistemas, Concurrente, Funcional",
            colorHex = 0xFFDEA584,
            category = LanguageCategory.SYSTEMS,
            syntaxExample = """
                fn main() {
                    let greeting = String::from("¡Hola, Rust!");
                    let numbers = vec![1, 2, 3];
                    println!("{} -> {:?}", greeting, numbers);
                }
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "rs-actix",
                    name = "Actix Web",
                    description = "Framework web pragmático, extremadamente rápido y seguro basado en el modelo de actores.",
                    useCase = "Servidores Web de ultra alto rendimiento",
                    officialUrl = "https://actix.rs/"
                ),
                Framework(
                    id = "rs-tokio",
                    name = "Tokio",
                    description = "Runtime asíncrono para Rust que provee E/S de red no bloqueante, temporizadores y pools de hilos.",
                    useCase = "Programación Asíncrona y Redes",
                    officialUrl = "https://tokio.rs/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-rs-1",
                    title = "Propiedad (Ownership) y Préstamos",
                    description = "Corrige la firma de la función para tomar una referencia prestada `&String` en lugar de consumir la propiedad.",
                    difficulty = "Intermedio",
                    initialCode = """
                        fn print_length(s: String) {
                            println!("{}", s.len());
                        }
                    """.trimIndent(),
                    solutionCode = """
                        fn print_length(s: &String) {
                            println!("{}", s.len());
                        }
                    """.trimIndent(),
                    explanation = "Usar `&String` crea una referencia prestada de solo lectura, evitando mover la propiedad del objeto.",
                    hints = listOf("Agrega el símbolo `&` antes de `String`.")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-rs-1",
                    question = "¿Cómo gestiona Rust la memoria sin usar un Garbage Collector?",
                    options = listOf(
                        "Mediante el sistema de Propiedad (Ownership) y Reglas de Préstamo (Borrowing) en compilación",
                        "Usando malloc y free automáticos",
                        "Delega toda la memoria al sistema operativo",
                        "Usando un contador de referencias obligatorio para todas las variables"
                    ),
                    correctOptionIndex = 0,
                    explanation = "El compilador de Rust analiza la vida de las variables con el modelo de Ownership durante la compilación."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-rs-1",
                    title = "Rust desde Cero: Conceptos Fundamentales",
                    channelName = "DotCSV",
                    duration = "2h 30m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=5rT-_M_72pU"
                )
            )
        ),
        Language(
            id = "cpp",
            name = "C++",
            tagline = "Control total del hardware y alto rendimiento gráfico/sistemas",
            description = "C++ es una extensión del lenguaje C que añade programación orientada a objetos, plantillas y abstracciones de cero coste. Es la base de motores de videojuegos (Unreal Engine), navegadores web y sistemas operativos.",
            history = "Diseñado por Bjarne Stroustrup en Bell Labs a partir de 1979 como 'C con Clases' y renombrado a C++ en 1983.",
            yearCreated = 1985,
            creator = "Bjarne Stroustrup",
            paradigm = "Multi-paradigma, Procedimental, Generativo",
            colorHex = 0xFF00599C,
            category = LanguageCategory.SYSTEMS,
            syntaxExample = """
                #include <iostream>
                #include <vector>

                int main() {
                    std::vector<int> nums = {10, 20, 30};
                    for (int n : nums) {
                        std::cout << n << " ";
                    }
                    return 0;
                }
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "cpp-qt",
                    name = "Qt",
                    description = "Framework multiplataforma para la creación de interfaces gráficas de usuario (GUI) y sistemas embebidos.",
                    useCase = "Aplicaciones de escritorio y sistemas de automoción",
                    officialUrl = "https://www.qt.io/"
                ),
                Framework(
                    id = "cpp-unreal",
                    name = "Unreal Engine C++ API",
                    description = "Motor de videojuegos AAA de Epic Games donde C++ se usa para la lógica de gameplay crítica.",
                    useCase = "Desarrollo de Videojuegos 3D",
                    officialUrl = "https://www.unrealengine.com/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-cpp-1",
                    title = "Uso de Smart Pointers (std::unique_ptr)",
                    description = "Escribe una línea de código que cree un `std::unique_ptr<int>` asignando el valor 42.",
                    difficulty = "Avanzado",
                    initialCode = """
                        // Crea un unique_ptr seguro
                    """.trimIndent(),
                    solutionCode = """
                        auto ptr = std::make_unique<int>(42);
                    """.trimIndent(),
                    explanation = "`std::make_unique<T>(val)` asigna memoria de forma segura y garantiza su liberación automática.",
                    hints = listOf("Utiliza `std::make_unique<int>(42)`")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-cpp-1",
                    question = "¿Qué operador se utiliza en C++ para liberar memoria asignada dinámicamente con `new`?",
                    options = listOf("delete", "free", "remove", "clean"),
                    correctOptionIndex = 0,
                    explanation = "La memoria reservada con `new` debe liberarse explícitamente con `delete` o `delete[]` si no se usan smart pointers."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-cpp-1",
                    title = "Curso de C++ desde Cero",
                    channelName = "Programación Ats",
                    duration = "4h 45m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=_b07b6M7tYc"
                )
            )
        ),
        Language(
            id = "swift",
            name = "Swift",
            tagline = "Rápido, seguro e intuitivo para el ecosistema Apple",
            description = "Swift es el lenguaje de programación moderno creado por Apple para construir aplicaciones en iOS, macOS, watchOS, tvOS y visionOS.",
            history = "Presentado en la WWDC de Apple en 2014 por Chris Lattner y su equipo. Reemplazó a Objective-C modernizando el desarrollo para dispositivos Apple.",
            yearCreated = 2014,
            creator = "Apple (Chris Lattner et al.)",
            paradigm = "Orientado a Protocolos, Funcional, Imperativo",
            colorHex = 0xFFF05138,
            category = LanguageCategory.MOBILE,
            syntaxExample = """
                import Foundation

                let name = "Swift"
                var features = ["Safety", "Speed", "Expressive"]
                print("¡Hola \(name)! Características: \(features)")
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "sw-swiftui",
                    name = "SwiftUI",
                    description = "Framework declarativo moderno de Apple para diseñar la interfaz de usuario en todas las plataformas Apple.",
                    useCase = "Desarrollo de UI iOS / macOS / visionOS",
                    officialUrl = "https://developer.apple.com/xcode/swiftui/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-sw-1",
                    title = "Optional Unwrapping con guard let",
                    description = "Escribe una función que use `guard let` para desempaquetar un `String?` y retornar temprano si es nulo.",
                    difficulty = "Intermedio",
                    initialCode = """
                        func greet(name: String?) {
                            // Tu guard let aquí
                        }
                    """.trimIndent(),
                    solutionCode = """
                        func greet(name: String?) {
                            guard let validName = name else {
                                print("Sin nombre")
                                return
                            }
                            print("Hola, \(validName)")
                        }
                    """.trimIndent(),
                    explanation = "`guard let` valida la existencia del valor opcional antes de continuar el flujo.",
                    hints = listOf("Recuerda la palabra clave `guard let validName = name else { return }`.")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-sw-1",
                    question = "¿Qué framework declarativo de Apple se usa principalmente con Swift para crear UIs?",
                    options = listOf("SwiftUI", "UIKit", "CoreGraphics", "AppKit"),
                    correctOptionIndex = 0,
                    explanation = "SwiftUI es la solución declarativa de Apple para crear la interfaz gráfica en todas sus plataformas."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-sw-1",
                    title = "Curso de Swift y SwiftUI para iOS",
                    channelName = "Brais Moure",
                    duration = "3h 40m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=cw_R9XvIq_E"
                )
            )
        ),
        Language(
            id = "go",
            name = "Go (Golang)",
            tagline = "Simple, eficiente y diseñado para concurrencia en la nube",
            description = "Go es un lenguaje de código abierto desarrollado por Google que facilita la creación de software simple, confiable y eficiente con soporte nativo para goroutines.",
            history = "Creado por Robert Griesemer, Rob Pike y Ken Thompson en Google en 2007 y anunciado públicamente en 2009. Fue creado para resolver la complejidad de C++ en los servidores de Google.",
            yearCreated = 2009,
            creator = "Google (Robert Griesemer, Rob Pike, Ken Thompson)",
            paradigm = "Concurrente, Compilado, Imperativo",
            colorHex = 0xFF00ADD8,
            category = LanguageCategory.BACKEND,
            syntaxExample = """
                package main
                import "fmt"

                func main() {
                    ch := make(chan string)
                    go func() {
                        ch <- "¡Hola desde una Goroutine!"
                    }()
                    fmt.Println(<-ch)
                }
            """.trimIndent(),
            frameworks = listOf(
                Framework(
                    id = "go-gin",
                    name = "Gin Gonic",
                    description = "Framework web HTTP escrito en Go con rendimiento tipo Martini pero hasta 40 veces más rápido gracias a httprouter.",
                    useCase = "APIs REST ultrarrápidas y Microservicios",
                    officialUrl = "https://gin-gonic.com/"
                ),
                Framework(
                    id = "go-fiber",
                    name = "Fiber",
                    description = "Framework web inspirado en Express de Node.js construido sobre Fasthttp, el motor HTTP más rápido para Go.",
                    useCase = "APIs REST y Servidores Web",
                    officialUrl = "https://gofiber.io/"
                )
            ),
            exercises = listOf(
                Exercise(
                    id = "ex-go-1",
                    title = "Lanzar una Goroutine",
                    description = "Usa la palabra clave `go` para ejecutar una función anónima en segundo plano.",
                    difficulty = "Principiante",
                    initialCode = """
                        func runAsync() {
                            // Ejecuta una función anónima con la palabra go
                        }
                    """.trimIndent(),
                    solutionCode = """
                        func runAsync() {
                            go func() {
                                fmt.Println("Ejecutando en goroutine")
                            }()
                        }
                    """.trimIndent(),
                    explanation = "Anteponer `go` a cualquier llamada de función inicia su ejecución concurrente en un hilo ligero (goroutine).",
                    hints = listOf("Utiliza `go func() { ... }()`")
                )
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    id = "q-go-1",
                    question = "¿Qué mecanismo nativo ofrece Go para la comunicación entre goroutines?",
                    options = listOf("Canales (Channels)", "Variables globales mutables", "Promises", "Callbacks"),
                    correctOptionIndex = 0,
                    explanation = "Los canales (`chan`) permiten enviar y recibir valores de forma segura entre goroutines."
                )
            ),
            videos = listOf(
                VideoResource(
                    id = "v-go-1",
                    title = "Curso de Go (Golang) desde Cero",
                    channelName = "EDteam",
                    duration = "3h 00m",
                    level = "Principiante",
                    videoUrl = "https://www.youtube.com/watch?v=un6ZyFkqFKo"
                )
            )
        )
    )

    fun getLanguageById(id: String): Language? {
        return languages.find { it.id == id }
    }

    fun filterLanguages(query: String, category: LanguageCategory): List<Language> {
        return languages.filter { lang ->
            (category == LanguageCategory.ALL || lang.category == category) &&
            (query.isEmpty() ||
             lang.name.contains(query, ignoreCase = true) ||
             lang.tagline.contains(query, ignoreCase = true) ||
             lang.description.contains(query, ignoreCase = true) ||
             lang.paradigm.contains(query, ignoreCase = true))
        }
    }
}
