import org.gradle.api.artifacts.dsl.RepositoryHandler


pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "KotlinExercise"
include(":app")
 