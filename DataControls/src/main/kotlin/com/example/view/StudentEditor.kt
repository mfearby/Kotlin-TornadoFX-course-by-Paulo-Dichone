package com.example.view

import com.example.controller.MainController
import com.example.model.Student
import com.example.model.StudentModel
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.time.LocalDate

class StudentEditor : View("My View") {

    val mainController: MainController by inject()
    val model: StudentModel by inject()

//    val firstName = SimpleStringProperty()
//    val lastName = SimpleStringProperty()
//    val dob = SimpleObjectProperty<LocalDate>()

    override val root = form {
        fieldset {
            field("First Name") {
                textfield(model.firstName) {  }
            }
            field("Last Name") {
                textfield(model.lastName) {  }
            }
            field("D.O.B.") {
                datepicker(model.birthday) {  }
            }
            button("Save") {
                action {
                    val student = Student(
                        id = 1,
                        firstName = model.firstName.value,
                        lastName = model.lastName.value,
                        birthday = model.birthday.value
                    )
                    mainController.addNewStudent(student)
                }
            }
        }
    }
}
