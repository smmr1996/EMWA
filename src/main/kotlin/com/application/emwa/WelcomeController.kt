package com.application.emwa

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @GetMapping(path = ["/welcome"])
    fun welcome(@RequestParam(value = "name", defaultValue = "User") name: String): String {
        return "Welcome $name"
    }
}