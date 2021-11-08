package com.example.view

import com.example.controller.MainController
import com.example.model.Student
import tornadofx.*

class CentreView : View("My View") {

    val mainController: MainController by inject()

    override val root = tableview<Student> {
        items = mainController.students

        readonlyColumn("ID", Student::id)
        readonlyColumn("First Name", Student::firstName)
        readonlyColumn("Last Name", Student::lastName)
        readonlyColumn("Age", Student::age)
    }
}
