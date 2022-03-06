package com.example.view

import com.example.Styles
import com.example.controller.MainController
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.ComboBox
import javafx.scene.control.Slider
import javafx.scene.control.TextField
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    val mainController: MainController by inject()
    var splitCombo: ComboBox<Int> by singleAssign()
    var slider: Slider by singleAssign()
    var billAmount: TextField by singleAssign()

    override val root = vbox {
        alignment = Pos.TOP_CENTER
        label("Total per person") {
            addClass(Styles.heading)
        }
        label("123") {
            addClass(Styles.heading)
        }

        form {
            fieldset(labelPosition = Orientation.HORIZONTAL) {
                field("Bill Amount") {
                    maxWidth = 190.0
                    billAmount = textfield()
                }
                field("Split by") {
                    splitCombo = combobox(values = (1..10).toList()) {
                        prefWidth = 135.0
                        value = 1
                    }
                }
                field {
                    hbox(spacing = 23.0) {
                        label("Total Tip")
                        label("100")
                    }
                }
                field {
                    hbox(spacing = 5.0) {
                        label("Tip %")
                        // slider
                    }
                }
            }
        }

    }
}
