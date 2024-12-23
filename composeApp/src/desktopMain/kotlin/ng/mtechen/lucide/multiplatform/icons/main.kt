package ng.mtechen.lucide.multiplatform.icons

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Lucide Multiplatform Icons",
    ) {
        App()
    }
}