/*
 * Copyright 2023 the original author or authors.
 */
package com.application.emwa.domain.employee

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "employee")
class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long,
    @Column(name= "first_name", nullable = false)
    val firstName: String,
    @Column(name= "middle_name", nullable = true)
    val middleName: String?,
    @Column(name= "last_name", nullable = false)
    val lastName: String,
    @Column(name= "date_of_birth", nullable = false)
    val dateOfBirth: LocalDate
)
