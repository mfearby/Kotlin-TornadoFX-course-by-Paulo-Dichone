package com.example.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import java.time.LocalDate
import java.time.Period
import tornadofx.*

class Student(
    id: Int,
    firstName: String,
    lastName: String,
    birthday: LocalDate
) {
    val idProperty = SimpleIntegerProperty(id)
    var id by idProperty

    val firstNameProperty = SimpleStringProperty(firstName)
    var firstName by firstNameProperty

    val lastNameProperty = SimpleStringProperty(lastName)
    var lastName by lastNameProperty

    val birthdayProperty = SimpleObjectProperty(birthday)
    var birthday by birthdayProperty

    val age: Int
        get() = Period.between(birthday, LocalDate.now()).years
}


//class Student(
//    val id: Int,
//    val firstName: String,
//    val lastName: String,
//    val birthday: LocalDate
//) {
//    val age: Int
//        get() = Period.between(birthday, LocalDate.now()).years
//
//}