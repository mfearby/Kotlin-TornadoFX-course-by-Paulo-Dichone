package com.example

import com.example.view.MainView
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        with(stage) {
            width = 640.0
            height = 480.0
        }
        super.start(stage)
    }
}