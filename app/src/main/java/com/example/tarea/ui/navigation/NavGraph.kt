package com.example.tarea.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tarea.data.LanguageRepository
import com.example.tarea.model.Language
import com.example.tarea.model.LanguageCategory
import com.example.tarea.model.QuizQuestion
import com.example.tarea.ui.screens.FavoritesScreen
import com.example.tarea.ui.screens.HomeScreen
import com.example.tarea.ui.screens.LanguageDetailScreen
import com.example.tarea.ui.screens.QuizScreen

enum class NavDestination(val label: String) {
    HOME("Explorar"),
    FAVORITES("Favoritos"),
    DETAIL("Detalle"),
    QUIZ("Quiz")
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    var currentDestination by remember { mutableStateOf(NavDestination.HOME) }
    var selectedLanguage by remember { mutableStateOf<Language?>(null) }
    var quizTitle by remember { mutableStateOf("Quiz de Programación") }
    var quizQuestions by remember { mutableStateOf<List<QuizQuestion>>(emptyList()) }

    var selectedCategory by remember { mutableStateOf(LanguageCategory.ALL) }
    var searchQuery by remember { mutableStateOf("") }
    var favoriteIds by remember { mutableStateOf(setOf("kotlin", "python")) }

    val allLanguages = LanguageRepository.languages
    val filteredLanguages = remember(searchQuery, selectedCategory) {
        LanguageRepository.filterLanguages(searchQuery, selectedCategory)
    }

    val favoriteLanguages = remember(favoriteIds) {
        allLanguages.filter { favoriteIds.contains(it.id) }
    }

    val onFavoriteToggle: (Language) -> Unit = { lang ->
        favoriteIds = if (favoriteIds.contains(lang.id)) {
            favoriteIds - lang.id
        } else {
            favoriteIds + lang.id
        }
    }

    val startGeneralQuiz: () -> Unit = {
        quizTitle = "Quiz General de Lenguajes"
        quizQuestions = allLanguages.flatMap { it.quizQuestions }.shuffled()
        currentDestination = NavDestination.QUIZ
    }

    val startLanguageQuiz: (Language) -> Unit = { lang ->
        quizTitle = "Quiz de ${lang.name}"
        quizQuestions = lang.quizQuestions
        currentDestination = NavDestination.QUIZ
    }

    Scaffold(
        bottomBar = {
            if (currentDestination != NavDestination.DETAIL && currentDestination != NavDestination.QUIZ) {
                NavigationBar {
                    NavigationBarItem(
                        selected = currentDestination == NavDestination.HOME,
                        onClick = { currentDestination = NavDestination.HOME },
                        icon = { Icon(Icons.Default.Code, contentDescription = "Explorar", modifier = Modifier.size(22.dp)) },
                        label = { Text(NavDestination.HOME.label) }
                    )
                    NavigationBarItem(
                        selected = currentDestination == NavDestination.FAVORITES,
                        onClick = { currentDestination = NavDestination.FAVORITES },
                        icon = { Icon(Icons.Default.Favorite, contentDescription = "Favoritos", modifier = Modifier.size(22.dp)) },
                        label = { Text(NavDestination.FAVORITES.label) }
                    )
                    NavigationBarItem(
                        selected = currentDestination == NavDestination.QUIZ,
                        onClick = startGeneralQuiz,
                        icon = { Icon(Icons.Default.School, contentDescription = "Quiz General", modifier = Modifier.size(22.dp)) },
                        label = { Text("Quiz General") }
                    )
                }
            }
        },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        when (currentDestination) {
            NavDestination.HOME -> {
                HomeScreen(
                    languages = filteredLanguages,
                    selectedCategory = selectedCategory,
                    onCategorySelected = { selectedCategory = it },
                    searchQuery = searchQuery,
                    onSearchQueryChange = { searchQuery = it },
                    onLanguageClick = { lang ->
                        selectedLanguage = lang
                        currentDestination = NavDestination.DETAIL
                    },
                    onFavoriteToggle = onFavoriteToggle,
                    favoriteIds = favoriteIds,
                    onStartGeneralQuizClick = startGeneralQuiz,
                    modifier = Modifier.padding(innerPadding)
                )
            }

            NavDestination.FAVORITES -> {
                FavoritesScreen(
                    favoriteLanguages = favoriteLanguages,
                    onLanguageClick = { lang ->
                        selectedLanguage = lang
                        currentDestination = NavDestination.DETAIL
                    },
                    onFavoriteToggle = onFavoriteToggle,
                    modifier = Modifier.padding(innerPadding)
                )
            }

            NavDestination.DETAIL -> {
                selectedLanguage?.let { lang ->
                    LanguageDetailScreen(
                        language = lang,
                        onBackClick = { currentDestination = NavDestination.HOME },
                        onFavoriteToggle = onFavoriteToggle,
                        isFavorite = favoriteIds.contains(lang.id),
                        onStartLanguageQuiz = startLanguageQuiz,
                        modifier = Modifier.padding(innerPadding)
                    )
                } ?: run {
                    currentDestination = NavDestination.HOME
                }
            }

            NavDestination.QUIZ -> {
                QuizScreen(
                    title = quizTitle,
                    questions = quizQuestions,
                    onBackClick = { currentDestination = NavDestination.HOME },
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}
