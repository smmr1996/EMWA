/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.facade.employee

import com.application.emwa.domain.employee.Employee
import com.application.emwa.service.employee.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeFacade(
    private val employeeService: EmployeeService
) {

    @GetMapping(value = ["/create-employee"])
    fun createEmployee(firstName: String, middleName: String?, lastName: String, dateOfBirth: String): Employee {
        validateInputs(firstName, lastName, dateOfBirth)
        return employeeService.persistEmployee(firstName, middleName, lastName, dateOfBirth)
    }

    private fun validateInputs(firstName: String, lastName: String, dateOfBirth: String) {
        if (firstName.isBlank() || lastName.isBlank() || dateOfBirth.isBlank())
            throw Exception("First Name, Last Name and Date of Birth cannot be empty!")
    }
}