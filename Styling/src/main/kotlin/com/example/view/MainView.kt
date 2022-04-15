package com.example.view

import com.example.Styles
import javafx.scene.layout.Border
import javafx.scene.paint.Color
import javafx.scene.text.Font
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
            textFill = Color.BLUEVIOLET
        }
        label("Another Test").addClass(Styles.myStyle)
        button("Testing") {
            font = Font.font("Courier New")
            style {
                fontSize = 30.px
                borderColor = multi(box(c("red")))
            }
        }
    }
}
