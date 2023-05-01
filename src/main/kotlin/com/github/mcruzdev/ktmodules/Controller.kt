package com.github.mcruzdev.ktmodules

import com.github.mcruzdev.ktmodules.email.EmailProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/email")
class Controller {

    @GetMapping
    fun get(): EmailProperties {
        return EmailProperties("Matheus Cruz", "matheuscruz.dev@gmail.com", "You are working a lot!")
    }
}