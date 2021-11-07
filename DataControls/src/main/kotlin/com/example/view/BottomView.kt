package com.example.view

import com.example.controller.MainController
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class BottomView : View("My View") {

    val mainController: MainController by inject()

    override val root = form {

        val firstName = SimpleStringProperty()
        val lastName = SimpleStringProperty()

        fieldset {
            field("First Name") {
                textfield(firstName)
            }
            field("Last Name") {
                textfield(lastName)
            }
        }

        hbox {
            button {
                text = "Add Composer"
                action {

                    if (firstName.value.isNullOrEmpty() || lastName.value.isNullOrEmpty()) {
                        // do nothing
                    } else {
                        val fullName = firstName.value + " " + lastName.value
                        mainController.addName(fullName)

                        firstName.value = ""
                        lastName.value = ""
                    }

                }
            }

        }


    }
}
