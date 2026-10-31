package com.example.tarea.model

enum class LanguageCategory(val displayName: String) {
    ALL("Todos"),
    MOBILE("Móvil"),
    BACKEND("Backend"),
    FRONTEND("Web Frontend"),
    SYSTEMS("Sistemas"),
    DATA_SCIENCE("Ciencia de Datos y AI")
}

data class Framework(
    val id: String,
    val name: String,
    val description: String,
    val useCase: String,
    val officialUrl: String,
    val popularityStars: String = "★★★★★"
)

data class Exercise(
    val id: String,
    val title: String,
    val description: String,
    val difficulty: String, // Principiante, Intermedio, Avanzado
    val initialCode: String,
    val solutionCode: String,
    val explanation: String,
    val hints: List<String> = emptyList()
)

data class QuizQuestion(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctOptionIndex: Int,
    val explanation: String
)

data class VideoResource(
    val id: String,
    val title: String,
    val channelName: String,
    val duration: String,
    val level: String, // Principiante, Intermedio, Avanzado
    val videoUrl: String
)

data class Language(
    val id: String,
    val name: String,
    val tagline: String,
    val description: String,
    val history: String,
    val yearCreated: Int,
    val creator: String,
    val paradigm: String,
    val colorHex: Long,
    val category: LanguageCategory,
    val syntaxExample: String,
    val frameworks: List<Framework>,
    val exercises: List<Exercise>,
    val quizQuestions: List<QuizQuestion>,
    val videos: List<VideoResource>,
    val isFavorite: Boolean = false
)
