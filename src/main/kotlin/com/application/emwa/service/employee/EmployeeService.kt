/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.service.employee

import com.application.emwa.domain.employee.Employee
import org.springframework.stereotype.Component

@Component
class EmployeeService(
    private val employeeDetails: EmployeeDetailsService
) {
    var id = 0L
    val employeeMap = mutableMapOf<Long, Employee>()

    fun persistEmployee(firstName: String, middleName: String?, lastName: String, dateOfBirth: String): Employee {
        id = id.inc()
        val employee = employeeDetails.createEmployee(id, firstName, middleName, lastName, dateOfBirth)
        employeeMap[id] = employee
        return employee
    }

}