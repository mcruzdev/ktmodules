package com.github.mcruzdev.ktmodules.application;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Main

fun main(vararg args: String) {
    SpringApplication.run(Main::class.java, *args)
}
