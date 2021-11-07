package com.example.view

import com.example.controller.MainController
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    val mainController: MainController by inject()
    val bottomView: BottomView by inject()
    val topView: TopView by inject()

    override val root = borderpane() {
        top = topView.root
        bottom = bottomView.root
    }

}
