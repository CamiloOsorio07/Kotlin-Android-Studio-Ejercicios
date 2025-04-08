package com.example.ciamep.curiosfacts.model
/**
 * Representa un dato curioso para un día.
 */
data class Fact(
    val day: Int,
    val title: String,
    val description: String,
    val imageResId: Int
)