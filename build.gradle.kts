plugins {
    id("com.diffplug.spotless") version "6.25.0"
}

spotless {
    kotlinGradle {
        target("**/*gradle.kts")
        ktlint()
    }
    yaml {
        target("**/*.yaml")
        prettier()
    }
    format("markdown") {
        target("**/*.md")
        prettier().config(mapOf("proseWrap" to "always"))
    }
}
