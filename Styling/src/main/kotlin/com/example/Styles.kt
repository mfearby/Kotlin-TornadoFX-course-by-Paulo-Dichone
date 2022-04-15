package com.example

import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val myStyle by cssclass()
        private val topColor = c("#ff00ff")
        private val rightColor = c(1.0, 0.5, 0.5)
        private val bottomColor = Color.KHAKI
        private val leftColor = Color.AQUA
    }

    init {
        myStyle {
            borderColor = multi(
                box(
                    top = topColor,
                    right = rightColor,
                    bottom = bottomColor,
                    left = leftColor
                )
            )
            borderWidth = multi(box(10.px))
        }

        label and heading {
            padding = box(10.px)
            fontSize = 40.px
            fontWeight = FontWeight.BOLD
            backgroundColor = multi(c("pink"))
        }
    }
}