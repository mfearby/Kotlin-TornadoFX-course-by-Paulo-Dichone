package com.example.view

import com.example.Styles
import com.example.controller.MainController
import javafx.geometry.Pos
import tornadofx.*

class MainView : View() {

    val mainController: MainController by inject()

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 10.0

        label(mainController.labelText) {
            addClass(Styles.heading)
        }

        label("hello")

        button("click me") {
            action {
                mainController.getRandomName()
            }
        }
    }
}

