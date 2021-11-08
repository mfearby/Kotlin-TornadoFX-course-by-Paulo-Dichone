package com.example.model

import java.time.LocalDate
import java.time.Period

class Student(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val birthday: LocalDate
) {
    val age: Int
        get() = Period.between(birthday, LocalDate.now()).years

}