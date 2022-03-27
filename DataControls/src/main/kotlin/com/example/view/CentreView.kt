package com.example.view

import com.example.controller.MainController
import com.example.model.Student
import com.example.model.StudentModel
import tornadofx.*

class CentreView : View("My View") {

    private val mainController: MainController by inject()
    private val model: StudentModel by inject()

    override val root = tableview<Student> {
        items = mainController.students

        column("ID", Student::idProperty)
        column("First Name", Student::firstNameProperty)
        column("Last Name", Student::lastNameProperty)
        readonlyColumn("Age", Student::age)

//        readonlyColumn("ID", Student::id)
//        readonlyColumn("First Name", Student::firstName)
//        readonlyColumn("Last Name", Student::lastName)
//        readonlyColumn("Age", Student::age)

        bindSelected(model = model)
    }
}
