package com.mrvw.creditapplicationsystem.exception

import java.time.LocalDateTime

data class ExceptionDetails(
    var title: String,
    val timestamp: LocalDateTime,
    val status: Int,
    val exception: String,
    val details: MutableMap<String, String?>
)
