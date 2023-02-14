/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @GetMapping(path = ["/welcome", "/"])
    fun welcome(@RequestParam(defaultValue = "User") name: String): String {
        return "Greetings $name! \n Please select one of the following \n1. /create-employee (firstName, " +
                "middleName(Optional), lastName, dateOfBirth"
    }
}