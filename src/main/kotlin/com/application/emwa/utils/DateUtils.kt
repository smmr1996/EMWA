/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.utils

import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.format.DateTimeParseException

@Service
class DateUtils {

    fun convertStringDateToLocalDate(date: String): LocalDate {
        try {
            return LocalDate.parse(date)
        } catch (e: DateTimeParseException) {
            println("Failed to Parse Date $date")
            throw Exception("Date not in correct format")
        }
    }
}