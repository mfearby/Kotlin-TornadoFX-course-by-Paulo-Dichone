package com.example

import com.example.view.MainView
import javafx.stage.Stage
import tornadofx.*

class MyApp: App(MainView::class, Styles::class) {

    init {
        reloadStylesheetsOnFocus()
        reloadViewsOnFocus()
    }

    override fun start(stage: Stage) {
        with(stage) {
            width = 600.0
            height = 300.0
        }
        super.start(stage)
    }
}