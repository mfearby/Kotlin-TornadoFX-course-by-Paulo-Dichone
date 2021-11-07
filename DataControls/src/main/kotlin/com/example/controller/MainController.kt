package com.example.controller

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller

class MainController: Controller() {

    val mutableNames: ObservableList<String> = FXCollections.observableArrayList(
        "Mozart",
        "Bach",
        "Handel",
        "Beethoven"
    )


}