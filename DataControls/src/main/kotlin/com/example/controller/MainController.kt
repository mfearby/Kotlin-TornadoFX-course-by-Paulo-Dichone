package com.example.controller

import com.example.model.Student
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller
import java.time.LocalDate

class MainController: Controller() {

    val mutableNames: ObservableList<String> = FXCollections.observableArrayList(
        "Wolfgang Amadeus Mozart",
        "Johann Sebastian Bach",
        "George Friedrich Handel",
        "Ludwig van Beethoven"
    )

    val students: ObservableList<Student> = FXCollections.observableArrayList(
        Student(1, "Wolfgang Amadeus", "Mozart", LocalDate.of(1756, 1, 27)),
        Student(2, "Johann Sebastian", "Bach", LocalDate.of(1685, 3, 31)),
        Student(3, "George Friedrich", "Handel", LocalDate.of(1685, 2, 23)),
        Student(4, "Ludwig van", "Beethoven", LocalDate.of(1770, 12, 1))
    )

    fun addName(fullName: String) {
        mutableNames.add(fullName)
    }

    fun addNewStudent(student: Student) {
        students.add(student)
    }

}