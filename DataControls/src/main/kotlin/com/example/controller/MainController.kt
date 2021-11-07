package com.example.controller

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller

class MainController: Controller() {

    val mutableNames: ObservableList<String> = FXCollections.observableArrayList(
        "Wolfgang Amadeus Mozart",
        "Johann Sebastian Bach",
        "George Friedrich Handel",
        "Ludwig van Beethoven"
    )

    fun addName(fullName: String) {
        mutableNames.add(fullName)
    }

}