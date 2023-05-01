package com.github.mcruzdev.ktmodules

import com.github.mcruzdev.ktmodules.email.Email
import com.github.mcruzdev.ktmodules.email.EmailProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtmodulesApplication

fun main(args: Array<String>) {

    val email = Email.newInstance()
    email.send(EmailProperties("Matheus Cruz", "matheuscruz.dev@gmail.com", "You are working a lot!"))
    runApplication<KtmodulesApplication>(*args)
}





