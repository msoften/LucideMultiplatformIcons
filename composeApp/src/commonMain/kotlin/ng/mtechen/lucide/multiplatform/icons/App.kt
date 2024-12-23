package ng.mtechen.lucide.multiplatform.icons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {

        Column {
            Icon(
                imageVector = LucideIcons.home,
                contentDescription = "Home",
                tint = Color.Yellow,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
