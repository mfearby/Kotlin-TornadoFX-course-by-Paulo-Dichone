package com.example.view

import com.example.Styles
import javafx.collections.FXCollections
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    private val names =  listOf(
        "Mozart",
        "Bach",
        "Handel",
        "Beethoven"
    ).asObservable()

    private val mutableNames = FXCollections.observableArrayList<String>(
        "Mozart",
        "Bach",
        "Handel",
        "Beethoven"
    )

    override val root = vbox {

//        listview<String> {
//            items.addAll("One", "Two", "Three")
//        }

        listview(mutableNames) {
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

        button {
            text = "Add Composer"
            action {
                mutableNames.add("Purcell")
            }
        }
    }
}
