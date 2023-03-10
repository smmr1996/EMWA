/*
 * Copyright 2023 the original author or authors.
 */

package com.application.emwa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmwaApplication

fun main(args: Array<String>) {
	runApplication<EmwaApplication>(*args)
}
