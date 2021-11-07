package com.example.view

import com.example.controller.MainController
import tornadofx.*

class BottomView : View("My View") {

    val mainController: MainController by inject()

    override val root = form {

        fieldset {
            field("First Name") {
                textfield("")
            }
            field("Last Name") {
                textfield("")
            }
        }

        hbox {
            button {
                text = "Add Composer"
                action {
                    mainController.mutableNames.add("Purcell")
                }
            }

        }


    }
}
