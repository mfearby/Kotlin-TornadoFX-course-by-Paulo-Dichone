package com.example.view

import com.example.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = borderpane {
        top<TopView>()

        center {
            label("centre")
        }

        left {
            label("left")
        }

        right {
            label("right")
        }

        bottom {
            label("bottom")
        }
    }
}
