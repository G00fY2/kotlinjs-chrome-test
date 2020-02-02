plugins {
    id("org.jetbrains.kotlin.js") version "1.3.70-eap-42"
}

group = "com.g00fy2"
version = "1.0"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin.target.browser { }