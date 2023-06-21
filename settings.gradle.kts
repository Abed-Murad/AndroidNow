pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
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

rootProject.name = "now"
include(":app")
include(":core:designsystem")
include(":feature:foryou")
include(":core:data")
include(":core:model")
include(":feature:interests")
include(":feature:bookmarks")
include(":feature:topic")
include(":feature:search")
include(":feature:settings")
include(":core:common")
include(":core:ui")
include(":core:analytics")
include(":sync:work")
include(":core:testing")
include(":core:datastore-test")
include(":core:data-test")
include(":core:network")
include(":ui-test-hilt-manifest")
include(":core:domain")
include(":lint")
include(":core:datastore")
