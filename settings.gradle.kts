pluginManagement {
    repositories {
        google()
        maven { url = uri("https://ejemplo.com/repositorio/maven") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CoffeeShop"
include(":app")
 