package com.example.view

import com.example.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    val labelText = SimpleStringProperty(title)

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 10.0

        label(title) {
            bind(labelText)
            addClass(Styles.heading)
        }

        label("hello")

        button("click me") {
//            this.text = "Click Me"
            action {
                labelText.value = "Hey there"
            }
        }
    }
}
