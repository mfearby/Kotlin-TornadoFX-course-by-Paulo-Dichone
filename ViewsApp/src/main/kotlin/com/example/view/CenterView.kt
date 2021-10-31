package com.example.view

import tornadofx.*

class CenterView : View("Centre View") {
    override val root = borderpane {
        center {
            button("centre")
        }
    }
}
