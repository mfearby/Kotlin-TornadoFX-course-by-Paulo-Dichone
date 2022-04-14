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
                textfield(model.firstName).required()
            }
            field("Last Name") {
                textfield(model.lastName) {
                    required()
                    validator {
                        if (it.isNullOrBlank()) error("Type something, dude!") else null
                    }
                }
            }
            field("D.O.B.") {
                datepicker(model.birthday).required()
            }

            hbox {
                button("Save") {
                    enableWhen(model.dirty)
                    action {
                        model.commit {
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
                button("Reset") {
                    enableWhen(model.dirty)
                    action {
                        model.rollback()
                    }
                }
            }


        }
    }
}
