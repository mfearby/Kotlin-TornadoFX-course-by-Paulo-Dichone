package com.example.view

import com.example.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    // https://edvin.gitbooks.io/tornadofx-guide/content/part2/Dependency_Injection.html

    /* If you want to declare the controller referance as a field member however,
       you should use the inject delegate instead. This is a lazy mechanism, so
       the actual instance will only be created the first time you call a function
       on the injected resource. Using inject is always prefered, as it allows
       your components to have circular dependencies.
     */
    private val topView: TopView by inject()

    /* When you call find, the component corresponding to the given class is
       looked up in a global component registry. If it did not exist prior to
       the call, it will be created and inserted into the registry before the
       function returns.
     */
    private val centreView = find(CenterView::class)


    override val root = borderpane {
        //top<TopView>()

        // lazy reference to TopView
        top = topView.root

//        center {
//            label("centre")
//        }

        

        center = centreView.root

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
