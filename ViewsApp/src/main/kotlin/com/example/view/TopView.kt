package com.example.view

import tornadofx.*

class TopView : View("Top View") {
    override val root = borderpane {
        center {
            label("TopView")
        }
    }
}
