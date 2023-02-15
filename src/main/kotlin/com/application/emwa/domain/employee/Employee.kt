/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.domain.employee

import java.time.LocalDate

data class Employee(
    val id: Long,
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val dateOfBirth: LocalDate
)
