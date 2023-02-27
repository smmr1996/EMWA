package com.application.emwa.utils

import java.lang.RuntimeException

class EmwaException(
    resourceName: String,
    fieldName: String,
    fieldValue: String
): RuntimeException("$resourceName not found with $fieldName: $fieldValue")