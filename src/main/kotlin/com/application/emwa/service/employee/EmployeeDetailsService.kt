/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.service.employee

import com.application.emwa.domain.employee.Employee
import com.application.emwa.utils.DateUtils
import org.springframework.stereotype.Service

@Service
class EmployeeDetailsService(
    private val dateUtils: DateUtils
) {

    fun createEmployee(
        id: Long,
        firstName: String,
        middleName: String? = null,
        lastName: String,
        dateOfBirth: String
    ): Employee {
        return Employee(
            id,
            firstName,
            middleName,
            lastName,
            dateUtils.convertStringDateToLocalDate(dateOfBirth)
        )
    }
}