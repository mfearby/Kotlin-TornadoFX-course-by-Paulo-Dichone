package com.example.view

import com.example.controller.MainController
import com.example.model.Student
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.time.LocalDate

class StudentEditor : View("My View") {

    val mainController: MainController by inject()
    val firstName = SimpleStringProperty()
    val lastName = SimpleStringProperty()
    val dob = SimpleObjectProperty<LocalDate>()

    override val root = form {
        fieldset {
            field("First Name") {
                textfield(firstName) {  }
            }
            field("Last Name") {
                textfield(lastName) {  }
            }
            field("D.O.B.") {
                datepicker(dob) {  }
            }
            button("Save") {
                action {
                    val student = Student(
                        id = 1,
                        firstName = firstName.value,
                        lastName = lastName.value,
                        birthday = dob.value
                    )
                    mainController.addNewStudent(student)
                }
            }
        }
    }
}
