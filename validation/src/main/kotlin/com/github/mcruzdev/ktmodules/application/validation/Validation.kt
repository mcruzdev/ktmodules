package com.github.mcruzdev.ktmodules.email

class Email {

    companion object {

        fun newInstance(): Email {
            return Email()
        }
    }

    fun send(props: EmailProperties) {
        println("Sending email to $props")
    }
}

data class EmailProperties(
    val name: String,
    val email: String,
    val message: String
)