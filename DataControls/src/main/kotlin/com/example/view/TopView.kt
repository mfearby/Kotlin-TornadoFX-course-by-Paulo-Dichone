package com.example.view

import com.example.controller.MainController
import tornadofx.*

class TopView : View("My View") {

    val mainController: MainController by inject()

    override val root = listview(mainController.mutableNames) {
        cellFormat {
            text = it
            if (it.contains("Bach")) {
                textFill = c("red", 0.8)
                style {
                    fontSize = 20.px
                }
            }
        }
    }
}
