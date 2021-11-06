package com.example.view

import com.example.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    private val names =  listOf(
        "Mozart",
        "Bach",
        "Handel",
        "Beethoven"
    ).asObservable()

    override val root = hbox {

        listview<String> {
            items.addAll("One", "Two", "Three")
        }

        listview(names)
    }
}
