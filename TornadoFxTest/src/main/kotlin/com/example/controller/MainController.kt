package com.example.controller

import javafx.beans.property.SimpleStringProperty
import tornadofx.Controller
import kotlin.random.Random

class MainController: Controller() {

    val labelText = SimpleStringProperty("")
    private val names = arrayOf("Victoria", "George", "Edward", "Elizabeth", "William", "Henry")

    fun getRandomName() {
        val index = Random.nextInt(0, names.size)
        labelText.value = names[index]
    }
}