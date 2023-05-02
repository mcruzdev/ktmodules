import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName

plugins {
    application

//    kotlin
    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.7.22"

//    spring
    id("org.springframework.boot") version "3.0.6"
    id("io.spring.dependency-management") version "1.1.0"

}

group = "com.github.mcruzdev.ktmodules.application"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    //    spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // jackson-module-kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation(project(mapOf("path" to ":validation")))

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootJar {
    archivesName.set("application.jar")
    mainClass.set("Main.kt")
}