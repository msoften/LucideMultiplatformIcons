package ng.mtechen.lucide.multiplatform.icons

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {

        Column {
        // Test icons
            Icon(
                imageVector = LucideIcons.home,
                contentDescription = "Home",
                tint = Color.Yellow
            )

            Icon(
                imageVector = LucideIcons.home(size = 24, color = Color.Green),
                contentDescription = "Home",
                tint = Color.Unspecified
            )

            LucideIcons.home(size = 24, color = Color.Red)
        }
    }
}
