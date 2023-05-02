plugins {
    kotlin("jvm") version "1.8.21"
}

group = "com.github.mcruzdev.ktmodules.validation"
version = "0.0.1"

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

tasks.test {
    useJUnitPlatform()
}