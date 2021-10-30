package com.example.view

import com.example.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*
import kotlin.random.Random

class MainView : View("Hello TornadoFX") {

    private val labelText = SimpleStringProperty(title)

    private val names = arrayOf("Victoria", "George", "Edward", "Elizabeth", "William", "Henry")

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 10.0

        label(title) {
            bind(labelText)
            addClass(Styles.heading)
        }

        label("hello")

        button("click me") {
            action {
                val index = Random.nextInt(0, names.size)
                labelText.value = names[index]
            }
        }
    }
}
