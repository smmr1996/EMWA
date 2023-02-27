package com.application.emwa.repository.employee

import com.application.emwa.domain.employee.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Long> {


}