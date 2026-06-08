package com.blas.lifecyclebasic2.model

data class Email(
    val id: Int,
    val sender: String,
    val subject: String,
    val content: String,
    val timestamp: String
)